package ch15_objects.teacher;

import java.util.Objects;

public class Teacher {
    private String name;
    private String shoolName;

    public Teacher(String name, String shoolName) {
        this.name = name;
        this.shoolName = shoolName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShoolName(String shoolName) {
        this.shoolName = shoolName;
    }

    public String getName() {
        return name;
    }

    public String getShoolName() {
        return shoolName;
    }

    @Override
    public String toString() {
        return name + " 선생님의 근무지는 " + shoolName + "입니다.";
    } //Alt + Ins -> 4번째

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(shoolName, teacher.shoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, shoolName);
    } // Alt + Ins -> 5번째
}
