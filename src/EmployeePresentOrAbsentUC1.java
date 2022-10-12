public class EmployeePresentOrAbsentUC1 {
    public static void main(String[] args){
        double random = Math.random();
        System.out.println(random);
        if(random>0.5) {
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}
