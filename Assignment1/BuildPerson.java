// TP NDOU 37853058
// Test Program
public class BuildPerson 
{
    public static void main(String[] args)
    {
        // clear the console
        System.out.print("\f");

        // creating new instance object
        Person student = new Student("Thuso", 22, "Data Structures");
        Person tutor = new Tutor("John", 56, "BSc Information in Technology");

        // Implicit way of calling the toString method
        System.out.println(student);
        System.out.println(tutor);

        // Explicit way of calling the toString method
        System.out.println("");// display empty string
        System.out.println(student.toString());
        System.out.println(tutor.toString());

        // using polymorphism to display information
        System.out.println("");// display empty string
        student.displayRole();
        tutor.displayRole();
        System.out.println("");// display empty string
    }
}
