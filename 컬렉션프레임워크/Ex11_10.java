package 컬렉션프레임워크;

import java.util.*;

public class Ex11_10 {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i=0; set.size() < 6; i++) {    // 로또번호 만들기 예제
            int num = (int)(Math.random()*45)+1;
            set.add(new Integer(num));
        }

        List list = new LinkedList(set);    // LinkedList(Collection c). Collections 클래스의 sort메서드는 인자로 List인터페이스 타입을 필요로 하기 때문에 HashSet에 저장된 객체들을 LinkedList에 담아서 처리했다.
        Collections.sort(list);             // Collections.sort(List list)
        System.out.println(list);
    }
}
