package matrix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import studentinformation.Accomplishment;
import studentinformation.Skill;
import studentinformation.Snapshot;
import studentinformation.Student;

/**
 *
 * @author Aaron Jacobson
 */
public class Matrix {

    public static final String DEMOGRAPHICS_TAG = "DEMOGRAPHICS";
    public static final String SKILLS_TAG = "SKILLS";
    public static final String STUDENTS_TAG = "STUDENTS";
    private File matrixFile;
    private ArrayList<Student> students;
    private ArrayList<Date> dates;
    private Date currentDate;
    private ArrayList<String> categories;
    private ArrayList<String> skillNames;
    private boolean onDemographics;
    private boolean onSkills;
    private boolean onStudents;

    /**
     * The constructor which initializes the class fields
     *
     * @param matrixFile The File that the matrix is in, as of writing this
     * method there is no file reading
     * @author Aaron Jacobson
     */
    public Matrix(File matrixFile) {
        this.matrixFile = matrixFile;
        this.students = new ArrayList<>();
        this.dates = new ArrayList<>();
        this.skillNames = new ArrayList<>();
    }

    /**
     * WIP will read the file and use the information to construct the matrix
     *
     * @author Aaron Jacobson
     */
    public void initializeFileScanner() {
        try {
            Scanner fileScanner = new Scanner(this.matrixFile);
            readFile(fileScanner);
            System.out.println("Read the file.");
        } catch (FileNotFoundException ex) {
            System.out.println("Matrix: You gave me a file which doesn't exist!");
        }
    }

    public String[] getColumnNames() {
        ArrayList columnNamesList = new ArrayList<>();
        for (String s : getSkillNames()) {
            columnNamesList.add(s + " Skill Level");
            columnNamesList.add(s + " Interest Level");
        }
        return (String[]) columnNamesList.toArray();
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public ArrayList<String> getSkillNames() {
        ArrayList<String> skillNames = new ArrayList<>();
        for (Student s : students) {
            for (Snapshot sn : s.getSnapshots()) {
                for (Skill sk : sn.getSkills()) {
                    if (!skillNames.contains(sk.getName())) {
                        skillNames.add(sk.getName());
                    }
                }
            }
        }
        return skillNames;
    }
    
    public void readCSVFile(Scanner fileScanner){
        categories = new ArrayList<>();
        onDemographics = false;
        onSkills = false;
        onStudents = false;
        while(fileScanner.hasNext()){
            String next = fileScanner.next();
            if(next.startsWith(",")){
                next = next.substring(1);
            }else if(next.endsWith(",")){
                next = next.substring(0, next.length()-2);
            }else if(next.contains(",")){
                String[] multipleValues = next.split(",");
            }else{
                
            }
        }
    }
    
    private void processNextValue(String next){
        if(next.equals(DEMOGRAPHICS_TAG)){
            System.out.println("Found the demographics tag.");
            onDemographics = true;
            onSkills = false;
            onStudents = false;
        }else if(next.equals(SKILLS_TAG)){
            System.out.println("Found the skills tag.");
            onDemographics = false;
            onSkills = true;
            onStudents = false;
        }else if(next.equals(STUDENTS_TAG)){
            System.out.println("Found the students tag.");
            onDemographics = false;
            onSkills = false;
            onStudents = true;
        }
    }

    private void readFile(Scanner fileScanner) {
        categories = new ArrayList<>();
        onDemographics = false;
        onSkills = false;
        onStudents = false;
        while (fileScanner.hasNext()) {
            String next = fileScanner.next();
            if (next.equals(DEMOGRAPHICS_TAG)) {
                System.out.println("Found demographics tag.");
                onDemographics = true;
                onSkills = false;
                onStudents = false;
            } else if (next.equals(SKILLS_TAG)) {
                System.out.println("Found the skills tag");
                onSkills = true;
                onDemographics = false;
                onStudents = false;
            } else if (next.equals(STUDENTS_TAG)) {
                System.out.println("Found the students tag");
                onStudents = true;
                onDemographics = false;
                onSkills = false;
            }
//            System.out.println("Matrix: " + next);
            if (onDemographics) {
                System.out.println("Adding new demographic: " + next);
                categories.add(next);
            } else if (onSkills) {
                categories.add(next);
                if (next.endsWith("Skill")) {
                    System.out.println("Adding new skill : " + next);
                    skillNames.add(next);
                } else if (next.endsWith("Interest")) {
                }
            } else if (onStudents) {
                String firstName;
                if(students.size() == 0){
                    firstName = fileScanner.next();
                }else{
                    firstName = next;
                }
//                System.out.println("First Name: " + firstName);
                String lastName = fileScanner.next();
//                System.out.println("Last Name: " + lastName);
                String race = fileScanner.next();
//                System.out.println("Race: " + race);
                String sex = fileScanner.next();
//                System.out.println("Sex: " + sex);
                int gradeLevel = fileScanner.nextInt();
//                System.out.println("Grade Level: " + gradeLevel);
                int favoritePokemonNumber = fileScanner.nextInt();
//                System.out.println("Favorite Pokemon Number: " + favoritePokemonNumber);
                int numBuildSeasons = fileScanner.nextInt();
//                System.out.println("Number of Build Seasons: " + numBuildSeasons);
                ArrayList<Skill> skills = new ArrayList<>();
                for (int currentSkill = 0; currentSkill < skillNames.size(); currentSkill++) {
//                    System.out.println(fileScanner.next() + " " + fileScanner.next());
                    skills.add(new Skill(skillNames.get(currentSkill), fileScanner.nextInt(), fileScanner.nextInt()));
//                    System.out.println(skills.get(currentSkill).getName() + " " + skills.get(currentSkill).getLevel() + " " + skills.get(currentSkill).getInterestLevel());
                }
                Snapshot snapshot = new Snapshot(new Date(), skills);
                ArrayList<Snapshot> snapshots = new ArrayList<>();
                snapshots.add(snapshot);
                ArrayList<Accomplishment> accomplishments = new ArrayList<>();
                Student student = new Student(firstName, lastName, race, sex, gradeLevel, numBuildSeasons, snapshots, accomplishments, favoritePokemonNumber);
                students.add(student);
            }
        }
        System.out.println("Nothing left in the file.");
    }

    /**
     * Will organize the Students by skill level in the given skill least to
     * greatest
     *
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
     * the matrix and gathers all the dates that can be found. It shouldn't add
     * the same date twice.
     *
     * @author Aaron Jacobson
     */
    public void assembleDates() {
        for (Student s : students) {
            for (Snapshot sn : s.getSnapshots()) {
                if (!dates.contains(sn.getDate())) {
                    dates.add(sn.getDate());
                }
            }
            for (Accomplishment a : s.getAccomplishments()) {
                if (!dates.contains(a.getDate())) {
                    dates.add(a.getDate());
                }
            }
        }
        currentDate = dates.get(dates.size() - 1);
    }
}
