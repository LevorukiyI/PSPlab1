import java.util.ArrayList;

public class Student {
    private static final String DEFAULT_SURNAME = new String("default");
    private static final Integer DEFAULT_AGE = 18;
    private static final ArrayList DEFAULT_DEBTS = new ArrayList<String>();

    private String surname;
    private Integer age;
    private ArrayList<String> debts;

    public Student(String surname, Integer age, ArrayList<String> debts){
        this.surname = new String(surname);
        this.setAge(age);
        this.debts = new ArrayList<String>(debts);
    }

    public Student(String surname) {
        this(surname, DEFAULT_AGE, DEFAULT_DEBTS);
    }

    public Student(){
        this(DEFAULT_SURNAME, DEFAULT_AGE, DEFAULT_DEBTS);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(age > 0) {
            this.age = age;
        }
    }

    public ArrayList<String> getDebts() {
        return debts;
    }

    public void setDebts(ArrayList<String> debts) {
        this.debts = debts;
    }

}
