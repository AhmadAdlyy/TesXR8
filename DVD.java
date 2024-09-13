public class DVD extends Product {
    protected int legth;
    protected String rating;
    protected String studio;

    public DVD(){
        super();
        legth = 0;
        rating = "";
        studio = "";
    }
    public DVD(int number,String name,int quantity,double price,
    int leght,String rating,String studio) {
        super(number,name,quantity,price);
        this.legth = legth;
        this.rating = rating;
        this.studio = studio;
    }
    
}

    
