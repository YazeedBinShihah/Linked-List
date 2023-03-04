package lab3part2_ex2;
public class DNode<E> {
   private E Element;
   private DNode<E> next;
   private DNode<E> prev;
    public DNode(){
        next = null;
        prev = null;
    }
    
   
    public DNode(E item){
        this.Element = item;
        this.next = null;
        this.prev = null;
    }

    DNode(Object object, Object object0, Object object1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public E getElement(){
        return Element;
    }
    public DNode getNext(){
        return next;
    }
    public DNode getPrev(){
        return prev;
    }
    public void setElement(E item){
        this.Element = item;
    }
    public void setNext(DNode next){
        this.next = next;
    }
    public void setPrev(DNode prev){
        this.prev = prev;
    }
}
