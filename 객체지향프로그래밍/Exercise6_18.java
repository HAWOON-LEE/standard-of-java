package 객체지향프로그래밍;

public class Exercise6_18 {

    static boolean isNumber(String str) {
        
        if (str == null || str.equals("")) {
            return false;
        }
        
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (!('0' <= x && x <= '9')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "123431233";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));

        str = "1233dsas";
        System.out.println(str + "는 숫자입니까? " + isNumber(str));
    }
}
