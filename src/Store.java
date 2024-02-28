import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<User> users = new ArrayList<User>();
    private List<Media> medias = new ArrayList<Media>();



    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void addUser(User user){
        users.add(user);
        System.out.println("user added");
    }

    public void displayUsers(){
        for(User u:users){
            System.out.println(u);
        }
    }

    public void addMedia(Media media){
        this.medias.add(media);
        System.out.println("media added");
    }

    public void displayMedias(){
        for(Media m:medias){
            System.out.println(m);
        }
    }


    @Override
    public String toString() {
        return "Store{" +
                "users=" + users +
                ", medias=" + medias +
                '}';
    }
}
