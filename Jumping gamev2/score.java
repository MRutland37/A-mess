/**
 * Write a description of class score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
public class score extends Actor 
{
    
    public void run(Person person){
        
        person = getWorld().getObjects(Person.class).get(0);
        
        if (person !=null && person.getScore()>= 1){
            
        }
        
        if (person != null && person.getScore()>= 1){
            Actor p = new Person();
            getWorld().addObject(p, 0, 0);
        }
    }
}
