
// Java program to calculate Employee wage for month.

// Calculate Wages till a condition of total working hours or days is reached for
// a month - Assume 100 hours and 20 days


import java.util.Random;

public class EmployeeWageUC7 {
    public static void main(String[] args) {

        Random random = new Random();
        EmployeeWage empWage = new EmployeeWage();

        int currentDay = 1;
        int totalHrs = 0;
        int totalWage = 0;
        int hoursOfCurrentDay;
        int wage;

        while(empWage.checkCondition(currentDay,totalHrs)){
            int present = random.nextInt(3);
            hoursOfCurrentDay = empWage.getEmployeeHrs(present);
            wage = empWage.getEmployeeWageOfDay(hoursOfCurrentDay);
            totalHrs = totalHrs + hoursOfCurrentDay;
            totalWage =  totalWage + wage;
            currentDay += 1;
        }
        System.out.println("Total Hours of Employee : " + totalHrs);
        System.out.println("Total Wage of Employee : " + totalWage);
    }
}