package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    private Student learner;
    @Before

    public void setUp() throws Exception {
        Double[] defaultExamScores = {95.00, 68.00, 87.00};
        this.learner = new Student("defaultFirstName", "defaultLastName", defaultExamScores);

    }

    @Test
    public void defaultStudentConstructorWithNoReturn(){
        //Given
        String expectedFirstName = "";
        String expectedLastName = "";
        Double[] examScores = {};
        Student zipCoder = new Student(expectedFirstName, expectedLastName, examScores);
        //When
        String actualFirstName = zipCoder.getFirstName();
        String actualLastName = zipCoder.getLastName();
        //Then

        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
    }

    @Test
    public void testConstructorReturningFirstName(){
        //Arrange
        Double[] examScores = {76.00, 96.00, 79.00};
        Student learner = new Student("Bob", "Johnson", examScores);
        String expectedFirstName = "Bob";
        //actual
        String actualFirstName = learner.getFirstName();

        Assert.assertEquals(expectedFirstName, actualFirstName);

    }
//    @Test
//    public void testConstructorReturningLastName(){
//        //Arrange
//        Double[] examScores = {98.00, 90.00, 88.00};
//        Student learner = new Student("Deon", "Jones", examScores);
//        String expectedLastName = "Deon";
//        //actual
//
//        String actualLastName = learner.getLastName();
//
//        Assert.assertEquals(expectedLastName, actualLastName);
//    }




    @Test
    public void testGetFirstName() {
        // Given
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] testScores = { 100.0, 95.0, 123.0, 96.0};
        Student student = new Student(firstName, lastName, testScores);

        // When
        String output = student.getTestScores();

        // Then
        System.out.println(output);
    }

    @Test

    public void testSetFirstName() {
        //Given
        String expectedFirstName = "Liz";

        //When
        learner.setFirstName(expectedFirstName);
        String actualFirstName = learner.getFirstName();

        //Then
        Assert.assertEquals(expectedFirstName, actualFirstName);
    }
//    @Test

//    public void testGetLastName() {
//        //Given
//        String expectedLastName = "Jones";
//
//        //When
//        learner.setLastName(expectedLastName);
//        String actualLastName = learner.getFirstName();
//
//        //Then
//        Assert.assertEquals(expectedLastName, actualLastName);
//    }
//    @Test
//
//    public void testGetExamScores() {
//        String firstName = "Deon";
//        String lastname = "Jones";
//        Double[] examScores = {85.00, 80.00, 95.00, 98.00};
//        String expectedExamScores = "Exam 1: 85.00 \n Exam 2: 80.00 \n Exam 3: 95.00 \n Exam 4: 98.00";
//
//        Student newStudent = new Student(firstName, lastname, examScores);
//
//        //Actual
//        String actualExamScores = newStudent.getExamScores();
//
//        Assert.assertEquals(expectedExamScores, actualExamScores);
//
//
//    }
//@Test
//    public void testGetNumberOfExamsTaken() {
//        int expectedNumberOfExams = 3;
//
//        //Actual
//        int actualNumberOfExams = learner.getNumberOfExamsTaken();
//
//        Assert.assertEquals(expectedNumberOfExams, actualNumberOfExams);
//    }
//    public void addTestScores(){
//        // Given
//        String firstName = "Leon";
//        String lastName = "Hunter";
//        Double[] testScores = { };
//        Student student = new Student(firstName, lastName, testScores);
//
//        // When
//        student.addExamScore(100.0);
//        String output = student.getTestScores();
//
//        // Then
//        System.out.println(output);
//
//
//    }
}