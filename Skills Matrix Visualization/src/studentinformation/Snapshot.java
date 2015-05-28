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
public class Snapshot {
    private Date date;
    private ArrayList<Skill> skills;
    public Snapshot(Date date,ArrayList<Skill> skills){
        this.date = date;
        this.skills = skills;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
    
    public void setSkills(ArrayList<Skill> skills){
        this.skills = skills;
    }
    
    public Date getDate(Date date){
        return this.date;
    }
    
    public ArrayList<Skill> getSkills(){
        return this.skills;
    }
}
