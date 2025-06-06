import java.util.HashMap;
import java.util.Map;

class Student {
     String name;
     int age;
     int marks;

    public Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}

public class StudentData {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();

        map.put("101", new Student("Bhanu", 22, 50));
        map.put("102", new Student("Satyam", 23, 80));
        map.put("103", new Student("Achyuth", 21, 70));

        for (Map.Entry<String, Student> entry : map.entrySet()) {

            System.out.println("Student ID: " + entry.getKey() +
                    ", Name: " + entry.getValue().name +
                    ", Age: " + entry.getValue().age +
                    ", Marks: " + entry.getValue().marks);
        }
    }
}
