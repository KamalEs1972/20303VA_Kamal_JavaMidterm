package design;

import databases.ConnectToSqlDB;

public class FortuneEmployee {

    public static void main(String[] args) {
        EmployeeInfo e=new EmployeeInfo();
        System.out.println(e.isFullTimeEmployee(35));
        System.out.println(e.getNumberOfhours(40));
        e.vacation();
        EmployeeInfo.calculateEmployeeBonus(95.000,8);
        EmployeeInfo.calculateEmployeePension();
        System.out.println(e.generateEmailAddress());
        e.assignDepartment();
        ConnectToSqlDB dt = new ConnectToSqlDB();
        ConnectToSqlDB.readUserProfileFromSqlTable();

    }

}