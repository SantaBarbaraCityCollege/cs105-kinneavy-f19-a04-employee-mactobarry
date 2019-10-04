/**
 * CS 105 Theory and Practice I
 * CRN: 38065
 * Assignment: Employee
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author Hongze Jiang
 */
package edu.sbcc.cs105;

/**
 * This class implements an emplyee which is a person with a name and a salary.
 *
 */
public class Employee {

    /**
     * Constructor that creates a new Employee with an initial name and salary.
     * 
     */
     private String employeeName;
     private double currentSalary;
     public Employee(String employeeName, double currentSalary) {
         this.employeeName = employeeName;
         this.currentSalary = currentSalary;
    }

    // Accessors that are obvious and have no side effects don't have to have
    // any documentation unless you are creating a library to be used by other
    // people.
    
    
    public void raiseSalary(double byPercent) {
        double dePercent = byPercent/100;
        double increase = currentSalary * dePercent;
        currentSalary = increase + currentSalary;
    }
        public String getName() {
		return employeeName;
    }

    public double getSalary() {
		return currentSalary;
    }

    /**
     * Raise the salary by the amount specified by the explicit argument.
     * 
     */
    
    
}