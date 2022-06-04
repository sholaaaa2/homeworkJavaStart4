package com.gmail.kukaruka52;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число 4<n<16");
		long n = sc.nextLong();
		long fact = 1;
		for (long i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println(n + "! = " + fact);
	}
}
