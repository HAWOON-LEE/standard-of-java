package 객체지향프로그래밍;

public class Exercise6_3 {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println("이름: "+s.name);
        System.out.println("총점: "+s.getTotal());
        System.out.println("총점: "+s.getAverage());
    }
}

class Student2 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal() {
        int result = kor+eng+math;
        return result;
    }

    float getAverage() {
        int total = kor+eng+math;
        float result = (int)(((total/3f)+0.05f)*10)/10f;
        return result;
    }
}