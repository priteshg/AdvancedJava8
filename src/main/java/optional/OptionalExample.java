package advanced_java_8.optional;

import advanced_java_8.data.Student;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName() {
        //Student student = StudentDataBase.studentSupplier.get();
        Student student = null;
        if (student != null) {
            return student.getName();
        }

        return null;
    }

    public static Optional<String> getStudentNameOptional() {
        //Optional<Student> optionalStudent = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> optionalStudent = Optional.ofNullable(null);
        if (optionalStudent.isPresent()) {
            return optionalStudent.map(Student::getName); //Optional<String>
        }
        return Optional.empty(); // represents an optional value of no value
    }

    public static void main(String[] args) {
//        String name = getStudentName();
//        if (name != null) {
//            System.out.println("length of student: " + name.length());
//        } else {
//            System.out.println("student not found");
//
//        }

        Optional<String> stringOptional = getStudentNameOptional();
        if (stringOptional.isPresent()) {
            System.out.println("length of student: " + stringOptional.get().length());
        }else{
            System.out.println("student not found");
        }
    }
}
