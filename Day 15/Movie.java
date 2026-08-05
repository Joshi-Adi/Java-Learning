class Movie{
    String name,rating;
    Movie(String name,String rating){
        this.name=name;this.rating=rating;
    }
    void display(){
        System.out.println(name+" "+rating);
    }
}
class Main {
    public static void main(String[] args) {
        Movie m=new Movie("DEll","1");
        m.display();
    }
}
