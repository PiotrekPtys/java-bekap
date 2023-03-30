package zbiorzadan;

import java.util.Scanner;

public class scaner2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);   
		int x;
		System.out.println("podaj swój rok urodzenia");
		x=sc.nextInt();
		System.out.println(("Gratulacje!!! Masz ")+(2023-x)+(" lat"));

	}

}