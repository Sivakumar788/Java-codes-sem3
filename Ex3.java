class Student {
    public String name;

    Student(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Student[] myStudent = new Student[] { new Student("shiva"), new Student("rahul"), new Student("dhardhan"),
                new Student("arjun")
        };

        for (Student m : myStudent) {
            System.out.println(m);
        }
    }
}
