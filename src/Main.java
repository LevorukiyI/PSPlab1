import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student(new String("not_default_surname"));

        ArrayList<String> debts = new ArrayList<String>();
        debts.add(new String("subject1"));
        debts.add(new String("subject2"));
        debts.add(new String("subjec3"));
        Student student2 = new Student(new String("not_default_surname2"), 20, debts);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        for(Student studentTemp: students){
            WriterInfo.writeInfo(studentTemp);
            System.out.println();
        }

    }
}