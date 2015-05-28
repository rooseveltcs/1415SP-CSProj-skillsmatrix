package studentinformation;

import java.util.Date;

/**
 *
 * @author ros_aljacobson001
 */
public class Accomplishment {
    private String description;
    private Date date;
    
    /**
     *
     * @param description
     * @param date
     */
    public Accomplishment(String description,Date date){
        this.description = description;
        this.date = date;
    }
    
    /**
     *
     * @param description
     */
    public void setDescription(String description){
        this.description = description;
    }
    
    /**
     *
     * @param date
     */
    public void setDate(Date date){
        this.date = date;
    }
    
    /**
     *
     * @return
     */
    public String getDescription(){
        return this.description;
    }
    
    /**
     *
     * @return
     */
    public Date getDate(){
        return this.date;
    }
}
