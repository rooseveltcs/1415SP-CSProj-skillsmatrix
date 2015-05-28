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
     * The constructor which initializes all the class variables
     * @param name The name of the skill
     * @param level The number which represents skill level
     * @param interestLevel The number which represents interest level in the skill
     * @author Aaron Jacobson
     */
    public Skill(String name,int level,int interestLevel){
        this.name = name;
        this.skillLevel = level;
        this.interestLevel = interestLevel;
    }
    
    /**
     * Sets the name of the skill. As of the creation of this class I don't see
     * a reason to have to change the name of a skill during the program but I
     * made the method just incase.
     * @param name The name which it will be changed to
     * @author Aaron Jacobson
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * Sets the level of the skill. As of the creation of this class I don't see
     * a reason to have to change the level of a skill post-initialization but I
     * made the method just incase.
     * @param level The level which it will be set to
     * @author Aaron Jacobson.
     */
    public void setLevel(int level){
        this.skillLevel = level;
    }
    
    /**
     * Sets the interest level in the skill. As of creation of this class I don't
     * see a reason to have to change the interest level in a skill post-initialization
     * but I made the method just incase.
     * @param interestLevel The level of interest it will be set to
     * @author Aaron Jacobson
     */
    public void setInterestLevel(int interestLevel){
        this.interestLevel = interestLevel;
    }
    
    /**
     * @return the name of the skill
     * @author Aaron Jacobson
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * @return the level of skill
     * @author Aaron Jacobson
     */
    public int getLevel(){
        return this.skillLevel;
    }
    
    /**
     * @return the interest in the skill
     * @author Aaron Jacobson
     */
    public int getInterestLevel(){
        return this.interestLevel;
    }
}
