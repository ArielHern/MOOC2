package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {

        if (name == null || name.length() > 40 ||name.isEmpty()){
            throw new IllegalArgumentException("Please enter a valid name.");
        }

       if (age < 0 || age > 120 ){
            throw new IllegalArgumentException("Age has to be between 0-120 ");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String toString() {
        return "Name:" + this.name + " Age:" + this.age;
    }
}
