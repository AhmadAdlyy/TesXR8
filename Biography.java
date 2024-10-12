package Bukuneh;

public class Biography extends TexBook {
    String about;

    public String getAbout() {
        return this.about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Biography() {
        super();
        about = "";
    }

    public Biography(String title, String subject, String about, int year, double price) {
        super(title, subject, year, price);
        this.about = about;
    }

    public void print() {
        System.out.println("About" + about);
    }
}
