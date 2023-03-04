public abstract class Item {

    private final String id;
    private double price;
    private int quantity;

    public Item(String id, double price, int quantity) {
        this.id = id;
        this.setPrice(price);
        this.setQuantity(quantity);
    }

    public String getId() {//B(1)
        return id;
    }

    public int getQuantity() {//B(1)
        return quantity;
    }

    public void setQuantity(int quantity) {//B(1)
        this.quantity = quantity;
    }

    public double getPrice() {//B(1)
        return price;
    }

    public void setPrice(double price) {//B(1)
        this.price = price;
    }

    @Override
    public String toString() {//B(1)
        return String.format("ID= %s , Price= %.2f , Quantity= %d",id ,price ,quantity );
    }

}