package homeWork_5;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ListStudents {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student a) {
        students.add(a);
    }

    public void faculty(String faculty){
        for (Student s : students){
            if (s.getFaculty().equals(faculty)){
                System.out.println(s.toString());
            }
        }
    }

    public void facultyCourse(String faculty,String course){
        for (Student st : students){
            if (st.getFaculty().equals(faculty) && st.getCourse().equals(course)){
                System.out.println(st.toString());
            }
        }
    }
    public void stAge(String birthday){
        for (Student student : students)
            if (parseBirthday(student.getBirthday().substring(6)) > parseBirthday(birthday)) {
                System.out.println(student.toString());
            }
    }
    public int parseBirthday(String birthday){
        return Integer.parseInt(birthday);
    }
    public void allGroup(String group){
        for (Student s : students){
            if (s.getGroup().equals(group)){
                System.out.println(s.toString());
            }
        }
    }
}
