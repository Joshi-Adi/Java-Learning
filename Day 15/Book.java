class Book{
    String title,author;
    Book(String title,String author){
        this.title=title;this.author=author;
    }
    void display(){
        System.out.println("Title "+title+"\nAuthor "+author);
    }
}
class Main {
    public static void main(String[] args) {
        Book b=new Book("maths","RF");
        b.display();
    }
}
