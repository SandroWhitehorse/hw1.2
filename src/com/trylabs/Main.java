package com.trylabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Введите стороны а и б треугольника");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("Периметр="+(a*2+b*2)+" Площадь="+(a*b));
    }
}
