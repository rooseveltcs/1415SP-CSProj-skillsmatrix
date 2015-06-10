package studentinformation;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Aaron Jacobson
 */
public class Student{
    
    private String firstName;
    private String lastName;
    private String race;
    private String sex;
    private int grade;
    private int buildSeasons;
    private ArrayList<Snapshot> snapshots;
    private ArrayList<Accomplishment> accomplishments;
    private int favoritePokemonNumber;
    
    
    /**
     * @param firstName the first name of the Student
     * @param lastName the last name of the Student
     * @param race the race of the Student
     * @param sex the sex of the student
     * @param grade what grade the student is in
     * @param buildSeasons the number of build seasons that the student has participated in
     * @param snapshots The snapshots of the Student's skills
     * @param accomplishments A list of accomplishments the Student has completed
     * @param favoritePokemonNumber The pokedex number of the Student's favorite pokemon
     * 
     * @author ros_haremash, Aaron Jacobson
     */
    public Student(String firstName, String lastName, String race, String sex, int grade, int buildSeasons,ArrayList<Snapshot> snapshots,ArrayList<Accomplishment> accomplishments,int favoritePokemonNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.race = race;
        this.sex = sex;
        this.grade = grade;
        this.buildSeasons = buildSeasons;
        this.snapshots = snapshots;
        this.accomplishments = accomplishments;
        this.favoritePokemonNumber = favoritePokemonNumber;
    }
    
    /**
     * @return The snapshot with the most recent date associated with it
     */
    public Snapshot getMostRecentSnapshot(){
        Snapshot recent = snapshots.get(0);
        for(Snapshot s : snapshots){
            if(s.getDate().compareTo(recent.getDate()) > 0){
                recent = s;
            }
        }
        return recent;
    }
    
    /**
     * @param date The date of the snapshot to find
     * @return Will return the first snapshot with the given date, if there is no
     * snapshot with the given date it will return null
     * @author Aaron Jacobson
     */
    public Snapshot getSnapshot(Date date){
        for(Snapshot s : snapshots){
            if(s.getDate().equals(date)){
                return s;
            }
        }
        return null;
    }
    
    /**
     * @return The Student's first name
     * @author Aaron Jacobson
     */
    public String getFirstName(){
        return this.firstName;
    }
    
    /** 
     * @return The Student's last name
     * @author Aaron Jacobson
     */
    public String getLastName(){
        return this.lastName;
    }
    
    /**
     * @return The Student's race
     * @author Aaron Jacobson
     */
    public String getRace(){
        return this.race;
    }
    
    /**
     * @return Will return true if the Student is male, false if not
     * @author Aaron Jacobson
     */
    public String getSex(){
        return this.sex;
    }
    
    /**
     * @return The grade the student is currently in
     * @author Aaron Jacobson
     */
    public int getGrade(){
        return this.grade;
    }
    
    /**
     * @return The number of build season's the student has participated in
     * @author Aaron Jacobson
     */
    public int getBuildSeasons(){
        return this.buildSeasons;
    }
    
    /**
     * @return The ArrayList which holds all of the snapshots associated with 
     * the Student
     * @author Aaron Jacobson
     */
    public ArrayList<Snapshot> getSnapshots(){
        return this.snapshots;
    }
    
    /**
     * @return The ArrayList which holds all the accomplishments associated with
     * the Student
     * @author Aaron Jacobson
     */
    public ArrayList<Accomplishment> getAccomplishments(){
        return this.accomplishments;
    }
    
    /**
     * @return The pokedex number of the Student's favorite pokemon, as of writing
     * this method I only have the first 649 sprites downloaded
     * @author Aaron Jacobson
     */
    public int getFavoritePokemonNumber(){
        return this.favoritePokemonNumber;
    }
}
