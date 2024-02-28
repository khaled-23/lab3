public class Novel extends Book{
    private String genre;

    public Novel(String title, String author, String ISBN, double price, int stock, String genre) {
        super(title, author, ISBN, price, stock);
        this.genre = genre;
    }


    @Override
    public String getMediaType(){
        if(isBestSeller()){
            return "Bestselling Novel";
        }else return "Novel";
    }

    @Override
    public String toString() {
        return "Novel{" +
                "genre='" + genre + '\'' +
                "} " + super.toString();
    }
}
