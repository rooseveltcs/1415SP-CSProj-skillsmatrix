package studentinformation;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ros_aljacobson001
 */
public class Student{
    
    private String firstName;
    private String lastName;
    private String race;
    private boolean isMale;
    private int grade;
    private int buildSeasons;
    private ArrayList<Snapshot> snapshots;
    private ArrayList<Accomplishment> accomplishments;
    
    
    /**
     * @param firstName the first name of the Student
     * @param lastName the last name of the Student
     * @param race the race of the Student
     * @param isMale if true the student is male if not they are female
     * @param grade what grade the student is in
     * @param buildSeasons the number of build seasons that the student has participated in
     * 
     * 
     * @author ros_haremash
     */
    public Student(String firstName, String lastName, String race, boolean isMale, int grade, int buildSeasons,ArrayList<Snapshot> snapshots,ArrayList<Accomplishment> accomplishments){
        this.firstName = firstName;
        this.lastName = lastName;
        this.race = race;
        this.isMale = isMale;
        this.grade = grade;
        this.buildSeasons = buildSeasons;
        this.snapshots = snapshots;
        this.accomplishments = accomplishments;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public String getRace(){
        return this.race;
    }
    
    public boolean getIsMale(){
        return this.isMale;
    }
    
    public int getGrade(){
        return this.grade;
    }
    
    public int getBuildSeasons(){
        return this.buildSeasons;
    }
    
    public ArrayList<Snapshot> getSnapshots(){
        return this.snapshots;
    }
    
    public ArrayList<Accomplishment> getAccomplishments(){
        return this.accomplishments;
    }
}
