public class CLList <E>{
CharNode<E> tail; 
CharNode<E> temp;
int count;

    public CLList() {
        tail= null;
    }

public void addFrist(E data){
    CharNode n=new CharNode(data , null);
    if(tail== null){
        tail=n;
    tail.setNext(tail);
    }else{
        n.setNext(tail.getNext());
        tail.setNext(n);
    }
    count++;
        
}

public void addLast(E data){
    CharNode n=new CharNode(data , null);
    if(tail== null){
        tail=n;
    tail.setNext(tail);
    }else{
       n.setNext(tail.getNext());
       tail.setNext(n);
       tail=n;
    }
        count++;

    }
public void removeFrist(){
    if(tail == null)
        return;
    if(tail == tail.getNext()){
        tail= null;
    }else{
        tail.setNext(tail.getNext().getNext());
    }
        count--;

}
public void removeLast(){
    if(tail == null)
        return;
      if(tail == tail.getNext()){
        tail= null;
      }else{
       temp=tail;
      while(temp.getNext()!=tail){
          temp=temp.getNext();
      }
      temp.setNext(tail.getNext());
      tail=temp;
      }
              count--;

}
public void print(){
    if(tail==null){
        return;
    }
    temp=tail.getNext();
    while(temp != tail){
        System.out.println(temp.getItem());
        temp=temp.getNext();
    }
  System.out.println(tail.getItem());
}
public CLList reverse(){
    if(tail == null)
        return null;
   CLList<E> rev = new CLList<>();
   temp=tail.getNext();
  while(temp != tail){
      rev.addFrist(temp.getItem());
      temp=temp.getNext();
  }
  rev.addFrist(tail.getItem());
return rev;
}
public CLList oddIndex(){
    if(tail== null){
        return null;
    }
    temp=tail.getNext().getNext();
    CLList oddIndex = new CLList();
if(count % 2 ==0){
    while(temp != tail){
    oddIndex.addLast(temp.getItem());
    temp=temp.getNext().getNext();
    }
    oddIndex.addLast(tail.getItem());
}else{
    while(temp.getNext() != tail){
    oddIndex.addLast(temp.getItem());
    temp=temp.getNext().getNext();
}
   oddIndex.addLast(temp.getItem()); 
}
return oddIndex;
}

public void removeEvenIndexes(){
    CharNode n= new CharNode();
  temp=tail.getNext().getNext();
  tail.setNext(temp);
  n=temp;
    if(count % 2 ==0){
        while(temp != tail){
        temp.setNext(temp.getNext().getNext());
        temp=temp.getNext();    
    }}else{
        while(temp.getNext() != tail){
        temp.setNext(temp.getNext().getNext());
        temp=temp.getNext();
            }
        tail=temp;
        tail.setNext(n);
        
    }
} 
}