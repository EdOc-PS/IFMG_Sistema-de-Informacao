import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.exception.ZipException;

import java.io.File;
import java.util.List;
import java.util.Objects;

public class TesteAbrirFilePassword {

    public static ZipFile zipFile;
    public static final int startAscii = 33;
    public static final int endAscii = 126;
    
    //caminho absoluto da pasta
    public static final String caminho = "C:\\Users\\eeuar\\Downloads\\projeto e arquivos para o problema da senha\\senha\\arquivosTP\\";

    public static boolean testaSenha(String senha) {
        //necessário trocar o nome do arquivo de maneira iterativa
        ZipFile zipFile = new ZipFile(new File(caminho + "doc5.zip"));
        try {

            //encriptado?
            if (zipFile.isEncrypted()) {
                zipFile.setPassword(senha.toCharArray());

            }
            List fileHeaderList = zipFile.getFileHeaders();

            for (int i = 0; i < fileHeaderList.size(); i++) {
                FileHeader fileHeader = (FileHeader) fileHeaderList.get(i);
                //onde você deseja extrair (neste caso no mesmo caminho)
                zipFile.extractFile(fileHeader, caminho);
                System.out.println("Encontramos a senha e o arquivo: " + senha);
                return true;
            }

        } catch (ZipException ex) {
            //erro na extração do arquivo
            return false;
        }

        return false;
    }

    public static boolean generatePassword(int numbChar) {
        String senha = "";
        do {
            if (numbChar == 1) {
                for (int i = startAscii; i <= endAscii; i++) {
                    if (!Objects.equals(senha, "")) senha = "";
                    senha = String.valueOf((char) i);
                    System.out.println(senha);
                    if (testaSenha(senha)) {
                        break;
                    }
                }
                return generatePassword(1 + numbChar);
            }
            if (numbChar == 2) {
                for (int i = startAscii; i <= endAscii; i++) {
                    for (int j = startAscii; j < endAscii; j++) {
                        if (!Objects.equals(senha, "")) senha = "";
                        senha = String.valueOf((char) i);
                        senha += String.valueOf((char) j);
                        System.out.println(senha);
                        if (testaSenha(senha)) {
                            break;
                        }
                    }
                }
                return generatePassword(1 + numbChar);
            }

            if (numbChar == 3) {
                for (int i = startAscii; i <= endAscii; i++) {
                    for (int j = startAscii; j <= endAscii; j++) {
                        for (int k = startAscii; k <= endAscii; k++) {
                            if (!Objects.equals(senha, "")) senha = "";
                            senha = String.valueOf((char) i);
                            senha += String.valueOf((char) j);
                            senha += String.valueOf((char) k);
                            System.out.println(senha);
                            if (testaSenha(senha)) {
                                break;
                            }
                        }
                    }
                }
                return false;
            }
        } while (true);
    }

    public static void main(String[] args) {
        int maxPasswordLength = 3;
        for (int i = 1; i <= maxPasswordLength; i++) {
            if (generatePassword(i)) {
                break;
            }
        }
    }
}