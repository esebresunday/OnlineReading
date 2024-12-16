import java.util.*;
import java.io.*;
// to create a book, you need to put the pages in arraylist,and put the title of the book
class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        ArrayList<String> chelsea = new ArrayList<>();
        chelsea.add("page 1");
        chelsea.add("page 2");
        chelsea.add("page 3");
        chelsea.add("page 4");
        //System.out.println(chelsea);
        Book b = new Book("Bush",chelsea);
        ArrayList<String> story = new ArrayList<>();
        story.add("The girl cat");
        story.add("Alice and the pretty mouse");
        Book bs = new Book("Alice",story);
        //System.out.println(b);
        Library l = new Library();
        l.addBook(b);
        l.addBook(bs);
        System.out.println(l);
        //I want to see the books in my Library
        l.display();
        l.noOfBooks();
    }
}
class Book
{
    String title;
    ArrayList<String> list;
    int noOfPage;
    Book(String title, ArrayList<String> list)
    {
        this.title = title;
        this.list = list;
    }
    public String toString()
    {
        noOfPage = list.size();
        return "title:"+title+"..."+"pages:"+noOfPage+"..."+"content:"+list;
    }
}
class Library
{
    Book bk;
    ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book bk)
    {
        books.add(bk);
    }
    public String toString()
    {
        return books+"";
    }
    public void display() // to print out the number of books in the library
    {
        for (Book b : books)
        {
            System.out.println(b);
        }
    }
    public void noOfBooks() //to print the number of books in the library
    {
        int count = books.size();
        System.out.println("The number of books in your library is:"+count);
    }
}