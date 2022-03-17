package 컬렉션프레임워크;

import java.util.*;

public class Ex11_7 {
    public static void main(String[] args) {
        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr);    // String의 Comparable 구현에 의한 정렬
        System.out.println("strArr="+Arrays.toString(strArr));

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함
        System.out.println("strArr="+Arrays.toString(strArr));  // 대소문자 구분을 안하기 때문에 Dog가 cat보다 정렬 순위가 뒤로 밀리게 됨

        Arrays.sort(strArr, new Descending());  // 역순 정렬
        System.out.println("strArr="+Arrays.toString(strArr));
    }
}

class Descending implements Comparator {  // Comparator 인터페이스를 구현할 때에는 compare() 메소드를 구현해야 한다.
    public int compare(Object o1, Object o2) {
        // instanceof 연산자 -> 객체가 어떤 클래스인지, 어떤 클래스를 상속받았는지 확인하는데 사용하는 연산자.
        if( o1 instanceof Comparable && o2 instanceof Comparable) {
            Comparable c1 = (Comparable)o1;
            Comparable c2 = (Comparable)o2;
            // 
            return c1.compareTo(c2) * -1;   // -1을 곱해서 기본 정렬방식의 역으로 변경한다. compareTo의 기본 정렬 방식은 뒤로 갈수록 커지는 오름차순 정렬이기 때문에 -1을 곱해 양수와 음수의 값을 뒤바꿔 내림차순 정렬로 만들어준다.
        }   // 또는 c2.compareTo(c1)와 같이 순서를 바꿔도 된다.
        return -1;
    }
}