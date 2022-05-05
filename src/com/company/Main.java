package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int s = scanner.nextInt();
        triangle.a = v;
        triangle.b = s;
        triangle.c = 2;

        triangle.area( v , s , triangle.c);


    }
}
