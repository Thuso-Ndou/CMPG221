// TP NDOU 37853058
public class Student extends Person
{
    // class variable
    private String major;

    // default construcor
    protected Student()
    {}

    // construct a student
    public Student(String name, int age, String major)
    {
        super(name,age);
        this.major = major;
    }

    // setter method for the major / mutator
    public void setMajor(String major)
    {
        this.major = major;
    }

    // getter method for the major / accessor
    public String getMajor()
    {
        return this.major;
    }

    // display role
    public void displayRole()
    {
        System.out.println(this.getName() + " is a student learning  " + this.major);
    }

    // creating a toString() method
    @Override
    public String toString()
    {
        return "Student " + super.toString() +  ", Major: " + this.major;
    }
}
