package com.gmail.kukaruka52;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число полос");
		int x = sc.nextInt();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < x; j++) {
				if (j%2==0) {
					System.out.print("***");
				} else {
					System.out.print("+++");
				}
			}
			System.out.println();
		}

	}
}
