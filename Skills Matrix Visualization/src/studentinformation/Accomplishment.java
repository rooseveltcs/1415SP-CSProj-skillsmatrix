package studentinformation;

import java.util.Date;

/**
 * This class holds an accomplishment that was completed and the date of completion
 * The purpose of this class is to hold relevant information which might indicate a difference
 * in skill levels among members
 * @author Aaron Jacobson
 */
public class Accomplishment {
    private String description;
    private Date date;
    
    /**
     * The constructor which initializes the class fields
     * @param description A description of the achievement
     * @param date The date of completion
     * @author Aaron Jacobson
     */
    public Accomplishment(String description,Date date){
        this.description = description;
        this.date = date;
    }
    
    /**
     * Sets the description of the accomplishment. As of creating this class
     * I don't see a reason to have to change it post-initialization but I made
     * the method just incase.
     * @param description The new description it will be set to
     * @author Aaron Jacobson
     */
    public void setDescription(String description){
        this.description = description;
    }
    
    /**
     * Sets the date of the accomplishment, as of creating this class I don't 
     * see a reason to have to change the date post-initialization but I made
     * the method just incase.
     * @param date The new date it will be set to
     * @author Aaron Jacobson
     */
    public void setDate(Date date){
        this.date = date;
    }
    
    /**
     * @return The description of the accomplishment
     * @author Aaron Jacobson
     */
    public String getDescription(){
        return this.description;
    }
    
    /**
     * @return The date that the accomplishment was completed
     * @author Aaron Jacobson
     */
    public Date getDate(){
        return this.date;
    }
}
