package com.example.hw11;
import java.util.Scanner;
public class MyClass {
    public static void main(String[] s) {
        int x;
        int y ;
        int z ;
        int t ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("輸入三個整數x,y,z:");

        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        System.out.println("由小到大的排列:");
        if (x > y) {
            t = x;
            x = y;
            y = t;
        }

        if (x > z) {
            t = x;
            x = z;
            z = t;
        }

        if (y>z){
            t = y;
            y = z;
            z = t;
        }
        System.out.println(x + "," + y + "," + z);
    }
}