package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class StreamMapReduceExample {

    private static int noOfNoteBooks() {
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
                .filter((s) -> s.getGradeLevel() >= 3)
                .map(Student::getNoteBooks) // Stream<Integer>
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(noOfNoteBooks());
    }
}
