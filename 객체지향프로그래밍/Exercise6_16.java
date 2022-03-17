package 객체지향프로그래밍;

public class Exercise6_16 {
    public static void change(String str) {
        str +="456";
    }

    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change(str);
        System.out.println("After change: "+str); 
        // String 클래스는 불변 객체이기 때문에 change() 메소드를 통해 str값이 바뀌어도 str값 자체가 변경된 것이 아니라 새로운 문자열의 주소가 Heap영역의 String constant pool이라는 곳에 메모리를 할당 받아 거기에 값을 저장하고  str 변수는 그 주소 값을 참조하게 되는 것.
    }
}
