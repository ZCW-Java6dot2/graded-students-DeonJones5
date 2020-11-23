package io.zipcoder;

import java.util.*;

public class Classroom {
    private Student[] students;
    private int maxNumberOfStudents;

    public Classroom(int maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];

    }
    public Classroom(Student[] allStudents){
        this.students = students;

    }
    public Classroom(){
        //Student[] students = new Student[30];
        this(30);



    }
    public Student[] getStudents(){
        return students;
    }

    public double getAverageExamScore(){
        double sumOfAllExamScoreAverage = 0;

        for (Student student : students){
            if (student != null){
                sumOfAllExamScoreAverage += student.getAverageExamScore();
            }
        }
        return Math.round(sumOfAllExamScoreAverage/students.length);
    }

    public Boolean addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (this.students[i] == null) {
                this.students[i] = student;
                return true;
            }

        }
        return false;
    }

    public Boolean removeStudent(String firstName, String lastName){
        Student studentToBeRemoved = null;

        for (Student currentStudent : this.students){
            if (currentStudent.getFirstName().equals(firstName) && currentStudent.getLastName().equals(lastName)){
                studentToBeRemoved = currentStudent;
                break;
            }
        }
        if (studentToBeRemoved == null){
            return false;
        }
        ArrayList<Student> studentsList = new ArrayList<>(Arrays.asList(students));
        studentsList.remove(studentToBeRemoved);

        this.students = studentsList.toArray(this.students);
        return true;

    }
    public Student[] getStudentByScore(){
        ArrayList<Student> studentsList = new ArrayList<>(Arrays.asList(students));

        Collections.reverse(studentsList); // Not sure if this is right?

        return studentsList.toArray(new Student[studentsList.size()]);
    }
    public Map<String, Character> getGradeBook(){
        Map<String, Character> gradeBook= new HashMap();

        int counter;
        int percentage;

        for(int i = 0; i < students.length; i++){
            counter = 0;
            for(int j = 0; j < students.length; j++){
                if(students[i].getAverageExamScore() > students[j].getAverageExamScore()){
                    counter++;
                }
            }
            percentage = (counter * 100)/ (students.length - 1);
            if(percentage > 89){
                gradeBook.put(students[i].toString(), 'A');
            } else if(percentage <= 89 && percentage > 70){
                gradeBook.put(students[i].toString(), 'B');
            } else if (percentage <= 70 && percentage > 49){
                gradeBook.put(students[i].toString(), 'C');
            } else if (percentage <= 49 && percentage > 11){
                gradeBook.put(students[i].toString(), 'D');
            } else {
                gradeBook.put(students[i].toString(), 'F');
            }
        }
        return gradeBook;
    }
}
