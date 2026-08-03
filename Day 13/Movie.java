import java.util.*;
class Movie{
    String name,rating;
    void display(){
        System.out.println(name+" "+rating);
    }
}
class Main {
    public static void main(String[] args) {
        Movie m=new Movie();
        m.name="spiderman";m.rating="5/5";
        m.display();
    }
}
