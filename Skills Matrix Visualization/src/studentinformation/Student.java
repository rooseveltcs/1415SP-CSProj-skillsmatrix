/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinformation;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ros_aljacobson001
 */
public class Student{
    
    public String firstName;
    public String lastName;
    public String race;
    public boolean isMale;
    public int grade;
    public int buildSeasons;
    public ArrayList<String> skills;
    public ArrayList<Integer> skillLevel;
    public ArrayList<Integer> interestLevel;
    public String acomplishments;
    public Date date;
    
    
    /**
     * @param firstName the first name of the Student
     * @param lastName the last name of the Student
     * @param race the race of the Student
     * @param isMale if true the student is male if not they are female
     * @param grade what grade the student is in
     * @param buildSeasons the number of build seasons that the student has participated in
     * @param skills contains all of the skills in the skills matrix that are relevant to the student
     * @param skillLevel contains the student's skill level in all of the skills in the skills matrix that are relevant to the student
     * @param interestLevel contains the student's interest level in all of the skills in the skills matrix that are relevant to the student
     * @param acomplishments general text which contains all of the student's personal achievements
     * @param date the last known time that this student's information was updated
     * 
     * 
     * @author ros_haremash
     */
    public Student(String firstName, String lastName, String race, boolean isMale, int grade, int buildSeasons, ArrayList skills, ArrayList skillLevel, ArrayList interestLevel, String acomplishments, Date date){
        this.firstName = firstName;
        this.lastName = lastName;
        this.race = race;
        this.isMale = isMale;
        this.grade = grade;
        this.buildSeasons = buildSeasons;
        this.skills = skills;
        this.skillLevel = skillLevel;
        this.interestLevel = interestLevel;
        this.acomplishments = acomplishments;
        this.date = date;
        
    }
}
