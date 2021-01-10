import java.util.ArrayList;

class Employee{
    private String name;
    private int experience;
    Employee(String name, int experience){
        this.name = name;
        this.experience = experience;
    }
    int getExperience()
    {
        return experience;
    }
    String getName(){
        return name;
    }
}

public class EmployeeStream {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>(){{
           add(new Employee("Pramod", 5));
           add(new Employee("Rakesh", 7));
           add(new Employee("Sunil", 11));
           add(new Employee("Yuvraj", 14));
           add(new Employee("Varun", 3));
        }};
        int limit = 10;
        System.out.println("All employee's in the company");
        employeeList.stream().map(employee1 -> "Name : " + employee1.getName() + "   Experience : " + employee1.getExperience()).forEach(System.out::println);

        System.out.println("Employee's with less than 10 year's of experience");

        employeeList.stream().filter(employee -> employee.getExperience() < limit).map(employee -> "Name : " + employee.getName() + "   Experience : " + employee.getExperience()).forEach(System.out::println);
    }
}
