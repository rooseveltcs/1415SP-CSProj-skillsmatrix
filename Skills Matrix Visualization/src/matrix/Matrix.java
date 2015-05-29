/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import studentinformation.Snapshot;
import studentinformation.Student;

/**
 *
 * @author Aaron Jacobson
 */
public class Matrix {
    private File matrixFile;
    private ArrayList<Student> students;
    private ArrayList<Date> dates;
    
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
    
    public void organizeStudentsBySkillLevel(String skillName){
        for(int i = 0;i<students.size();i++){
            for(int k =i+1;k<students.size();k++){
//                if(students.get(k).g < students.get(i)){
                
//                }
            }
        }
    }
    
    public void assembleDates(){
        for(Student s: students){
            for(Snapshot sn : s.getSnapshots()){
                
            }
        }
    }
}
