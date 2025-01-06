import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {
    public static void main(String[] args) {

        Student s1 = new Student("Hermione", "Granger", 2.5); // No stipend
        Student s2 = new Student("Anuar", "Zhenissov", 3.3); // Gets stipend
        Employee e1 = new Employee("John", "Snow", "Nights Watch", 27045.78);
        Employee e2 = new Employee("Harrison", "Ford", "Actor", 50000.00);

        ArrayList<Person> people = new ArrayList<>();
        people.add(s1);
        people.add(s2);
        people.add(e1);
        people.add(e2);

        Collections.sort(people);

        printData(people);
    }
    public static void printData(Iterable<? extends Payable> list) {
        for (Payable p : list) {
            System.out.printf("%s earns %.2f tenge%n", p, p.getPaymentAmount());
        }
    }

}
