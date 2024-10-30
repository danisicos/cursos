// Classe que representa um nó da lista duplamente encadeada
class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

// Classe que representa a lista duplamente encadeada
class DoublyLinkedList {
    Node head;  // Primeiro nó da lista

    // Método para inserir um nó no final da lista
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {  // Caso a lista esteja vazia
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    // Método para remover um nó específico da lista
    public void deleteNode(int data) {
        if (head == null) {  // Lista vazia
            return;
        }

        Node current = head;

        // Encontrar o nó a ser removido
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {  // Nó não encontrado
            return;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {  // Remover o primeiro nó
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    // Método para exibir os elementos da lista
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Classe principal para testar a lista duplamente encadeada
public class ListaDupla {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Inserindo elementos
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);

        System.out.print("Lista após inserções: ");
        list.display();

        // Removendo um elemento
        list.deleteNode(20);
        System.out.print("Lista após remover 20: ");
        list.display();
    }
}