//37853058 TP NDOU
import java.util.Scanner;

public class TestProgram 
{
    public static void main(String[] args) 
    {
        // clear console
        System.out.print("\f");
        
        // simple header Display
        System.out.println("University System");
        
        University university = new University();
        MyLinkedList<Student> studentList = new MyLinkedList<>();
        
        Scanner sc = new Scanner(System.in);
        
        // variable declaraction
        int userInput = 1;
        
        while(userInput != 0)
        {
            // User input for operation
            System.out.println("\nEnter a number for an operation:");
            System.out.println("1. Register Student:");
            System.out.println("2. Show Current Registration Queue:");
            System.out.println("3. Process Registration:");
            System.out.println("4. Show Current Queue And Operations:");
            System.out.println("5. Undo last Operation");
            System.out.println("6. Show Operation After Undo");
            System.out.println("7. Recursion Search");        // Option for testing recursion
            System.out.print("0. Exit\n");
            
            userInput = sc.nextInt();
            sc.nextLine(); // Consume the leftover newline
            
            if(userInput == 1)
            {
                // user input for student
                System.out.println("Enter Student Name: ");
                String name = sc.nextLine();
                
                System.out.println("Enter Student Number: ");
                String studentNum = sc.nextLine();
                
                System.out.println("Enter Student Course: ");
                String course = sc.nextLine();
                
                // Register students
                university.registerStudent(new Student(name, studentNum, course));
            }
            else if(userInput == 2)
            {
                // Show current registration queue
                System.out.print("\n");
                university.queue();
            }
            else if(userInput == 3)
            {
                // Process registrations
                System.out.print("\n");
                university.processRegistration();
                university.processRegistration();
            }
            else if(userInput == 4)
            {
                // Show current queue and operations
                System.out.print("\n");
                university.queue();
                university.operations();
            }
            else if(userInput == 5)
            {
                // Undo the last operation
                System.out.print("\n");
                university.undo();
                university.undo();
            }
            else if(userInput == 6)
            {
                // Show operations after undo
                System.out.print("\n");
                university.operations();
            }
            else if(userInput == 7)
            {
                // User input for student details to search
                System.out.println("Enter Student Name: ");
                String name = sc.nextLine();
    
                System.out.println("Enter Student Number: ");
                String studentNum = sc.nextLine();
    
                System.out.println("Enter Student Course: ");
                String course = sc.nextLine();
                
                // Creating a student object to search
                Student searchStudent = new Student(name, studentNum, course);
                
                // Adding students to the list
                studentList.append(searchStudent);
    
                // Searching for the student in the list
                int index = studentList.recursiveSearch(searchStudent);
                System.out.println("Index of " + name + " : " + index);
            }
            else if(userInput == 0)
            {
                break;
            }
            else
            {
               //if the value is not a number or not from the list
               System.out.println("/nEnter a Valid number:");
            }
        }
    }
}
