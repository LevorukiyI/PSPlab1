public class WriterInfo {


    public static void writeInfo(Student student){
        System.out.println("surname: " + student.getSurname());
        System.out.println("age: " + student.getAge());
        System.out.print("debts: ");
        if(student.getDebts().size() > 0) {
            for(String debt: student.getDebts()){
                System.out.print(debt + ", ");
            }
            System.out.println();
        }
        else{
            System.out.println("no debts");
        }
    }
}
