package com.bridgelabz;

public class EmployeeWage {

        public void computeEmployeeWage(int wagePerHr, int totalWorkingDays, int totalWorkingHrs)
        {
        int fullTimeHrs = 8;
        int partTimeHrs = 4;
        int totalHrs = 0;
        int days = 0;

        while (totalHrs < totalWorkingHrs && days < totalWorkingDays)
        {
            days++;
            int isPresent = (int) Math.floor(Math.random()*10)%3;
            switch (isPresent){
                case 1:
                    totalHrs =totalHrs+ fullTimeHrs;
                    break;
                case 2:
                    totalHrs = totalHrs+ partTimeHrs;
                    break;
                default:
                    totalHrs = totalHrs+ 0;

            }
        }
        System.out.println("Monthly wage : "+ totalHrs*wagePerHr);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        EmployeeWage e1 = new EmployeeWage();
        e1.computeEmployeeWage(40, 40, 100);
        EmployeeWage e2 = new EmployeeWage();
        e2.computeEmployeeWage(50, 30, 100);

    }
}