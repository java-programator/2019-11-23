package pl.altkom.delegation;

import java.util.ArrayList;
import java.util.List;

//public class StudentGroup extends ArrayList<Student> {
//    public boolean add(Student s) {
//        return super.add(s);
//    }
//}

public class StudentGroup {
    private List<Student> students;// = new ArrayList<>();

//    private ArrayList<Student> students;
    public StudentGroup() {
        students  = new ArrayList<>();
    }

    public StudentGroup(ArrayList<Student> s) {
        students = s;
    }

    public boolean add(Student s) {
        return students.add(s);
    }
}

class Main {
    public static void main(String[] args) {
        StudentGroup ag = new StudentGroup();
        ag.add(new Student());
//        ag.forEach(s -> {});
    }
}