package person;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("samyar", "09121000000", 45, 99.5, 180.5));
        list.add(new Person("samyar", "09121000000", 20, 65.5, 180.5));
        list.add(new Person("samyar", "09121000000", 45, 99.5, 180.5));
        list.add(new Person("sara", "09121000000", 25, 99.5, 180.5));
        list.add(new Person("samyar", "09121000000", 45, 99.5, 180.5));
        list.add(new Person("samyar", "09121000000", 29, 75.5, 180.5));
        list.add(new Person("samyar", "09121000000", 45, 99.5, 180.5));
        Person person = new Person("samyar", "09121000000", 45, 99.5, 180.5);
        Person person1 = new Person("yar", "09121000000", 85, 99.5, 180.5);
        Set<Person> personSet = new HashSet<>();
        personSet.add(new Person("samyar", "09121000000", 45, 99.5, 180.5));
        System.out.println(personSet.contains(new Person("samyar", "09121000000", 45, 99.5, 180.5)));
        Map<Person, Person> personMap = new HashMap<>();
        personMap.put(new Person("samyar", "09121000000", 45, 99.5, 180.5), new Person("samyar", "09121000000", 45, 99.5, 180.5));
        System.out.println(personMap.containsValue(new Person("samyar", "09121000000", 45, 99.5, 180.5)));
        Map<String, String> stringStringMap = list.stream()
                .filter((a) -> a.getAge() > 20
                        && a.getAge() < 30
                        && a.getWeigth() > 60
                        && a.getHeight() > 170)
                .collect(Collectors.toMap(Person::getFirstName, Person::getMobileNumber));
        Set<Person> set = personMap.keySet();
        long set1 = personMap.entrySet().stream().count();
        System.out.println(set1);
        System.out.println(set);
        System.out.println(stringStringMap);
        BiConsumer<Person, Person> biConsumer = (peson, person2) -> System.out.println(peson.getFirstName() + " " + person2.getMobileNumber());
        biConsumer.accept(person, person1);
        // personMap.forEach(biConsumer);
        final Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(list.contains(new Person("samyar", "09121000000", 45, 99.5, 180.5)));
        List<Character> list1 =new ArrayList<>();
        for (char i = 'a'; i < 'z'; i++) {
            list1.add(i);

        }
         list1.remove(5);

        final Iterator<Character> iterator1 = list1.iterator();
       // list1.add('p');
        while (iterator1.hasNext()){
            final Character next = iterator1.next();
            if (next.equals('a')){
                iterator1.remove();
              //  System.out.println(iterator1.next());
            }
            System.out.println(iterator1.next());
        }
        removeAli(list);
        System.out.println("----------------------");
        System.out.println(list);
        System.out.println(person.compare(person, person1));

    }
    static void removeAli(List<Person> person1){
        final Iterator<Person> iterator = person1.iterator();

        while (iterator.hasNext()){
            final Person next = iterator.next();
            if (next.getFirstName().startsWith("sam")){
                iterator.remove();
                System.out.println(next);
            }

        }



    }

}
