class Movie{
    String name,rating;
    Movie(String movie,String rate){
        name=movie;rating=rate;
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
