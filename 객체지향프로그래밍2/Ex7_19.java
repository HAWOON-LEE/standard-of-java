package 객체지향프로그래밍2;

import java.awt.*;
import java.awt.*;
import java.awt.event.*;

public class Ex7_19 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        }   // 익명 클래스의 끝
        );
    }   // main의 끝
}
