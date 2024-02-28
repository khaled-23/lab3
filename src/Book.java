import java.util.ArrayList;

public class Book extends Media {
    private int stock;
    private ArrayList<Review> review = new ArrayList<>();

    public Book(String title, String author, String ISBN, double price) {
        super(title, author, ISBN, price);}
    public Book(String title, String ISBN, double price){
        super(title, ISBN,price);}
    public Book(String title, String author, String ISBN, double price, int stock) {
        super(title, author, ISBN, price);
        this.stock = stock;}


    public int getStock(){
        return stock;}

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Review> getReview() {
        return review;
    }

    public void setReview(ArrayList<Review> review) {
        this.review = review;
    }

    public void addReview(Review review){
        this.review.add(review);
    }//x
    public double getAverageRating(){//x
        double average;
        double sum = 0;
        for(Review r:this.review){
            sum+= r.getRating();
        }
        average = sum/this.review.size();
        return average;
    }
    public void purchase(User user){
        Book book = new Book(super.getTitle(),super.getAuthor(), super.getISBN(),super.getPrice());
        if(0<stock){
            stock--;
            user.setPurchasedMediaList(book);
        }else System.out.println("out of stock");
    }


    public boolean isBestSeller(){ //x
        boolean isBestSeller = false;
        if(getAverageRating()>=4.5)
            isBestSeller = true;
        return isBestSeller;
    }

    public void reStock(int quantity){
        this.stock += quantity;
        System.out.println("the amount: " +quantity+ " has been added, total stock: " + this.stock);
    }


    @Override
    public String getMediaType(){
        if(isBestSeller()){
            return "Bestselling Book";
        }else return "Book";

    }

    @Override
    public String toString() {
        return "Book{" +
                "stock=" + stock +
                ", review=" + review +
                "} " + super.toString();
    }
}

