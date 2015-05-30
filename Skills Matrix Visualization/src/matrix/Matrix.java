package matrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import studentinformation.Accomplishment;
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
    private Date currentDate;

    /**
     * The constructor which initializes the class fields
     * @param matrixFile The File that the matrix is in, as of writing this method
     * there is no file reading
     * @author Aaron Jacobson
     */
    public Matrix(File matrixFile) {
        this.matrixFile = matrixFile;
        this.students = new ArrayList<>();
        this.dates = new ArrayList<>();
    }

    /**
     * WIP will read the file and use the information to construct the matrix
     * @author Aaron Jacobson
     */
    public void readFromFie() {
        try {
            Scanner fileScanner = new Scanner(this.matrixFile);
        } catch (FileNotFoundException ex) {
            System.out.println("Matrix: You gave me a file which doesn't exist!");
        }
    }

    /**
     * Will organize the Students by skill level in the given skill least to greatest
     * @param skillName The name of the skill to compare the Students by
     * @author Aaron Jacobson
     */
    public void organizeStudentsBySkillLevel(String skillName) {
        for (int i = 0; i < students.size(); i++) {
            Student currentStudent = students.get(i);
            for (int k = students.size() - 1; k > i; k--) {
                Student compareStudent = students.get(k);
                if (currentStudent.getSnapshot(currentDate).getSkill(skillName).getLevel() > compareStudent.getSnapshot(currentDate).getSkill(skillName).getLevel()) {
                    i--;
                    if (k >= students.size() - 1) {
                        students.add(currentStudent);
                    } else {
                        students.add(k + 1, currentStudent);
                    }
                }
            }
        }
    }

    /**
     * Goes through all the snapshots and accomplishments from every student in
     * the matrix and gathers all the dates that can be found. It shouldn't
     * add the same date twice.
     * @author Aaron Jacobson
     */
    public void assembleDates() {
        for (Student s : students) {
            for (Snapshot sn : s.getSnapshots()) {
                if (!dates.contains(sn.getDate())) {
                    dates.add(sn.getDate());
                }
            }
            for(Accomplishment a : s.getAccomplishments()){
                if(!dates.contains(a.getDate())){
                    dates.add(a.getDate());
                }
            }
        }
        currentDate = dates.get(dates.size() - 1);
    }
}
