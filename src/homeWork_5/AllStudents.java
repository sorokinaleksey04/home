package homeWork_5;

import java.lang.ref.SoftReference;
import java.util.List;

public class AllStudents {
    public static void main(String[] args) {
        Student student1 = new Student(01,"Иванов","Иван","Иванович","01.12.1980",
                                      "Херсон","+380508673456","юридический","3","средняя");

        Student student2 = new Student(02,"Будяк","Павел","Константинович","11.05.1987",
                                      "Николаев","+3805085936","экономический","4","средняя");

        Student student3 = new Student(03,"Гуля","Василий","Алексеевич","02.10.1985",
                                       "Днепр","+38050872645","юридический","4","средняя");

        Student student4 = new Student(04,"Зузуля","Николой","Петрович","03.01.1989",
                                       "Донецк","+380509393943","экономический","1","начальная");

        Student student5 = new Student(05,"Доценко","Владимир","Дмитриевич","23.09.1987",
                                       "Александрия","+3805044343959","экономический","4","средняя");

        Student student6 = new Student(06,"Костаненко","Андрей","Павлович","15.10.1985",
                                       "Запорожье","+3805083675751","юридический","2","начальная");

        ListStudents listSt = new ListStudents();
        listSt.addStudent(student1);
        listSt.addStudent(student2);
        listSt.addStudent(student3);
        listSt.addStudent(student4);
        listSt.addStudent(student5);
        listSt.addStudent(student6);
        System.out.println("список студентов заданного факультета");
        listSt.faculty("юридический");
        System.out.println("списки студентов для каждого факультета и курса");
        listSt.facultyCourse("экономический","4");
        System.out.println("список студентов, родившихся после заданного года");
        listSt.stAge("1985");
        System.out.println("список учебной группы");
        listSt.allGroup("начальная");

    }


}
