package com.gmail.kukaruka52;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height");
		int h = sc.nextInt();
		int x =1;
		for (int i = 1; i <= h * 2;) {
			if (x <= i && i <= h * 2 - x) {
				System.out.print("*");
				x++;
			} else {
				System.out.println(" ");
				i++;
				x = 1;
			}
		}
	}
}
