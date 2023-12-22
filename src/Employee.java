public class Employee {
    private int id;
    private double salary;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSalary() {
        return ("Salary for employee "+ name + " with Id "+id +" is "+ salary);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
