//37853058 TP NDOU
public class Student implements Comparable<Student>
{
    private String name;
    private String studentId;
    private String course;

    public Student(String name, String studentId, String course) 
    {
        this.name = name;
        this.studentId = studentId;
        this.course = course;
    }

    public String getName() 
    {
        return name;
    }

    public String getStudentId() 
    {
        return studentId;
    }

    public String getCourse() 
    {
        return course;
    }
    
    @Override
    public int compareTo(Student other) 
    {
        // Comparison based on student ID
        return this.studentId.compareTo(other.studentId);
    }

    @Override
    public String toString() 
    {
        return "Name='" + name + " , studentNum='" + studentId + " , Course='" + course + '\'';
    }
}
