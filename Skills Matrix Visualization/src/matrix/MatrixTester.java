/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.io.File;
import studentinformation.Student;

/**
 *
 * @author ros_aljacobson001
 */
public class MatrixTester {

    public static void main(String[] args) {
        Matrix matrix = new Matrix(new File("H:\\My Documents\\1415SP-CSProj-skillsmatrix\\Skills Matrix Visualization\\src\\matrix\\skills matrix.txt"));
        matrix.initializeFileScanner();
        System.out.println("Size: " + matrix.getStudents().size());
        for (Student s : matrix.getStudents()) {
            System.out.println(s.getLastName() + ", " + s.getFirstName());
        }
    }
}
