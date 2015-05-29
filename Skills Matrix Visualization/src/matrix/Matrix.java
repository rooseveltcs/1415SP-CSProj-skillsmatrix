/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import studentinformation.Student;

/**
 *
 * @author Aaron Jacobson
 */
public class Matrix {
    private File matrixFile;
    private ArrayList<Student> students;
    
    public Matrix(File matrixFile){
        this.matrixFile = matrixFile;
    }
    
    public void readFromFie(){
        this.students = new ArrayList<>();
        try {
            Scanner fileScanner = new Scanner(this.matrixFile);
        } catch (FileNotFoundException ex) {
            System.out.println("Matrix: You gave me a file which doesn't exist!");
        }
    }
}
