
import java.util.*;
class book{
     public String name;
    public String author;
    public book(String n,String a)
    {
        name=n;
        author=a;
    }

}
class library{
     List<book> books;
    public void entry(List<book> b)
    {
        books=b;
    }
    public List<book> getbooks(){

        return books;
    }

}
public class Main {
    public static void main(String[] args) {
        book b1=new book("book1","nagulan" );
        book b2=new book("book2","nagulan 2");
        book b3=new book("book 3","nagulan 3");
        library l=new library();
        List<book> lbooks=new ArrayList<>();
        lbooks.add(b1);
        lbooks.add(b2);
        lbooks.add(b3);
        l.entry(lbooks);
        List<book> fbooks=l.getbooks();
        for(book b:fbooks)
        {
            System.out.println(b.name+" "+b.author);
        }

    }
}