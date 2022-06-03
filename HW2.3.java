package com.gmail.kukaruka52;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter odd number:");
		n = sc.nextInt();
		for (int j = 1; j <= n; j++) {
			for (int i = 1; i <= n; i++) {
				if (i <= j & i >= (n + 1 - j) | i >= j & i <= (n + 1 - j)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}