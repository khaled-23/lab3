import java.util.ArrayList;
import java.util.Objects;

public class User {
    private String userName;
    private String email;

    public void setPurchasedMediaList(ArrayList<Media> purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    private ArrayList<Media> purchasedMediaList = new ArrayList<Media>();
    private ArrayList<Media> shoppingCart = new ArrayList<Media>();

    public User(String userName, String email, ArrayList<Media> purchasedMediaList, ArrayList<Media> shoppingCart) {
        this.userName = userName;
        this.email = email;
        this.purchasedMediaList = purchasedMediaList;
        this.shoppingCart = shoppingCart;
    }

    public User(String userName, String email){
        this.userName = userName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }

    public void setPurchasedMediaList(Media purchasedMediaList) {
        this.purchasedMediaList.add(purchasedMediaList);
    }
    public void addToCart(Media media){
        this.shoppingCart.add(media);
    }
    public void checkout(){
        for(Media m:this.shoppingCart){
            setPurchasedMediaList(m);
        }
    }
    public void removeFromCart(Media media){
        for(Media m:this.shoppingCart){
            if(Objects.equals(m,media)){
                this.shoppingCart.remove(m);
                break;
            }
        }
    }


    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", purchasedMediaList=" + purchasedMediaList +
                ", shoppingCart=" + shoppingCart +
                '}';
    }
}
