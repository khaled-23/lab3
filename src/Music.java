import java.util.List;
import java.util.Objects;

public class Music extends Media{
    String artist;

    public Music(String title,double price, String artist) {
        super(title,price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void purchase(User user){
        Music music = new Music(super.getTitle(), super.getPrice(),this.artist);
        user.setPurchasedMediaList(music);
    }

    public void listen(User user){
        Music music = new Music(super.getTitle(), super.getPrice(),this.artist);
        String m1 = music.toString();
        boolean canListen = true;

        for(Media m: user.getPurchasedMediaList()){
            String m2 = m.toString();
            if(m1.equals(m2)){
                System.out.println("listen to "+ super.getTitle());
                canListen = false;
                break;
            }
        }
        if(canListen){
            System.out.println(user.getUserName()+" doesn't have licence to "+ super.getTitle());
        }
    }


    @Override
    public String getMediaType(){
        if(super.getPrice()>=10){
            return  "Premium Music";
        }else return "music";
    }

    @Override
    public String toString() {
        return "Music{" +
                "artist='" + artist + '\'' +
                "} " + super.toString();
    }
}
