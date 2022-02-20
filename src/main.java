public class main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(10);
        list.addFirst(11);
        list.addFirst(true);
        list.addFirst(13.1f);

        list.add(4,"string");
        list.add(5,9);
        list.printList();
    }
}
