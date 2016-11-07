package vinod_day3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class generics {

	public Integer[] sort(int n) {
		int a = 0;
		Integer[] array1 = new Integer[n];
		Scanner s = new Scanner(System.in);

		System.out.println("enter the elements ");

		for (int i = 0; i < array1.length; i++) {
			try {

				a = s.nextInt();

			} catch (InputMismatchException e) {

				System.out.println("Exception Caught" + e);
			}
			array1[i] = a;
		}

		System.out.println("sorted Array was;");
		int temp;
		for (int i = 0; i < array1.length; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] > array1[j]) {
					temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}
			}

		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		return array1;

	}

	// ***********************************************************************************************
	public void ssort(int n) {
		String a = "";
		String[] array1 = new String[n];
		Scanner s = new Scanner(System.in);

		System.out.println("enter the elements ");

		for (int i = 0; i < array1.length; i++) {
			try {

				a = s.nextLine();

			} catch (InputMismatchException e) {

				System.out.println("Exception Caught" + e);
			}
			array1[i] = a;

		}
		Arrays.sort(array1);
		System.out.println("The sorted array was:");
		int i = 0;
		for (String temp : array1) {
			System.out.println("String " + ++i + " : " + temp);
		}

	}

	// ************************************************************
	public Double[] dsort(int n) {
		Double a = 0.00;
		Double[] array1 = new Double[n];
		Scanner s = new Scanner(System.in);

		System.out.println("enter the elements ");
		System.out.println("........." + n);

		for (int i = 0; i < array1.length; i++) {
			try {

				a = s.nextDouble();
				System.out.println("jv" + a);
			} catch (InputMismatchException e) {

				System.out.println("Exception Caught" + e);
			}
			array1[i] = a;
		}

		System.out.println("sorted Array was;");
		Double temp;
		for (int i = 0; i < array1.length; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] > array1[j]) {
					temp = array1[i];
					array1[i] = array1[j];
					array1[j] = temp;
				}
			}

		}
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
		return array1;

	}

	public static void main(String args[]) {
		int n = 0, d = 0;
		Scanner s = new Scanner(System.in);

		do{
		System.out.println("Enter your choice to select data type:" + "\n" + "1. for integer" + "\n" + "2. for Double"
				+ "\n" + "3. for String " + "\n" + "4. for Date");

		try {
			d = s.nextInt();

		} catch (InputMismatchException e) {

			System.out.println("Exception Caught" + e);
		}
		System.out.println("Enter the Number of elements: ");
		try {
			n = s.nextInt();

		} catch (InputMismatchException e) {

			System.out.println("Exception Caught" + e);
		}
		generics g = new generics();

		switch (d) {
		case 1:

			g.sort(n);

			break;
		case 2:

			g.dsort(n);
			break;
		case 3:

			g.ssort(n);
			break;
		case 4:

			break;
		default:
			System.out.println("default block from switch case was executed:");

		}
	System.out.println("Enter YES if you want to continue;");	
	}while ((s.next().equalsIgnoreCase("YES")));

	}

}
