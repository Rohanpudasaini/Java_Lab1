public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setSalary(45000);
        employee1.setName("Rohan");
        employee1.setId(1001);
        // employee1.setClass();
        System.out.println(employee1.getSalary());
        System.out.println(employee1.getName());
        System.out.println(employee1.getId());
        System.out.println(employee1.getClass());
}
}
