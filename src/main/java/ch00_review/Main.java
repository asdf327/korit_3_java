package ch00_review;

class Employee {
    private String name;  // 필드는 private로 선언
    private double salary;  // salary도 private

    // public getter와 setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("잘못된 월급 값");
        } else {
            this.salary = salary;
        }
    }

    public String getBonus(){
        if (salary > 50000){
            return "보너스 지급";
        } else {
            return "미지급";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("김미진");
        employee.setSalary(-500);

        System.out.println("이름 : " + employee.getName() + "\n월급 : " + employee.getSalary());
        System.out.println(employee.getBonus());
    }
}
