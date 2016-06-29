/* NetPay.java
 * Author: Alyssa Lagimoniere
 * Submission Date: 1/23/15
 * 
 * Purpose: To display knowledge of variables and primitive data types and how to output those
 * as well as accept input
 * 
 * Statement of Academic Honesty: 
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with 
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia. 
 */

import java.util.Scanner;
public class NetPay {

	public static void main(String[] args) {
		
		/* Define scanner */
		Scanner keyboard = new Scanner(System.in);
		
		/* Define constants */
		final double FEDERAL_TAX_PERCENT = 10.00;
		final double STATE_TAX_PERCENT = 4.5;
		final double SS_PERCENT = 6.2;
		final double MEDICARE_PERCENT = 1.45;
		final double PAY_PER_HOUR = 7.25;
		
		/* Declare variables */
		int hoursPerWeek;
		double grossPay;
		double netPay;
		double federalTax;
		double stateTax;
		double medicare;
		double socialSecurity;
	
		/* Tell users to enter hours per week */
		System.out.print("Hours per Week: \t");
		hoursPerWeek = keyboard.nextInt();
		
		/* Computations */
		grossPay = hoursPerWeek * PAY_PER_HOUR;
		federalTax = ((grossPay * FEDERAL_TAX_PERCENT)/100);
		stateTax = ((grossPay * STATE_TAX_PERCENT)/100);
		socialSecurity = ((grossPay * SS_PERCENT)/100);
		medicare = ((grossPay * MEDICARE_PERCENT)/100);
		netPay = grossPay - federalTax - stateTax - medicare - socialSecurity;
		
		/* Display */
		System.out.println("Gross Pay: \t \t" + grossPay);
		System.out.printf("Net Pay: \t \t" + "%.5f\n", netPay);
		System.out.println("");
		System.out.println("Deductions");
		System.out.println("Federal: \t \t" + federalTax);
		System.out.println("State: \t \t \t" + stateTax);
		System.out.println("Social Security: \t" + socialSecurity);
		System.out.println("Medicare: \t \t" + medicare);
					
	}
		
}
