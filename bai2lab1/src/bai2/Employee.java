package bai2;
public class Employee {
    private String id;
    private String name;
    private double basicSalary;

    public Employee(String id, String name, double basicSalary) {
        setId(id);
        setName(name);
        setBasicSalary(basicSalary);
    }

    public String getId() {
         return id;   
    }
    public void setId(String id) {
        if (id == null || id.trim().isEmpty())
            throw new IllegalArgumentException("id khong duoc rong");
        this.id = id;
    }

    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }

    public double getBasicSalary() { 
        return basicSalary; 
    }
    public void setBasicSalary(double basicSalary) {
        if (basicSalary < 0)
            throw new IllegalArgumentException("basicSalary phai >= 0");
        this.basicSalary = basicSalary;
    }

    public double income() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return String.format("Employee[id=%s, name=%s, basicSalary=%.2f]", id, name, basicSalary);
    }
}
