/**
 * Write a description of class score2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
public class score2 extends Actor 
{
    private static Person person;
    private static Person2 person2;
    
    public void setP(Person person){
        this.person = person;
    }
    
    public void setP(Person2 person){
        this.person2 = person;
    }
    
    public void run(){
        
        person = getWorld().getObjects(Person.class).get(0);
        person2 = getWorld().getObjects(Person2.class).get(0);
        
        if (person !=null && person.getScore()>= 1){
            
        }
        
        if (person2 != null && person2.getScore()>= 1){
            Actor p2 = new Person2();
            getWorld().addObject(p2, 0, 0);
        }
    }
}
