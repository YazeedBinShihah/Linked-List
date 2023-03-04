public class CharNode <E>{
private E item;
private CharNode<E> next;

    public CharNode() {
        this.item =null;
        this.next = null;
    }

    public CharNode(E item, CharNode<E> next) {
        this.item = item;
        this.next = next;
    }
    
 
    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public CharNode getNext() {
        return next;
    }

    public void setNext(CharNode next) {
        this.next = next;
    }

}
