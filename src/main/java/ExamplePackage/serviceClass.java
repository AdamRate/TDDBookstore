package ExamplePackage;

import java.util.HashMap;
import java.util.Map;

public class serviceClass {
    private int ID;
    private Map<Integer, Book> bookMap;

    public String func1() {
        return "Test";
    }

//    public int listBooks(){
//        return 0;
//    }

    public void init() {
        this.bookMap = new HashMap<Integer, Book>();
        ID = 0;
        addDefaultBook();
        System.out.println("Init complete");
    }

    public void addDefaultBook() {
        addNewBook("Test Author", "Test Title", "history", "1995");
    }

    public void addNewBook(String author, String title, String genre, String yearPublished) {
        ID++;
        Book newBook = new Book(author, title, genre, yearPublished);
        bookMap.put(ID, newBook);
    }

    public int getBookMapSize() {
        return bookMap.size();
    }

    public int countBookType(String genre) {
int z = 0;
        for (int i =1; i < bookMap.size()+1; i++){
            Book b = bookMap.get(i);
            String gotGenre = b.getGenre();

            if (gotGenre == genre){
                z++;
            }
        }

        return z;
    }
}
