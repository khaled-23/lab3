import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Media m1 = new Media("media1","media author1",23);
        Media m2 = new Media("media2","media author2","12345",23);
        Media m3 = new Media("media3","media author3","85685",23);

        Store s1 = new Store();
        User u1 = new User("khaled","a@email.com");
        User u2 = new User("mohammed","b@email.com");
        User u3 = new User("naser","c@email.com");
        Review r1 = new Review(u1.getUserName(),5,"some review1");
        Review r2 = new Review("ahmed",1,"some review2");
        Review r3 = new Review("omar",4,"some review3");
        Review r4 = new Review("hassan",3.5,"some review3");



        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("books");
        //change title, author and restock
        Book b1 = new Book("Book1","author1","01",15,10);
        System.out.println("book 1 before: "+b1.toString());
        b1.setTitle("not book 1"); b1.setAuthor("not author 1"); b1.reStock(5);
        b1.addReview(r2);
        System.out.println("average rating: "+b1.getAverageRating());
        System.out.println("is bestseller: " + b1.isBestSeller());
        System.out.println("type: "+b1.getMediaType());
        System.out.println("book 1 after: " + b1.toString());

        System.out.println("-----------------------------------------");

        //change price and reviewed
        Book b2 = new Book("Book2","author2","02",15,10);
        System.out.println("book 2 before: "+b2.toString());
        b2.purchase(u2); b2.setPrice(5);
        System.out.println("average rating: "+b1.getAverageRating());
        System.out.println("is bestseller: " + b1.isBestSeller());
        System.out.println("type: "+b1.getMediaType());
        System.out.println("Book 2 after: "+b2.toString());
        b2.addReview(r3); b2.addReview(r1);
        System.out.println("average rating: "+ b2.getAverageRating());
        System.out.println("is bestseller: " + b2.isBestSeller());


        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Novel and academicBook");

        System.out.println("novel before:-");
        Novel n1 = new Novel("Novel","Novel author","123451",15,10,"some genre");
        n1.addReview(r1);
        System.out.println("type: "+n1.getMediaType()+" average rating: "+n1.getAverageRating());
        System.out.println("novel after:-");
        n1.addReview(r2);
        System.out.println("type: "+n1.getMediaType()+" average rating: "+n1.getAverageRating());
        System.out.println(n1.toString());

        System.out.println("academicBook before:-");
        AcademicBook a1 = new AcademicBook("academicBook","Academic Author","12345123",11,3,"some subject");
        a1.addReview(r4);
        System.out.println("type: "+a1.getMediaType()+" average rating: "+a1.getAverageRating());
        System.out.println("academicBook after:-");
        a1.addReview(r1);a1.addReview(r1);
        System.out.println("type: "+a1.getMediaType()+" average rating: "+a1.getAverageRating());
        System.out.println(a1.toString());




//        Scanner s = new Scanner(System.in);
//        System.out.println("enter a comment");
//        String comment = s.nextLine();
//        System.out.println("enter a rating");
//        double rating = s.nextDouble();
//        Review review = new Review(u1.getUserName(),rating,comment);
//        n1.addReview(review);


        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Music and movie");

        System.out.println("music1:-");
        Music mu1 = new Music("some music",15,"some artist");
        System.out.println(mu1.toString());
        System.out.println("music1 type: "+mu1.getMediaType() + " -price: "+ mu1.getPrice());

        System.out.println("music2:-");
        Music mu2 = new Music("some music2",8,"some artist2");
        System.out.println(mu2.toString());
        System.out.println("music1 type: "+mu2.getMediaType() + " -price: "+ mu2.getPrice());

        System.out.println("movie1:-");
        Movie mov1 = new Movie("movie1","author1",14,130);
        System.out.println(mov1.toString());
        System.out.println("Media type: "+mov1.getMediaType() + " duration: "+ mov1.getDuration());


        System.out.println("movie2:-");
        Movie mov2 = new Movie("movie2","author2",10,90);
        System.out.println(mov2.toString());
        System.out.println("media type: "+mov2.getMediaType() +" duration: "+mov2.getDuration());


        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("store adding user and media");
        s1.addMedia(m1); s1.addMedia(m2); s1.addMedia(m3);
        s1.addMedia(b1); s1.addMedia(b2);
        s1.addMedia(n1);
        s1.addMedia(a1);
        System.out.println("-----------");
        s1.addUser(u1);
        s1.addUser(u2);
        s1.addUser(u3);

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("store displaying media and user:-");

        System.out.println("medias:-");
        s1.displayMedias();
        System.out.println("-----------------------------");
        System.out.println("users:-");
        s1.displayUsers();


        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("shopping cart");
        System.out.println("shopping cart before adding medias");
        System.out.println(u1.getShoppingCart());
        u1.addToCart(b1);//added book1
        u1.addToCart(mu2);//added music2
        u1.addToCart(mov1);//added movie1
        u1.addToCart(mov2);//added movie2
        u1.addToCart(a1);//added academicBook1
        u1.addToCart(n1);//added novel1
        System.out.println("shopping cart after adding medias");
        System.out.println(u1.getShoppingCart());
        System.out.println("shopping cart before removing some medias");
        System.out.println(u1.getShoppingCart());
        u1.removeFromCart(mov2);
        System.out.println("shopping cart after removing some medias");
        System.out.println(u1.getShoppingCart());
        System.out.println("purchased list before checkout");
        System.out.println(u1.getPurchasedMediaList());
        u1.checkout();
        System.out.println("purchased list after checkout");
        System.out.println(u1.getPurchasedMediaList());



        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("listening - watching");

        System.out.println("listening:-");
        mu2.listen(u1);//user 1 purchase music2
        mu1.listen(u1);//user 1 didn't purchase music1

        System.out.println("watching:-");
        mov1.watch(u1);//user1 purchased movie1
        mov2.watch(u1);//user1 didn't purchase movie2



//        Scanner s = new Scanner(System.in);
//        System.out.println("enter a comment");
//        String comment = s.nextLine();
//        System.out.println("enter a rating");
//        double rating = s.nextDouble();
//        Review review = new Review(u1.getUserName(),rating,comment);
//        b1.addReview(review);
    }
}