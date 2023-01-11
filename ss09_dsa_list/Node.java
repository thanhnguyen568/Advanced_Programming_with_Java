package ss9_dsa_list;

public class Node {
    public Node next;
    private Object data;

    Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
