package myPack;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        System.out.println("---------------String comparable----------------");

        Set<String> stringList = new TreeSet<>();
        stringList.add("aaa");
        stringList.add("ggg");
        stringList.add("xxx");
        stringList.add("bbb");
        stringList.add("sss");
        stringList.forEach(System.out::println);
        System.out.println("---------------User comparable----------------");

        User user1 = new User("xxx", 35);
        User user2 = new User("ccc", 77);
        User user3 = new User("aaa", 10);
        User user4 = new User("ggg", 10);

        Set<User> userSet = new TreeSet<>();
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);
        userSet.forEach(System.out::println);
        //System.out.println("user1 to user2:  " + user1.compareTo(user2));

        System.out.println("---------------Dog comparable----------------");
        Dog dog1 = new Dog("xxx", 5);
        Dog dog2 = new Dog("fff", 35);
        Dog dog3 = new Dog("aaa", 44);
        Dog dog4 = new Dog("ddd", 33);
        Dog dog5 = new Dog("bbb", 35);

        //Comparator<Dog> dogComparator = new DogComparator();
//        int res = dogComparator.compare(dog1, dog2);
//        System.out.println(res);

        Set<Dog> dogSet = new TreeSet<>(new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        dogSet.add(dog1);
        dogSet.add(dog2);
        dogSet.add(dog3);
        dogSet.add(dog4);
        dogSet.add(dog5);
        dogSet.forEach(System.out::println);

    }
}
