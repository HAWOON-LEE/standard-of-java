package 컬렉션프레임워크;

import java.util.*;

public class Ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("David",10));
        set.add(new Person("David",10));

        System.out.println(set);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Person)) {
            return false;
        }

        Person p = (Person)obj;
        return name.equals(p.name) && age==p.age;
    }

    public int hashcode() {
        return Objects.hash(name, age);  // HashSet의 add메서드는 새로운 요소를 추가하기 전에 기존에 저장된 요소와 같은 것인지 판별하기 위해 추가하려는 요소의 equals()와 hashcode()를 호출하기 때문에 이처럼 equals() 뿐만 아니라 hashcode()도 목적에 맞게 오버라이딩해야 한다.
    }
}