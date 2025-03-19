package ch10_setter_getter.univ_student;
/*

 */

public class UnivStudent {
    private String name;
    private int grade;
    private double scotr;

    public UnivStudent() {

    }

    public UnivStudent(String name) {
        this.name = name;
    }

    public UnivStudent(int grade) {
        this.grade = grade;
    }

    public UnivStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public UnivStudent(double scotr, int grade, String name) {
        this.scotr = scotr;
        this.grade = grade;
        this.name = name;
    }

    public void setScotr(double scotr){
        if (scotr < 0.0 || scotr > 4.5){
            System.out.println("범위를 벗어남");
        }
        this.scotr = scotr;
//        System.out.println(scotr);
    }

    public void setGrade(int grade){
        if (grade < 1 || grade > 4){
            System.out.println("범위를 벗어남");
        }
        this.grade = grade;
//        System.out.println(grade);
    }

    public void setName(String name){
        this.name = name;
    }


    public double getScotr(){
        return scotr;
    }

    public int getGrade(){
        return grade;
    }

    public String getName(){
        return name;
    }

    void showInfo(){
        System.out.println("이름 : " + this.name + "\n학년 : " + grade + "\n점수 : " + this.scotr + "\n");
    }
}
