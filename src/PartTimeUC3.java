public class PartTimeUC3 {
            public static void main(String[] args){
                int isPartTime = 1;
                int isFullTime = 2;
                int empRatePerHr = 20;
                int empHrs = 0;
                double empCheck = Math.floor(Math.random() * 10) % 3;
                if(isPartTime == empCheck) {
                    empHrs = 8;
                }
                else if(isFullTime == empCheck) {
                    empHrs = 16;
                }
                else{
                    empHrs = 0;
                }
                int salary = (empHrs * empRatePerHr);
                System.out.println("Employee salary is:"+salary);
            }
        }


