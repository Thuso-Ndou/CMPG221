// 37853058 TP NDOU
public class TestProgram 
{
    public static void main(String[] args) {
        MyLinkedList<MyInteger> list = new MyLinkedList<>();
        
        // Add elements to the list
        list.append(new MyInteger(13));  // Binary: 1101
        list.append(new MyInteger(25));  // Binary: 11001
        list.append(new MyInteger(7));   // Binary: 111
        
        // Convert the value at index 1 to a binary number
        String binary = list.convertToBinary(1);
        
        // clear terminal
        System.out.print("\f");
        
        // Print the list and the binary representation
        System.out.println("LinkedList: " + list);
        System.out.println("Binary at index 1: " + binary);
    }
}