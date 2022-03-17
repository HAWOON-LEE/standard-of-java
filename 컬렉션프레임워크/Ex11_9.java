package 컬렉션프레임워크;

import java.util.*;

public class Ex11_9 {
    public static void main(String[] args) {
        Object[] objArr = { "1", new Integer(1), "2", "2", "3", "3", "4", "4", "4" }; // 1이 중복된 것처럼 보이지만 하나는 String 1이고 다른 하나는 Integer 1이므로 중복으로 간주되지 않고 저장된다.
        Set set = new HashSet(); 

        for (int i = 0; i < objArr.length; i++) {
            set.add(objArr[i]);     // HashSet에 objArr의 요소들을 저장한다.
        }
        // HashSet에 저장된 요소들을 출력한다.
        System.out.println(set);

        // HashSet에 저장된 요소들을 출력한다.(Iterator 이용)
        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}