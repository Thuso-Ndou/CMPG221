//37853058 TP NDOU
import java.util.Objects;

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
    public boolean equals(Object o) 
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        
        Student student = (Student) o;
        
        // Check equality based on the student's name, number, and course
        return name.equals(student.name) && studentId.equals(student.studentId) && course.equals(student.course);
    }

    @Override
    public int hashCode() 
    {
        // Generate a hash code based on the student's attributes
        return Objects.hash(name, studentId, course);
    }

    @Override
    public String toString() 
    {
        return "Name='" + name + " , studentNum='" + studentId + " , Course='" + course + '\'';
    }
}
