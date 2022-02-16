package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {

	public static int primeNumberCheck(int num) {
		int range;
		int i = 0;
		int flag = 0;
		int prime = 0;
		for (i = 2; i <= (num / 2); i++) {
			if (num % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0 && num != 1)
			prime = num;
		return prime;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number ");
		int range = scanner.nextInt();
		int prime = 0;
		for (int num = 1; num <= range; num++) {
			prime = primeNumberCheck(num);
			if (prime == num) {
				System.out.println(num);
			}
			scanner.close();

		}

	}
}