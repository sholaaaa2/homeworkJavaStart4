package com.gmail.kukaruka52;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height");
		int h = sc.nextInt();
		System.out.println("Enter width");
		int w = sc.nextInt();
		
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				if (i == 1 || i == h) {
					System.out.print("*");
				} else {
					if (j == 1 || j == w) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
