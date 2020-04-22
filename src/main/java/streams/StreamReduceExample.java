package advanced_java_8.streams;

import advanced_java_8.data.Student;
import advanced_java_8.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    /**
     * Reduce Terminal operator takes a binaryOperator and unless used with an identity is optional
     *
     * @param intList
     * @return
     */

    public static int performMultiplication(List<Integer> intList) {
        return intList.stream()
                //1,3,5,7
                //a=1, b, 1 (from stream) => 1 returned
                //a=1, b, 3 (from stream) => 3 returned
                //a=3, b, 5 (from stream) => 15 returned
                //a=15, b, 7 (from stream) => 105 returned

                .reduce(1, (a, b) -> a * b);
    }


    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> intList) {
        return intList.stream()
                //1,3,5,7
                //a=1, b, 1 (from stream) => 1 returned
                //a=1, b, 3 (from stream) => 3 returned
                //a=3, b, 5 (from stream) => 15 returned
                //a=15, b, 7 (from stream) => 105 returned
                .reduce((a, b) -> a * b);
    }

    public static Optional<Student> getHighestGPA() {
        //no default value in reduce therefore optional
        return StudentDataBase.getAllStudents().stream()
                //get students one by one
                .reduce((s1, s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
    }

    public static void main(String[] args) {

        List<Integer> listOfInts = Arrays.asList(1, 3, 5, 7);

        System.out.println(performMultiplication(listOfInts));
        System.out.println("without Identity..");
        System.out.println(performMultiplicationWithoutIdentity(listOfInts));
        System.out.println(performMultiplicationWithoutIdentity(listOfInts).isPresent());
        System.out.println(performMultiplicationWithoutIdentity(listOfInts).get());

        if (getHighestGPA().isPresent()) {
            System.out.println(getHighestGPA().get());
        }

    }
}
