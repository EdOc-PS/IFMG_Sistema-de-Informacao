package listaencadeada;

/**
 * @author eeuar
 */
class LinkedList<E> {

    private Item<E> lista;
    private int size;

    public LinkedList() {
        lista = null;
    }

    public Item<E> getLista() {
        return lista;
    }

    public int getSize() {
        return size;
    }

    public void addHead(E item) {
        if (lista == null) {
            lista = new Item<E>(item, null);

        } else {
            Item<E> novoItem = new Item<E>(item, lista);
            lista = novoItem;
        }
        size++;
    }

    public void addTail(E item) {
        if (lista == null) {
            lista = new Item<E>(item, null);
        } else {
            Item<E> ponteiro = lista;
            for (; ponteiro.proximo != null; ponteiro = ponteiro.proximo) {
            }
            ponteiro.proximo = new Item<E>(item, null);
        }
        size++;
    }

    public boolean elementExist(E item) {
        if (lista == null) {
            return false;
        }
        Item<E> ponteiro = lista;
        do {

            if (ponteiro.elemento == item) {
                return true;
            }
            ponteiro = ponteiro.proximo;
        } while (ponteiro != null);

        return false;

    }

    public void printLinkedList() {
        Item<E> ponteiro = lista;
        for (; ponteiro != null; ponteiro = ponteiro.proximo) {
            System.out.print(ponteiro.elemento+" ");
        }
        System.out.println("");
    }

    public static class Item<T> {

        T elemento;
        Item<T> proximo;

        Item(T item, Item<T> prox) {
            elemento = item;
            proximo = prox;
        }
    }

    public void removeItem(E item) {
        if (lista != null) {
            if (lista.elemento.equals(item)) {
                lista = lista.proximo;
                size--;
                return;
            }

            Item<E> ponteiro = lista;
            while (ponteiro.proximo != null) {
                if (ponteiro.proximo.elemento.equals(item)) {
                    ponteiro.proximo = ponteiro.proximo.proximo;
                    size--;
                    return;
                }
                ponteiro = ponteiro.proximo;
            }
        } else {
            return;
        }
    }

    public void mergeLista(LinkedList<E> listB) {
        if (this.lista == null) {
            this.lista = listB.lista;
        } else {
            Item<E> conteudo = this.lista;
            while (conteudo.proximo != null) {
                conteudo = conteudo.proximo;
            }
            conteudo.proximo = listB.lista;
        }
        this.size = this.size + listB.size;
        listB.lista = null;
        listB.size = 0;
    }

    public boolean compareLista(LinkedList<E> outraL) {
        if (this.size != outraL.size) {
            return false;
        }

        Item<E> listaA = this.lista;
        Item<E> listaB = outraL.lista;

        while (listaA != null && listaB != null) {
            if (!listaA.elemento.equals(listaB.elemento)) {
                return false;
            }
            listaA = listaA.proximo;
            listaB = listaB.proximo;
        }

        return true;
    }

}
