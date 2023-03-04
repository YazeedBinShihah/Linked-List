public abstract class Store {

    protected String storeName;
    protected ShoppingCart customerCart = new ShoppingCart();
    protected SinglyLinkedList<Item> StoreProducts = new SinglyLinkedList<Item>();
    public abstract void readProduct(String fileName) throws Exception;

    public abstract void viewProduct();

    public Item searchByID(String id) {//Big O(n)
        StoreProducts.moveToStart();
        for (int i = 0; i < StoreProducts.size(); i++) {
            if (StoreProducts.getValue().getId().equalsIgnoreCase(id))
                return StoreProducts.getValue();
            StoreProducts.next();
        }
        return null;
    }

}
