package array;

public class Parttime extends Teacher {
    protected String Hour_worked;

    public String getHour_worked() {
        return this.Hour_worked;
    }

    public void setHour_worked(String Hour_worked) {
        this.Hour_worked = Hour_worked;
    }


public Parttime(String name,int age,String Subject,String Hour_worked) {
    super(name,age,Subject);
    this.Hour_worked = Hour_worked;
}

public void print() {
    System.out.println("Hour Worked:" + Hour_worked);
    
}
}
    

