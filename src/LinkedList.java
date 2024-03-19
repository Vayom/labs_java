public class LinkedList {

    // Вложенный класс для узла списка
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Головной узел списка
    private int size;  // Размер списка

    // Конструктор для создания пустого списка
    public LinkedList() {
        head = null;
        size = 0;
    }

    // Метод для добавления элемента в конец списка
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // Метод для удаления элемента из списка по значению
    public void remove(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            size--;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    // Метод для удаления элемента из списка по позиции
    public void removeAt(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        if (position == 0) {
            head = head.next;
            size--;
            return;
        }

        Node current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }

        current.next = current.next.next;
        size--;
    }

    // Метод для получения элемента из списка по позиции
    public int get(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        Node current = head;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }

        return current.data;
    }

    // Метод для получения размера списка
    public int size() {
        return size;
    }

    // Метод для проверки пустоты списка
    public boolean isEmpty() {
        return size == 0;
    }

    // Метод для печати содержимого списка
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
