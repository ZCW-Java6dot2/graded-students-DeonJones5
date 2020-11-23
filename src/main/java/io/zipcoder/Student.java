package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> testScores;
    private Integer numberOfExamsTaken;




    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.testScores = new ArrayList<Double>(Arrays.asList(testScores));

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTestScores() {
        for (int i = 0; i < testScores.size(); i++) {


        }
        return null;

    }
    public Integer getNumberOfExamsTaken(){
        return numberOfExamsTaken;


    }
    public String getExamScores(){
        return Integer.toString(numberOfExamsTaken);
    }

    public void addExamScore(Double examScore){
        this.testScores.add(examScore);

    }
    public void setExamScore(int examNumber, double newScore){
        this.testScores.get(examNumber);
        this.testScores.add(newScore);

    }
    public double getAverageExamScore(){
        Double testScoreTotal = 0.0;
        for (Double element : this.testScores){
            testScoreTotal += element;
        }
        return Math.round(testScoreTotal / testScores.size());

    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", testScores=" + testScores +
                ", numberOfExamsTaken=" + numberOfExamsTaken +
                '}';
    }
}

