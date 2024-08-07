// TP NDOU 37853058
public class Tutor extends Person
{
    // class variables
    private String course;

    // default constructor
    protected Tutor()
    {
    }

    // construct tutor
    public Tutor(String name, int age, String course)
    {
        super(name,age);
        this.course = course;
    }

    // setter method for course / mutator
    public void setCourse(String course)
    {
        this.course = course;
    }

    // getter method for course / accessor
    public String getCourse()
    {
        return this.course;
    }

    // display tutor role
    public void displayRole()
    {
        System.out.println(super.getName() + " is a tutor who teaches " + course);
    }

    // creating the toString method
    @Override
    public String toString()
    {
        return "Tutor " + super.toString() + ", Course: " + this.course;
    }
}