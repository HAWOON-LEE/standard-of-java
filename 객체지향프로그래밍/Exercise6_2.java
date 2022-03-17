package 객체지향프로그래밍;

public class Exercise6_2 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }
}

class Student {
    
    String name; 
    int ban; 
    int no;
    int kor;
    int eng;
    int math; 

    Student(String name, int ban, int no, int kor, int eng, int math) { 
        this.name=name;
        this.ban =ban;
        this.no=no;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
    }
    
    String info() {
        int m = kor+eng+math;
        float n = (m+(ban+no+kor+eng+math))/6-0.3f;
        String result = name+","+ban+","+no+","+kor+","+eng+","+math+","+m+","+n;
        return result;
    }
}