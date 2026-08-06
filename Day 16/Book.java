class Book{
    private String title,author;
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setTitle(String title){
        if(title!=null && !title.trim().isEmpty()){
            this.title=title;
        }else{
            System.out.println("Error");
        }
    }
    public void setAuthor(String author){
        if(author!=null && !author.trim().isEmpty()){
            this.author=author;
        }else{
            System.out.println("Error");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Book s=new Book();
        s.setTitle("main");
        s.setAuthor("me");
        System.out.println(s.getTitle()+" "+s.getAuthor());
        s.setTitle("");
    }
}
