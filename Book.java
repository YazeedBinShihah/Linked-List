public class Book extends Item {

    private String title, author;

    public Book(String id, String title, String author,int quantity,double price) {
        super(id, price, quantity);
        this.title = title;
        this.author = author;
    }

    public String getTitle() {//B(1)
        return title;
    }

    public void setTitle(String title) {//B(1)
        this.title = title;
    }

    public String getAuthor() {//B(1)
        return author;
    }

    public void setAuthor(String author) {//B(1)
        this.author = author;
    }

    @Override
    public String toString() {//B(1)
        return String.format("Book -> %s ,Title= %s ,Author= %s %n",super.toString(),title,author);
    }
    

    
}