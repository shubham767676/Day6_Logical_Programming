package com.bridgelabz;

import java.util.Scanner;

public class StopwatchProgram {

	public static double startWatch() {
		System.out.println("Enter 1 to Start the Watch");
		Scanner scanner = new Scanner(System.in);
		{
			double startWatch = scanner.nextDouble();
			startWatch = System.currentTimeMillis();
			return startWatch;
		}

	}

	public static double stopWatch() {
		System.out.println("Enter 2 to Stop the Watch");
		try (Scanner scanner = new Scanner(System.in)) {
			double stopWatch = scanner.nextDouble();
			stopWatch = System.currentTimeMillis();
			return stopWatch;
		}

	}

	public static void main(String[] args) {
		double timeInSec = Math.abs((startWatch() - stopWatch())) / 1000;
		System.out.println("Time elapsed in sec is " + timeInSec);

	}

}
