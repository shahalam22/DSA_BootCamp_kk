//https://www.codewithharry.com/videos/java-tutorials-for-beginners-51/

import java.util.ArrayList;
import java.util.Objects;

public class practice6 {

    static class Book{
        String name;
        String author;
        String issuedTo;
        int numOfCopy;

        public Book(){
            this.name = "none";
            this.author = "none";
            this.issuedTo = "none";
            this.numOfCopy = 0;
        }
        public Book(String name, String author, String issuedTo, int numOfCopy){
            this.name = name;
            this.author = author;
            this.issuedTo = issuedTo;
            this.numOfCopy = numOfCopy;
        }
    }

    static class Library{
        ArrayList<Book> list = new ArrayList<>();
        ArrayList<Book> issueList = new ArrayList<>();

        public void addBook(String name, String author, int numOfCopy){
            Book b = new Book(name, author, "none", numOfCopy);
            this.list.add(b);
            System.out.println("New book added. Name: "+name);
        }

        public void issueBook(String name, String issueTo){
            for (Book book : list) {
                if (Objects.equals(book.name, name) && book.numOfCopy != 0) {
                    book.numOfCopy--;
                    issueList.add(new Book(book.name, book.author, issueTo, 1));
                    System.out.println(name + " has been issued to " + issueTo);
                    return;
                }
            }
            System.out.println("Sorry!! this book is unavailable");
        }

        public void returnBook(String name, String issueTo){
            Book bok1 = new Book();

            for (Book book : issueList) {
                if (Objects.equals(book.name, name) && Objects.equals(book.issuedTo, issueTo)) {
                    bok1 = book;
                }
            }
            for (Book book : list) {
                if (Objects.equals(book.name, bok1.name)) {
                    book.numOfCopy++;
                    System.out.println(name + " has been returned by " + issueTo);
                    issueList.remove(bok1);
                    return;
                }
            }
            list.add(new Book(bok1.name, bok1.author, "none", 1));
        }

        public void showAvailableBook(){
            System.out.println("Available books are: ");
            for (Book book : list) {
                System.out.println("Name : " + book.name);
                System.out.println("Author : " + book.author);
                System.out.println("Number of available copy : " + book.numOfCopy);
                System.out.println();
            }
        }

        public void showIssuedBook(){
            System.out.println("Issued books are: ");
            for (Book book : issueList) {
                System.out.println("Name : " + book.name);
                System.out.println("Author : " + book.author);
                System.out.println("Issued to : " + book.issuedTo);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Library lib1 = new Library();
        lib1.addBook("Prothoma", "prothom alo", 5);
        lib1.addBook("Kishor alo", "prothom alo", 5);
        lib1.addBook("Current Affairs", "kaler kontho", 5);
        //lib1.showAvailableBook();
        lib1.issueBook("Prothoma", "sadeq ali khan");
        lib1.issueBook("Prothoma", "jubayer islam");
        lib1.issueBook("Current Affairs", "keramot ali");

        lib1.showIssuedBook();
        //lib1.showAvailableBook();
        lib1.returnBook("Prothoma", "jubayer islam");
        lib1.showIssuedBook();
        lib1.showAvailableBook();
    }
}