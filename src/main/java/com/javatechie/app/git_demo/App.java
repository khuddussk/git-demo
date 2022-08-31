package com.javatechie.app.git_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.javatechie.app.git_demo.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Java Techie App Welcome to  Git Demo...!" );
        System.out.println( "Changes done after commiting to locl repo....!" );
        
        //adding new changes 
        
        System.out.println("Emplist...");

		List<Employee> employeeList = new ArrayList<Employee>();

		
		
		employeeList.add(new Employee(1, "Khddus Shaikh", 33, "Male", "DEVELOPEMNT", 2019, 17500.00, Arrays.asList("project 1","project 2")));
		employeeList.add(new Employee(2, "Salman Ahmed",  32, "Male", "STORAGE & DATA BACKUP ", 2019, 50000.00, Arrays.asList("project 3","project 4")));
		employeeList.add(new Employee(3, "Aleem Sayyed",  31, "Male", "DATABASE TEAM", 2019, 35000.00, Arrays.asList("project 5","project 6")));

		

		//1.foreach
		 employeeList.forEach(System.out::println);
			System.out.println("======================================================================================");



    }
}
