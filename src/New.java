import java.util.*;
class New {
    public static void main(String[] args) throws InterruptedException
    {
        Book b = new Book();
        b.add("This is the wild cat");
        b.add("The day of reckoning is upon us");
        b.add("Never let the dying man go");
        Book bk = new Book();
        bk.add("I will leave in the shortest way I can");
        bk.add("This is it");
        Library lb = new Library();
        lb.addBook("The Moon", b);
        lb.addBook("Lion", bk);
        System.out.println(lb);
        lb.getBooks();
        lb.read("james and the goat");
        lb.read("The Moon");
        //System.out.println(bk);
        //System.out.println(b);

    }
}
class Book
{
    ArrayList<String> list = new ArrayList<>();
    public void add(String s)
    {
        list.add(s);
    }
    public String toString()
    {
        return list+"";
    }
    public ArrayList toArray()
    {
        return list;
    }
}
class Library
{
    HashMap<String, Book> hash = new HashMap<>();
    public void addBook(String title, Book book)
    {
        hash.put(title, book);
    }
    public String toString()
    {
        return hash+"";
    }
    public void getBooks()
    {
        System.out.println(hash.keySet());
    }
    public void read(String title) throws InterruptedException
    {
        if (hash.containsKey(title))
        {
            Book br = (Book)hash.get(title);
            //System.out.println(br);
            System.out.println("I want to begin to read your book");
            Thread.sleep(2000);
            ArrayList ls = br.toArray();
            Object[] re = ls.toArray();
            for (Object s : re)
            {
                System.out.println(s);
                Thread.sleep(2000);
            }
        }
        else
        {
            System.out.println("Book with title: " +title+ " not found in your Library");
        }
    }
}