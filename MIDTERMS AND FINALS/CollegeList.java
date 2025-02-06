import java.util.InputMismatchException;
import java.util.Scanner;

class Person {
    private String name;
    private String contactNum;
    
    public void setName(String n) {
        this.name = n;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setContactNum(String c) {
        this.contactNum = c;
    }
    
    public String getContactNum() {
        return this.contactNum;
    }
}

class Employee extends Person {
    private double salary;
    private String department;
    
    public void setSalary(double s) {
        this.salary = s;
    }
    
    public double getSalary() {
        return this.salary;
    }
    
    public void setDepartment(String d) {
        this.department = d;
    }
    
    public String getDepartment() {
        return this.department;
    }
}

class Faculty extends Employee {
    private boolean status;
    
    public void setStatus(boolean s) {
        this.status = s;
    }
    
    public boolean isRegular() {
        return this.status;
    }
}

class Student extends Person {
    private String program;
    private int yearLevel;
    
    public void setProgram(String p) {
        this.program = p;
    }
    
    public String getProgram() {
        return this.program;
    }
    
    public void setYearLevel(int y) {
        this.yearLevel = y;
    }
    
    public int getYearLevel() {
        return this.yearLevel;
    }
}

public class CollegeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
        char choice = sc.next().charAt(0);
        sc.nextLine();
        
        if (choice == 'E' || choice == 'e') {
            Employee emp = new Employee();
            System.out.println("Type employee's name, contact number, salary, and department: ");
            System.out.println("Press Enter after every input.");
            
            emp.setName(sc.nextLine());
            emp.setContactNum(sc.nextLine());
            
            while (true) {
                try {
                    emp.setSalary(Double.parseDouble(sc.nextLine()));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input.");
                }
            }
            
            emp.setDepartment(sc.nextLine());
            
            System.out.println("\n------------------------------");
            System.out.println("Name: " + emp.getName());
            System.out.println("Contact Number: " + emp.getContactNum());
            System.out.println("Salary: " + emp.getSalary());
            System.out.println("Department: " + emp.getDepartment());
            
        } else if (choice == 'F' || choice == 'f') {
            Faculty fac = new Faculty();
            System.out.println("Type faculty's name, contact number, salary, and department: ");
            System.out.println("Press Enter after every input.");
            
            fac.setName(sc.nextLine());
            fac.setContactNum(sc.nextLine());
            
            while (true) {
                try {
                    fac.setSalary(Double.parseDouble(sc.nextLine()));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input.");
                }
            }
            
            fac.setDepartment(sc.nextLine());
            System.out.println("Is the faculty regular/tenured? (Y/N): ");
            char reg = sc.next().charAt(0);
            fac.setStatus(reg == 'Y' || reg == 'y');
            
            System.out.println("\n------------------------------");
            System.out.println("Name: " + fac.getName());
            System.out.println("Contact Number: " + fac.getContactNum());
            System.out.println("Salary: " + fac.getSalary());
            System.out.println("Department: " + fac.getDepartment());
            System.out.println("Status: " + (fac.isRegular() ? "Regular" : "Not Regular"));
            
        } else if (choice == 'S' || choice == 's') {
            Student stu = new Student();
            System.out.println("Type student's name, contact number, program, and year level: ");
            System.out.println("Press Enter after every input.");
            
            stu.setName(sc.nextLine());
            stu.setContactNum(sc.nextLine());
            stu.setProgram(sc.nextLine());
            
            while (true) {
                try {
                    int year = Integer.parseInt(sc.nextLine());
                    if (year >= 1 && year <= 4) {
                        stu.setYearLevel(year);
                        break;
                    } else {
                        System.out.println("Year level must be from 1 to 4.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input.");
                }
            }
            
            System.out.println("\n------------------------------");
            System.out.println("Name: " + stu.getName());
            System.out.println("Contact Number: " + stu.getContactNum());
            System.out.println("Program: " + stu.getProgram());
            System.out.println("Year Level: " + stu.getYearLevel());
        } else {
            System.out.println("Invalid choice!");
        }
        
        sc.close();
    }
}