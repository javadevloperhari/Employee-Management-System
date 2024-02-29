package com.empapp;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		int id;
		String name;
		Employeeinterf eitrf=new Employeeimpl();
		System.out.println("welcome to employee management apllication");
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1.Add Employee \n" + 
					"2.Show All Employee \n" + 
					"3.Show Employy Based On id \n" + 
					"4.Update Employee \n" +
					"5.Delete The Employee \n");
			System.out.println("Enter Choice ");
			int ch=sc.nextInt();
			switch(ch) {
				case 1:
					Employee emp=new Employee();
					System.out.println("Enter Id:");
					id=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Name:");
					name=sc.nextLine();
					System.out.println("Enter Salery:");
					double salery=sc.nextInt();
					System.out.println("Enter Age:");
					int age=sc.nextInt();
					
					emp.setId(id);  
					emp.setName(name);
					emp.setSalery(salery);
					emp.setAge(age);
					eitrf.createEmployee(emp);
					break;
				case 2:
					eitrf.showAllEmployee();
					break;
				case 3:
					System.out.println("Enter Id To Show The Detailes...:");
					int empid=sc.nextInt();
					eitrf.showEmployeeBasedOnId(empid);
					break;
				case 4:
					System.out.println("Enter Id To Update The Detailes...:");
					int empid1=sc.nextInt();
					sc.nextLine();
					System.out.println("Enter The New Name  :");
					name=sc.nextLine();
					eitrf.updateEmployee(empid1, name);
					break;
				case 5:
					System.out.println("Enter Id To Delete  :");
					int empid2=sc.nextInt();
					eitrf.deleteemployee(empid2);
					break;
				case 6:	
					System.out.println("Thanks For Using Our Application!!!!");
					System.exit(0);
					default:
						System.out.println("Enter Valid Choice....!");
					
			}
		}while(true);
	}

}
