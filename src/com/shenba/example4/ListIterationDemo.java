package com.shenba.example4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterationDemo {

	private static void printMarkSheetWithFor(List<MarkSheet> markList) {
		for(int i = 0; i < markList.size(); i++) {
			MarkSheet ms = markList.get(i);
			int total = ms.getMark1() + ms.getMark2() + ms.getMark3();
			System.out.println("Reg No: " + ms.getRegNo() + " Total: " + total);
		}
	}
	
	private static void printMarkSheetWithIterator(List<MarkSheet> markList) {
		Iterator<MarkSheet> msIter = markList.iterator();
		while(msIter.hasNext()) {
			MarkSheet ms = msIter.next();
			int total = ms.getMark1() + ms.getMark2() + ms.getMark3();
			System.out.println("Reg No: " + ms.getRegNo() + " Total: " + total);
		}
	}
	
	private static void printMarkSheetWithEnhancedFor(List<MarkSheet> markList) {
		for(MarkSheet ms : markList) {
			int total = ms.getMark1() + ms.getMark2() + ms.getMark3();
			System.out.println("Reg No: " + ms.getRegNo() + " Total: " + total);
		}
	}
	
	private static void printMarkSheetWithForEach(List<MarkSheet> markList) {
		markList.forEach(ms -> System.out.println("Reg No: " + ms.getRegNo() + " Total: " + (ms.getMark1() + ms.getMark2() + ms.getMark3())));
	}
	
	public static void main(String[] args) {
		
		List<MarkSheet> markList = new ArrayList<MarkSheet>();
		markList.add(new MarkSheet());
		markList.add(new MarkSheet());
		markList.add(new MarkSheet());
		markList.add(new MarkSheet());
		markList.add(new MarkSheet());
		
		System.out.println("*****printMarkSheetWithFor*****");
		printMarkSheetWithFor(markList);
		System.out.println("\n*****printMarkSheetWithIterator*****");
		printMarkSheetWithIterator(markList);
		System.out.println("\n*****printMarkSheetWithEnhancedFor*****");
		printMarkSheetWithEnhancedFor(markList);
		System.out.println("\n*****printMarkSheetWithForEach*****");
		printMarkSheetWithForEach(markList);
	}
	
}
