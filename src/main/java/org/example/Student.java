package org.example;

public class Student {
    //멤버 변수, 생성자, getter/setter, 멤버 메소드
    private String studentNumber;
    private String Name;
    //
    //마우스 우클릭 -> generate -> 쉬프트 누르면 여러 개 선택 가능
    //


    public Student(String studentNumber, String name) {
        this.studentNumber = studentNumber;
        Name = name;
    }

    public Student() {

    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Student: " + studentNumber + "-" + Name;
    }
}
