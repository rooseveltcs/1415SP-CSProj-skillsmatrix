/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinformation;

import java.util.Date;

/**
 *
 * @author ros_aljacobson001
 */
public class Accomplishment {
    private String description;
    private Date date;
    
    public Accomplishment(String description,Date date){
        this.description = description;
        this.date = date;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public Date getDate(){
        return this.date;
    }
}
