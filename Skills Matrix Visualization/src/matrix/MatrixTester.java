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
    public static void main(String[] args){
        Matrix matrix = new Matrix(new File("skills matrix.txt"));
        matrix.initializeFileScanner();
        System.out.println("This should work.");
        for(Student s : matrix.getStudents()){
            System.out.println(s.getLastName() + ", " + s.getFirstName());
        }
    }
}
