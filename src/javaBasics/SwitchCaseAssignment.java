package javaBasics;

public class SwitchCaseAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String browser = "Chrome";
		
		switch (browser) {
		case "Chrome":
			System.out.println("Chrome Browser");
			break;
		case "Firefox":
			System.out.println("FireFox Browser");
			break;
		case "Edge":
			System.out.println("Edge Browser");
			break;
		case "Safari":
			System.out.println("Safari Browser");
			break;
			
		default:
			System.out.println("Give the correct browser name");
		}
		//********************
		int a = 25;
		int b = 56;
		int c = 25;
		
		if(a>=b & a>=c) {
			System.out.println("a is greatest");
		}
		else if(b>=a & b>=c) {
			System.out.println("b is greatest");
		}
		else if(c>=a & c>=b) {
			System.out.println("c is greatest");
		}
		else {
			System.out.println("All are equal");
		}
		
		//********************
		
		int a1 = 25;
		int b1 = 1200;
		int c1 = 156;
		int d1 = 25;
		
		
		if(a1>=b1 & a1>=c1 & a1>=d1) {
			System.out.println(a1);
		}
		else if(b1>=a1 & b1>=c1 & b1>=d1) {
			System.out.println(b1);
		}
		else if(c1>=a1 & c1>=b1 & c1>=d1) {
			System.out.println(c1);
		}
		else if(d1>=a1 & d1>=b1 & d1>=c1) {
			System.out.println(d1);
		}
		else {
			System.out.println("All are equal");
		}
		
		//********************
		
		int m = -2;
		
		if(m>=0) {
			System.out.println("+ve number");
		}
		else {
			System.out.println("-ve number");
		}
		
		//********************
		
		if(m%2 == 0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		
		//********************
		
		String env = "Uat";
		
		switch (env.toLowerCase().trim()) {
		
		case "dev": {
			System.out.println("Run in Dev Env");
			break;
		}
		case "stg": {
			System.out.println("Run in Stage Env");
			break;
		}
		case "uat": {
			System.out.println("Run in UAT Env");
			break;
		}
		case "prod": {
			System.out.println("Run in Prod Env");
			break;
		}	
		default:
			System.out.println("Run in QA Env");
			break;
		}
		
		//********************
		
		String carType = "miNi";
		
		switch (carType.toLowerCase().trim()) {
		case "mini": {
			System.out.println("Mini is booked");
			break;
		}
		case "sedan": {
			System.out.println("Sedan is booked");
			break;
		}
		case "suv": {
			System.out.println("SUV is booked");
			break;
		}
		case "premium": {
			System.out.println("Premium is booked");
			break;
		}
		default:
			System.out.println("Please select the right car type");
			break;
		}
		
		//********************
		
		String loanType = "Housing Loan";
		double salary = 38000;
		
		switch (loanType) {
		case "Car Loan": {
			System.out.println("12%");
			break;
		}
		case "Housing Loan": {
			if(salary<35000) {
				System.out.println("Not Applicable for the Housing Loan");
			}else {
				System.out.println("10%");
			}
			break;
		}
		case "Personal Loan": {
			System.out.println("11%");
			break;
		}
		case "Education Loan": {
			System.out.println("10.75%");
			break;
		}
		default:
			System.out.println("What type of loan do you want?");
		}

	}

}

