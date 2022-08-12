package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStudentID(String name){
        this.studentId = studentId;
    }

    private void setNumberOfCredits(String name){
        this.numberOfCredits = numberOfCredits;
    }

    public void setGpa(String name){
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    public int getStudentID(){
        return this.studentId;
    }

    private int getNumberOfCredits(){
        return this.numberOfCredits;
    }

    public double getGpa(){
        return this.gpa;
    }
}