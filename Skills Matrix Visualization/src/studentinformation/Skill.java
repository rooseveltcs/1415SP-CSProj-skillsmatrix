package studentinformation;

/**
 * This class holds the name of the skill associated with it, and the skill 
 * level and interest level of the person at the time of gathering the 
 * information.
 * @author Aaron Jacobson
 */
public class Skill {
    private String name;
    private int skillLevel;
    private int interestLevel;

    /**
     *
     * @param name
     * @param level
     * @param interestLevel
     */
    public Skill(String name,int level,int interestLevel){
        this.name = name;
        this.skillLevel = level;
        this.interestLevel = interestLevel;
    }
    
    /**
     *
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     *
     * @param level
     */
    public void setLevel(int level){
        this.skillLevel = level;
    }
    
    /**
     *
     * @param interestLevel
     */
    public void setInterestLevel(int interestLevel){
        this.interestLevel = interestLevel;
    }
    
    /**
     *
     * @return
     */
    public String getName(){
        return this.name;
    }
    
    /**
     *
     * @return
     */
    public int getLevel(){
        return this.skillLevel;
    }
    
    /**
     *
     * @return
     */
    public int getInterestLevel(){
        return this.interestLevel;
    }
}
