class Movie{
    private String movie;
    private int rating;
    public String getMovie(){
        return this.movie;
    }
    public int getRating(){ return this.rating;}
    public void setMovie(String movie){
        if(movie!=null && !movie.trim().isEmpty()){
            this.movie=movie;
        }else{
            System.out.println("Invalid movie name");
        }
    }
    public void setRating(int rating){
        if(rating>=1 && rating<=10 ) this.rating=rating;
        else System.out.println("Invalid Rating");
    }
}
class Main {
    public static void main(String[] args) {
        Movie s=new Movie();
        s.setMovie("RUN");
        s.setRating(7);
        System.out.println(s.getMovie()+" "+s.getRating());
        s.setRating(11);
    }
}
