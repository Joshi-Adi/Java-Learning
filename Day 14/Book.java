class Book{
    String title,author;
    Book(String bookTitle,String bookAuthor){
        title=bookTitle;author=bookAuthor;
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
