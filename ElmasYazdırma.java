package myPackagce2;

import java.util.Scanner;

public class ElmasYazdırma {

	public static void main(String[] args) {
						
		Scanner consoleWish = new Scanner(System.in);
		int diamond;
		System.out.print("Bir sayı giriniz: ");
		diamond = consoleWish.nextInt();
		
		 for (int i = 0; i < diamond; i++) {
			 for (int j = i; j < diamond; j++) {
				 System.out.print(" ");
			 }
			 for (int k = 1; k <= i; k++) {
				 System.out.print("*");
				 System.out.print(" ");
			 }
			 System.out.println(" ");
		 }
		
		for (int i = diamond; 0 < i; i--) {
			for (int j = i; j < diamond; j++) {
				System.out.print(" ");
			}
		    for (int k = 1; k <= i; k++) {
		    	System.out.print("*");
		    	System.out.print(" ");
		    }
		    System.out.println(" ");
		}


	}
	

}
