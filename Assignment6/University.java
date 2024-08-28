//37853058 TP NDOU
public class University 
{
    private QueueAsMyLinkedList<Student> registrationQueue;
    private StackAsMyLinkedList<String> operationStack;

    public University() 
    {
        registrationQueue = new QueueAsMyLinkedList<>();
        operationStack = new StackAsMyLinkedList<>();
    }

    // Register a student (enqueue the student)
    public void registerStudent(Student student) 
    {
        registrationQueue.enqueue(student);
        
        operationStack.push("Registered student: " + student.getName() + " for " + student.getCourse());
        
        System.out.println(student.getName() + " has been added to the registration queue.");
    }

    // Process the next student registration (dequeue the student)
    public void processRegistration() 
    {
        Student student = registrationQueue.dequeue();
        
        if (student != null) 
        {
            System.out.println("Processing registration for: \n" + student.getName() + " doing " + student.getCourse());
            operationStack.push("Processed registration for: " + student.getName());
        } 
        else 
        {
            System.out.println("No students to process.");
        }
    }

    // Undo the last operation
    public void undo() 
    {
        String lastOperation = operationStack.pop();
        
        if (lastOperation != null) 
        {
            System.out.println("Last Operation: " + lastOperation);
        } 
        else 
        {
            System.out.println("No operations to undo.");
        }
    }

    // Show the current registration queue
    public void queue() 
    {
        System.out.println("Registration Queue: \n" + registrationQueue);
    }

    // Show the operation stack
    public void operations() 
    {
        System.out.println("Operation Stack: \n" + operationStack);
    }
}
