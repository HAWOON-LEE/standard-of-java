import java.util.Scanner;

public class algo {
    static int Leg1(int n,int m) {
        for (int i=0;i<=n;i++){
            int f = 2*i+4*(n-i); // 동물 다리 수
            if(f==m) {
                return i;
            }          
        }
        return -1;
    }

    static int Leg2(int n, int m) {
        return (4*n-m)/2;
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("까치, 강아지 마리수:"); int n = Integer.parseInt(a.nextLine());
        System.out.print("까치, 강아지 다리 갯수:"); int m = Integer.parseInt(a.nextLine());
        System.out.println("까치 수는 "+Leg1(n, m)+"입니다.");
        System.out.println("까치 수는 "+Leg2(n,m)+"입니다");
    }
}
