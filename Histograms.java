package week4.histograms;

import java.io.*;
import java.util.*;

import acm.program.ConsoleProgram;

public class Histograms extends ConsoleProgram {
	
	public void run() {
		String filename= "C:\\Users\\moni0\\eclipse-meritamerica-workspace\\Stanford106AAssignmentStarters\\Stanford106AAssignments\\worlds\\MidtermScores.txt";
		try {
			BufferedReader score = new BufferedReader(new FileReader(filename));
			while(true) {
				String sc=score.readLine();
				if(sc==null) break;
				//System.out.println(sc);
				int s=Integer.parseInt(sc.trim());
				arr.add(s);		
			}	
		} catch(IOException e) {
			System.out.println("File not found!!");
		}
		
		System.out.print("00-09:");
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)>=0 && arr.get(i)<=9) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		System.out.print("10-19:");
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)>=10 && arr.get(i)<=19) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		System.out.print("20-29:");
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)>=20 && arr.get(i)<=29) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		System.out.print("30-39:");
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)>=30 && arr.get(i)<=39) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		System.out.print("40-49:");
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)>=40 && arr.get(i)<=49) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		System.out.print("50-59:");
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)>=50 && arr.get(i)<=59) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		System.out.print("60-69:");
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)>=60 && arr.get(i)<=69) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		System.out.print("70-79:");
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)>=70 && arr.get(i)<=79) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		System.out.print("80-89:");
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)>=80 && arr.get(i)<=89) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		System.out.print("90-99:");
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)>=90 && arr.get(i)<=99) {
				System.out.print("*");
			}
		}
		System.out.println();
		
		System.out.print("  100:");
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)>=100) {
				System.out.print("*");
			}
		}	
		
	}
	private ArrayList<Integer> arr=new ArrayList<Integer>(); //arraylist declared as ivar
	
}
