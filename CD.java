public class CD extends Product {
    String artist;
    int numSong;
    String label;

    public CD() {
        super();
        number = 1;
        name = "";
        quantity = 0;
        price = 0.0;
        artist = "";
        numSong = 0;
        label = "";
    }

    public CD(int number,String name,int quantity,
    double price,String artist,int numSong,String label) {
        super(number,name,quantity,price);
        this.artist = artist;
        this.numSong = numSong;
        this.label = label;
    }
    
    
}
