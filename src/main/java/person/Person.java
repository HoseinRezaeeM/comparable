package person;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparator<Person> {
    private String firstName;
    private String mobileNumber;
    private int age;
    private double weigth;
    private double height;

    public Person(String firstName, String mobileNumber, int age, double weigth, double height) {
        this.firstName = firstName;
        this.mobileNumber = mobileNumber;
        this.age = age;
        this.weigth = weigth;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getAge() {
        return age;
    }

    public double getWeigth() {
        return weigth;
    }

    public double getHeight() {
        return height;
    }



    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge()<o2.getAge()?-1:o1.getAge()==o2.getAge()?0:+1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.weigth, weigth) == 0 && Double.compare(person.height, height) == 0 && Objects.equals(firstName, person.firstName) && Objects.equals(mobileNumber, person.mobileNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, mobileNumber, age, weigth, height);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", age=" + age +
                ", weigth=" + weigth +
                ", height=" + height +
                '}';
    }


}
