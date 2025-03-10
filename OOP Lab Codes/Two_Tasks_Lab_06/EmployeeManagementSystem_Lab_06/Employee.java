
package EmployeeManagementSystem;


abstract class Employee {
    String name;
    int id;
    public abstract calculateSalary(){
                                       }
    Employee (String name, int id){
        this.name = name;
        this.id = id; 
}
    public void displayDetails(){
        System.out.println("Name"+name);
        System.out.println("Id"+id);
    }
}
