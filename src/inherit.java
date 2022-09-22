//example of composition

import java.util.ArrayList;

class Book{
    String author;
    String title;
    Book(String title, String author){
        this.author = author;
        this.title = title;
    }
}

class Library{
    private ArrayList<Book> book = new ArrayList<Book>();
    Library(ArrayList<Book> book){
        this.book = book;
    }
    public ArrayList<Book> getBooks(){
        return book;
    }

}


public class inherit {
    public static void main(String[] args) {
        Book bookObj1 = new Book("ABC","ABC");
        Book bookObj2 = new Book("XYZ","XYZ");

        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(bookObj1);
        bookList.add(bookObj2);

        Library lib = new Library(bookList);

        ArrayList<Book> bookList1 = new ArrayList<>();
        bookList1 = lib.getBooks();

        for(Book bk:bookList1){
            System.out.println(bk.title + " : " + bk.author);
        }

    }
}




