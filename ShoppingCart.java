public class ShoppingCart {

    
    private SinglyLinkedList<Item> items=new SinglyLinkedList<>();
    

    public void addItem(Item item1) {//B(1)
       items.addLast(item1);
    }

    public boolean  removeItem(String itemId) {//B(n^2)
items.moveToStart();
for(int i=0 ; i <items.size() ; i++){
    if(items.getValue().getId().equals(itemId)){
        items.remove(i);
        return true;
    }
    items.next();
    }
System.out.println("I cann't found itemId");
return false;
   
}
    public void viewItems() {//B(n)
        System.out.println(toString());
    }

    @Override
    public String toString() {//B(n)
        String cartItems = "There are " + items.size() + " item(s) in your cart.\n";
        items.moveToStart();
        for (int i = 0; i < items.size(); i++) {
           cartItems+=items.getValue()+" ";
           items.next();
        }
        return cartItems;
    }

    public int getItemCount() {//B(1)
        return items.size();
    }

}
