package studentinformation;

import java.util.ArrayList;
import java.util.Date;

/**
 * A snapshot holds a date and the skills matrix information which was
 * gathered on that date. The skills matrix information is stored in 
 * an ArrayList.
 * @author Aaron Jacobson
 */
public class Snapshot {
    private Date date;
    private ArrayList<Skill> skills;

    /**
     *
     * @param date The date that the information for the snapshot was gathered
     * @param skills The information about the skills that were gathered
     * @author Aaron Jacobson
     */
    public Snapshot(Date date,ArrayList<Skill> skills){
        this.date = date;
        this.skills = skills;
    }
    
    /**
     * Sets the date to the new given date
     * @param date The new date to set, as of creating this method I don't see 
     * any use for this method but made it just in case
     * @author Aaron Jacobson
     */
    public void setDate(Date date){
        this.date = date;
    }
    
    /**
     * Sets the skills to an entirely new ArrayList
     * @param skills The ArrayList with all the skills
     * @author Aaron Jacobson
     */
    public void setSkills(ArrayList<Skill> skills){
        this.skills = skills;
    }
    
    /**
     * Returns the date for this snapshot
     * @return The date for this snapshot
     * @author Aaron Jacobson
     */
    public Date getDate(){
        return this.date;
    }
    
    /**
     * Returns the ArrayList of skills associated with this snapshot.
     * If you want to modify the skills it would be best to use this method then
     * modify the ArrayList.
     * @return The ArrayList of skills.
     * @author Aaron Jacobson
     */
    public ArrayList<Skill> getSkills(){
        return this.skills;
    }
}
