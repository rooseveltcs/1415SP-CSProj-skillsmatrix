/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinformation;

/**
 *
 * @author ros_aljacobson001
 */
public class Skill {
    private String name;
    private int skillLevel;
    private int interestLevel;
    public Skill(String name,int level,int interestLevel){
        this.name = name;
        this.skillLevel = level;
        this.interestLevel = interestLevel;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setLevel(int level){
        this.skillLevel = level;
    }
    
    public void setInterestLevel(int interestLevel){
        this.interestLevel = interestLevel;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getLevel(){
        return this.skillLevel;
    }
    
    public int getInterestLevel(){
        return this.interestLevel;
    }
}
