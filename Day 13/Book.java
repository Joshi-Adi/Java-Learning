import java.util.*;
class Book{
    String title,author;
    void display(){
        System.out.println(title+" "+author);
    }
}
class Main {
    public static void main(String[] args) {
        Book b=new Book();
        b.title="Jungle Book";b.author="me";
        b.display();
    }
}
