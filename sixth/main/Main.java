package sixth.main;

import java.util.*;

// Student class
class Student {
    private String name;
    private String surname;
    private int age;
    private int course;
    private double averageMark;

    public Student(String name, String surname, int age, int course, double averageMark) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.course = course;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageMark() {
        return averageMark;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + '\'' +
               ", surname='" + surname + '\'' +
               ", age=" + age +
               ", course=" + course +
               ", averageMark=" + averageMark + "}";
    }
}

// Main class
public class Main {

    public static void main(String[] args) {
        manageWithArrayList();
        manageWithLinkedList();
        manageWithHashMap();
    }

    private static void manageWithArrayList() {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student("John", "Doe", 20, 2, 3.8));
        studentList.add(new Student("Jane", "Smith", 21, 3, 4.0));
        studentList.add(new Student("Emily", "Jones", 22, 4, 3.5));

        System.out.println("ArrayList Database:");
        for (Student s : studentList) {
            System.out.println(s);
        }

        studentList.remove(1);

        System.out.println("\nAfter removing Jane Smith:");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    private static void manageWithLinkedList() {
        LinkedList<Student> studentList = new LinkedList<>();

        studentList.add(new Student("John", "Doe", 20, 2, 3.8));
        studentList.add(new Student("Jane", "Smith", 21, 3, 4.0));
        studentList.add(new Student("Emily", "Jones", 22, 4, 3.5));

        System.out.println("\nLinkedList Database:");
        for (Student s : studentList) {
            System.out.println(s);
        }

        studentList.addFirst(new Student("Mike", "Brown", 23, 2, 3.9));

        System.out.println("\nAfter adding Mike Brown at the beginning:");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    private static void manageWithHashMap() {
        HashMap<String, Student> studentMap = new HashMap<>();

        studentMap.put("Doe", new Student("John", "Doe", 20, 2, 3.8));
        studentMap.put("Smith", new Student("Jane", "Smith", 21, 3, 4.0));
        studentMap.put("Jones", new Student("Emily", "Jones", 22, 4, 3.5));

        System.out.println("\nHashMap Database:");
        for (String key : studentMap.keySet()) {
            System.out.println("Key: " + key + " -> " + studentMap.get(key));
        }

        studentMap.remove("Smith");

        System.out.println("\nAfter removing Jane Smith from the HashMap:");
        for (String key : studentMap.keySet()) {
            System.out.println("Key: " + key + " -> " + studentMap.get(key));
        }

        if (studentMap.containsKey("Jones")) {
            System.out.println("\nFound Emily Jones: " + studentMap.get("Jones"));
        } else {
            System.out.println("\nEmily Jones not found.");
        }
    }
}

