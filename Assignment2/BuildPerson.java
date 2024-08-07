// TP NDOU 37853058
// Test Program
public class BuildPerson {
    public static void main(String[] args) {
        // clear the console
        System.out.print("\f");

        // Create a MyArrayList of Person objects
        MyArrayList people = new MyArrayList();

        // Create and add Person objects to the list
        Person student = new Student("Thuso", 22, "Data Structures");
        Person tutor = new Tutor("John", 56, "BSc Information in Technology");
        Person student2 = new Student("Alice", 24, "Computer Science");
        Person tutor2 = new Tutor("Mike", 35, "Mathematics");
        Person student3 = new Student("Bob", 19, "Physics");
        Person tutor3 = new Tutor("Sarah", 45, "Chemistry");
        people.add(student);
        people.add(tutor);
        people.add(student2);
        people.add(tutor2);
        people.add(student3);
        people.add(tutor3);

        // display the original list
        System.out.println("Original List: \n" + people);

        //display an empty string
        System.out.println("");

        // Find the person with the maximum age
        Person maxAgePerson = people.getMax();
        System.out.println("The oldest person: " + maxAgePerson);

        // Filter people older than 28
        MyArrayList adults = people.getFiltered(new Person("", 25) {
            @Override
            public void displayRole() {
                // Implement the abstract method
            }
        });

        //display people older than 25
        System.out.println("\nPeople Older than 25: \n" + adults);
    }
}