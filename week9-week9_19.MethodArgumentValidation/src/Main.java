import validation.Calculator;
import validation.Person;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person("Mike", -20);
        Calculator calculator = new Calculator();

        try {
            System.out.println(calculator.multiplication(-1));
        } catch (Exception IllegalAccessException){

        }
    }
}
