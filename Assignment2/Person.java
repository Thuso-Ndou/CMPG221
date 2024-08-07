// TP NDOU 37853058
public abstract class Person implements Comparable<Person>
{
    // class variables
    private String name;
    private int age;

    // default constructor
    protected Person()
    {}

    // constructor a person object
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Accessor methods
    // getter method for name
    public String getName()
    {
        return name;
    }
    // getter method for age
    public int getAge()
    {
        return age;
    }

    // mutator methods
    // setter method for name
    public void setName(String name)
    {
        this.name = name;
    }
    //setter method for age
    public void setAge(int age)
    {
        this.age = age;
    }

    // abstract method to display role
    public abstract void displayRole();

    //
    @Override
    public String toString()
    {
        return "Name: " + this.name + ", Age: " + this.age;
    }

    @Override
    public int compareTo(Person other) {
    return this.age - other.age;
  }
}