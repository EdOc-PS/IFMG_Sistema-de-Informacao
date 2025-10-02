from flask import Flask, request, jsonify
from flask_cors import CORS
from pymongo import MongoClient

app = Flask(__name__)
CORS(app) 


client = MongoClient("mongodb+srv://eduardo:123abc123@user-server.yc55azr.mongodb.net/?retryWrites=true&w=majority&appName=user-server")
db = client["user-server"]
collection = db["records"]

@app.route("/", methods=["GET"])
def query_records():
    name = request.args.get("name")
    record = collection.find_one({"name": name}, {"_id": 0}) 
    if not record:
        return jsonify({"message": f"Usuário {name} não encontrado"}), 404
    
    return jsonify({
        "message": f"Foi encontrado o usuário {record['name']} com o email {record['email']}"
    }), 200


@app.route("/", methods=["POST"])
def create_record():
    data = request.get_json()
    collection.insert_one(data)
    return jsonify({
        "message": f"Foi criado o usuário {data['name']} com o email {data['email']}"
    }), 201


@app.route("/", methods=["PUT"])
def update_record():
    data = request.get_json()
    result = collection.update_one({"name": data["name"]}, {"$set": {"email": data["email"]}})

    if result.matched_count == 0:
        return jsonify({"message": f"Usuário {data["name"]} não encontrado"}), 404
    
    return jsonify({"message": f"O usuário {data['name']} com o email {data['email']} foi atualizado!"}), 200

@app.route("/", methods=["DELETE"])
def delete_record():
    data = request.get_json()
    result = collection.delete_one({"name": data["name"]})

    if result.deleted_count == 0:
        return jsonify({"message": f"Usuário {data["name"]} não encontrado"}), 404
    
    return jsonify({"message": "Deletado com sucesso!"}), 200

if __name__ == "__main__":
    app.run(debug=True)
