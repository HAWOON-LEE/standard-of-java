package 객체지향프로그래밍;

public class Ex6_14 {
    static {
        System.out.println("static {}"); // 클래스 초기화 블럭(처음 메모리에 로딩될 때 가장 먼저 초기화)
    }

    {
        System.out.println("{}");  // 인스턴스 초기화 블럭 (인스턴스가 생성될 때마다 그 다음 초기화)
    }

    public Ex6_14() {   
        System.out.println("생성자"); // 생성자 (가장 마지막에 초기화)
    }

    public static void main(String[] args) {
        System.out.println("Ex6_14 bt = new Ex6_14();");
        Ex6_14 bt = new Ex6_14();

        System.out.println("Ex6_14 bt2 = new Ex6_14();");
        Ex6_14 bt2 = new Ex6_14(); // 클래스 초기화 블럭은 처음 메모리에 로딩될 때 한번만 수행되었지만, 인스턴스 초기화 블럭은 인스턴스가 생성될 때 마다 수행된다.
    }
} 
