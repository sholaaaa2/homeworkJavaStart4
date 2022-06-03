package com.gmail.kukaruka52;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Все простые числа от 1 до 100");
		
		for (int j = 2; j <= 100; j++) {
			int k = 1;
			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					k = 0;
					break;
				}
			}
			if (k == 1) {
				System.out.print(j + " ");
			}
		}
	}
}
