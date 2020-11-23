package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {
    @Test
    public void classroomMaxStudentTest(){
        Classroom classroom = new Classroom(30);
        Integer expectedNumOfStudents = 30;
        Integer actualNumOfStudents = classroom.getStudents().length;

        Assert.assertEquals(expectedNumOfStudents, actualNumOfStudents);

    }
//    @Test
//    public void classroomGetStudentTest(){
//        Double[] examScores = {92.00, 73.00, 69.00, 84.00};
//        Student learner = new Student("Deon", "Jones", examScores);
//        Double[] nextStudentScores = {86.00, 93.00, 65.00, 85.00};
//        Student newStudent = new Student("Jeff", "Jones", nextStudentScores);
//
//        Student[] classroom = {learner, newStudent};
//        Student[] expected = {learner, newStudent};
//
//        Classroom newClass = new Classroom(classroom);
//
//        Student[] actual = newClass.getStudents();
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void getAverageExamScoreTest(){
//        Double[] examScores = {92.00, 73.00, 69.00, 84.00};
//        Student learner = new Student("Deon", "Jones", examScores);
//        Double[] nextStudentScores = {86.00, 93.00, 65.00, 85.00};
//        Student newStudent = new Student("Jeff", "Jones", nextStudentScores);
//
//        Student[] classroom = {learner, newStudent};
//        Double student1 = learner.getAverageExamScore();
//        Double student2 = learner.getAverageExamScore();
//
//
//        Classroom newClass = new Classroom(classroom);
//        Double expected = 79.50;
//        Double expected2 = 82.00;
//
//        Double actual = newClass.getAverageExamScore();
//        Assert.assertEquals(expected, actual);
//    }


}
