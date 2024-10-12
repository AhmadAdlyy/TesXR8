package array;

public class Teacher extends Person{
    protected String Subject;

    public String getSubject() {
        return this.Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }
    public Teacher(String name,int age,String Subject) {
        super(name,age);
        this.Subject = Subject;
        
    }

    public void print() {
        super.print();
        System.out.println("Subject:" + Subject);
       
    }
}
    

