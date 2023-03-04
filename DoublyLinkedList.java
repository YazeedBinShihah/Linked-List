package lab3part2_ex2;


public class DoublyLinkedList<E> {


    private static class Node<E> {

        private E element;    
        private Node<E> prev; 
        private Node<E> next; 

        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }

        private Node() {
        }

        public E getElement() {
            return element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setPrev(Node<E> p) {
            prev = p;
        }

        public void setNext(Node<E> n) {
            next = n;
        }

    } 


    private Node<E> header; 
    private Node<E> trailer; 
    private int size = 0; 

    public DoublyLinkedList() {
        header = new Node<>(null, null, null);  
        trailer = new Node<>(null, header, null); 
        header.setNext(trailer); 
    }


    public int size() { 
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() { 
        if (isEmpty()) {
            return null;
        }
        return header.getNext().getElement(); 
    }

    public E last() { 
        if (isEmpty()) {
            return null;
        }
        return trailer.getPrev().getElement(); 
    }


    public void addFirst(E e) { 
        addBetween(e, header, header.getNext()); 
    }

    public void addLast(E e) {
        addBetween(e, trailer.getPrev(), trailer); // place just before the trailer
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null; 
        }
        return remove(header.getNext()); 
    }

    public E removeLast() {
        if (isEmpty()) {
            return null; 
        }
        return remove(trailer.getPrev()); 
    }


    private void addBetween(E e, Node<E> predecessor, Node<E> successor) {  // create and link a new node
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }

    private E remove(Node<E> node) { 
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        return node.getElement();
    }

    public void print() {
        if (isEmpty()) {
            return;
        }
        Node<E> curr = header.getNext();
        while (curr != trailer) {
            System.out.print(curr.getElement() + "  ");
            curr = curr.next;
        }
        System.out.println("");
    }

    public void printrevers() {
        if (isEmpty()) {
            return;
        }
        Node<E> curr = this.trailer.getPrev();
        while (curr != header) {
            System.out.print(curr.getElement() + "  ");
            curr = curr.prev;
        }
        System.out.println("");
    }
    

    public void swapNode(int x, int y) {
        if (header.getNext() == null || header.getNext().getNext() == null) {
            return;
        }
        Node temp1 = header;
        Node temp2 = header;
        while ((Integer) temp1.getNext().getElement() != x) 
        {
            temp1 = temp1.next;
        }
        while ((Integer) temp2.getNext().getElement() != y) {
            temp2 = temp2.getNext();
        }

        Node p1 = temp1.getNext();
        Node p2 = temp2.getNext();

        temp1.setNext(p1.getNext());
        p1.getNext().setPrev(temp1);

        temp2.setNext(p2.getNext());
        p2.getNext().setPrev(temp2);

        p2.setNext(temp1.getNext());
        temp1.getNext().setPrev(p2);

        p1.setNext(temp2.getNext());
        temp2.getNext().setPrev(p1);

        p1.setPrev(temp2);
        temp2.setNext(p1);

        p2.setNext(temp1.getNext());
        temp1.getNext().setPrev(p2);

        p2.setPrev(temp1);
        temp1.setNext(p2);


    }
  public void DeleteLastElement(){
  if(this.isEmpty())
      return;
  Node curr=header.next;
  while(curr.next!=this.trailer)
      curr=curr.next;
  
  curr.next.prev=curr.prev;
  curr.prev.next=curr.next;
   
  } 



  


    public boolean palindrome() {

        if (header.getNext() == null) {
            return false;
        }
        if (header.getNext() == trailer.getPrev()) {
            return true;
        }
      

        Node first = header.getNext();
        Node last = trailer.prev;

     
        while (first.getNext() != last) {
             
            
            if (first.getElement() != last.getElement()) {
                return false;
            }
           

            if (first.getNext() != last)
            {
                first = first.next;
            }

            if (last.getPrev() != first)
            {
                last = last.prev;
            }
        }

      
        if (size % 2 == 0) {
            if (first.getElement() != last.getElement()) {
                return false;
            }
        }
     
        return true;
    }//    

    public E Mid() {
        if (header.getNext() == null) {
            return null;
        }

        if (header.getNext() == trailer.getPrev()) {
            return header.getNext().getElement();
        }

     
        Node first = header.getNext();
        Node last = trailer.getPrev();
        
        while (first.getNext() != last) {

            if (first.getNext() != last)
                 first = first.next;
            
            if (last.getPrev() != first)
                 last = last.prev;
            
        }  

        return (E) first.getElement();
    }
public void PairSwap(){
 if(isEmpty()|| header.getNext() == trailer.getPrev())
     return ;

 Node temp = header.getNext();
 int count;
 while(temp.getNext() != trailer  && temp != trailer){
  E item = (E) temp.getElement();  
  temp.element=temp.getNext().getElement();
  temp.getNext().element=item;
  temp=temp.getNext().getNext();
     
     
     
     
     
     
 }
 
 
}
    
 public void Move(int s , int e, int p){
Node <E> te;
Node <E> ts;
Node <E> tm;
Node <E> tp;


     if(s<0 || e<0 || p<0)
         return;
     if(s> size || e> size || p> size)
         return ;
     if(e<s)
         return;
     if(p>= s && p<= e)
         return;
ts=te=tp=header.next;
for(int i=0 ; i<s ; i++)
    ts=ts.getNext();
for(int i=0 ; i<e ; i++)
    te=te.getNext();
for(int i=0 ; i<p ; i++)
    tp=tp.getNext();


ts.prev.next=te.next;
te.next.prev=ts.prev;

tm=tp.prev;
tm.next=ts;
ts.prev=tm;

te.next=tp;
tp.prev=te;


     
 }   
 public void Between(){
     if(isEmpty())
         return;
     if(size < 3)
         return;
     
      Node temp=header.next;
     while(temp.next != trailer){
      if(temp.element == temp.next.next.element)
          System.out.println(temp.next.element);
     temp= temp.next;
     }
     
 }   
 
    
} 
