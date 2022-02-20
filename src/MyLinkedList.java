import org.w3c.dom.Node;

public class MyLinkedList {
    private Node head;
    private Node tail;
    private static int numbNodes;

    public MyLinkedList(Object HeadData){
        head = new Node(HeadData);
    }
    private class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data=data;
        }

        public Object getData() {
            return data;
        }
    }
    public void add(int index,Object data){
        Node temp = head;
        Node holder;
        if(temp==null||index==0){
            addFirst(data);
        }else if(index>=numbNodes){
            addLast(data);
        }else {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            holder = temp;
            temp = new Node(data);
            temp.next = holder;
            numbNodes++;
        }
    }
    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numbNodes++;
    }
    public void addLast(Object data){
        Node temp = head;
        if(temp==null){
            addFirst(data);
        }else {
            for (int i = 0; i < numbNodes; i++) {
                temp = temp.next;
            }
            temp.next=new Node(data);
            numbNodes++;
        }
    }
    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }
    public void printList(){
        Node temp = head;
        do{
            System.out.println(temp.data);
            temp=temp.next;
        }
        while (temp!=null);
    }
}
