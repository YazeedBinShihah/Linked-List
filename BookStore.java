import java.nio.file.Paths;
import java.util.Scanner;
import javafx.geometry.Side;

public class BookStore extends Store {

    
    private static Scanner input;
    
    

    public BookStore(String storeName) {
        this.storeName=storeName;
        try {
            readProduct("Books.txt");
        } catch (Exception ex) {
            System.out.println("Failed to read from the file.");
        }
    }
@Override
    public void readProduct(String fileName) throws Exception {//B(n)
        input = new Scanner(Paths.get(fileName));
        input.nextLine();
        while (input.hasNext()) {
                StoreProducts.addLast( new Book(input.next(), input.next(), input.next(), input.nextInt(),
                        input.nextDouble()));
        }
        input.close();       
            }
    

    @Override
    public void viewProduct() {//B(n)
        StoreProducts.moveToStart();
                
        System.out.println("\nID \tTitle \tAuthor \tQuantity \tPrice\n");
        
        for (int i = 0; i < StoreProducts.size(); i++) {
            Book book = (Book) StoreProducts.getValue();
            System.out.printf("%s \t%s \t%s \t%d \t%.2f%n", book.getId(), book.getTitle(), book.getAuthor(),
                    book.getQuantity(), book.getPrice());
            StoreProducts.next();
        }

    }

 
    public boolean searchByTitle(String title) {
        StoreProducts.moveToStart();
        for (int i = 0; i < StoreProducts.size(); i++) {
            if (((Book)StoreProducts.getValue()).getTitle().equalsIgnoreCase(title))
                return true;
            StoreProducts.next();
        } 
        return false;
    }



    public static void main(String[] args) {
SinglyLinkedList<Integer> list=new SinglyLinkedList();
list.addSorted(4);
list.addSorted(5);
list.addSorted(1);
list.addSorted(9);
list.addSorted(3);
list.addSorted(8);
list.addSorted(2);
list.addSorted(7);
list.addSorted(6);
list.addSorted(10);
list.print();
        
        
    }
    public static void DeletSecond(SinglyLinkedList list){//B(1)
        if(list.size()< 2){
            System.out.println("Insufficient items !");
        }else{
            String str = (String) list.removeFirst();
            list.removeFirst();
            list.addFirst(str);
        }
    }
    
}
