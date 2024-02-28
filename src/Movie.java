import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Movie extends Media{
    private int duration; //in minutes


    public Movie(String title, String author, double price, int duration) {
        super(title, author, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void purchase(User user){
            Movie movie = new Movie(super.getTitle(),super.getAuthor(),super.getPrice(),this.duration);
            user.setPurchasedMediaList(movie);
    }

    public void recommendedSimilarMovies(List<Movie> movieCatalog){
        Movie movie = new Movie(super.getTitle(),super.getAuthor(),super.getPrice(),this.duration);
        ArrayList<Movie> recMovies= new ArrayList<Movie>();
        for(Movie m:movieCatalog){
            if(m.getAuthor().equals(movie.getAuthor())){
                recMovies.add(m);
            }
        }
        System.out.println("recommended: " +recMovies);
    }

    public void watch(User user){
        Movie movie = new Movie(super.getTitle(),super.getAuthor(),super.getPrice(),this.duration);

        boolean canWatch = true;
        for(Object m: user.getPurchasedMediaList()){
            if(movie.toString().equals(m.toString())){
                System.out.println("watching "+super.getTitle());
                canWatch = false;
                break;
            }
        }
        if(canWatch){
            System.out.println( user.getUserName() +" doesn't have licence to "+super.getTitle());
        }
    }

    @Override
    public String getMediaType(){
        if(this.duration>=120)
            return "Long Movie";
        return "Movie";
    }

    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration +
                "} " + super.toString();
    }
}
