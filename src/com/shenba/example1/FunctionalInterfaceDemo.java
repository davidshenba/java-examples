package com.shenba.example1;

public class FunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		
		//reference to a method in object (instance)
		Employee emp = new Employee();
		CompareDates fromEmployeeObj = emp::seniorEmployee;
		
		//here we are using the static method in the DateUtils class
		CompareDates byStaticReference = DateUtils::dateCompare;
		
		//here we are creating an instance of implementation of the functional interface
		CompareDates byImplementation = new CompareDatesImpl();
		
		//Here the date format is known and I don't want to use a generic method.
		//I want an anonymous method that can just do a String compare
		CompareDates byAnonMethod = (String d1, String d2, String df) -> {
			return d1.compareTo(d2);
		};
		
		//This is also an anonymous method. But the datatypes are ignored here
		CompareDates byAnonMethodWithoutDataType = (d1, d2, df) -> {
			return d1.compareTo(d2);
		};
		
		System.out.println("Instance method reference: " + fromEmployeeObj.compareDates("2001-01-12", "2001-02-12", "yyyy-MM-dd"));
		System.out.println("Class method reference: " + byStaticReference.compareDates("2001/01/12 12:30", "2001/01/12 11:30", "uuuu/MM/dd HH:mm"));
		System.out.println("By implementing a functional interface: " + byImplementation.compareDates("01/31/2012", "04/12/2013", "MM/dd/uuuu"));
		System.out.println("Anonymous implementation: " + byAnonMethod.compareDates("1120301", "1120302", ""));
		System.out.println("Anonymous implementation without parameter type: " + byAnonMethodWithoutDataType.compareDates("1120301", "1120302", ""));
	}

}
