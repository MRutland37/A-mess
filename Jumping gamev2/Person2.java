import greenfoot.*;
 
public class Person2 extends Actor
{
    private int ySpeed;
    private int apexTimer;
    private int score = 0;
 
    public Person2()
    {
    }
    
    public int getScore(){
        return this.score;
        }
        
    public void act()
    {
        Actor Person = getOneObjectAtOffset(0, 24, Person.class);
        
        if (Person!=null){
        getWorld().removeObject(Person);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            move (-5);
            Actor platform = getOneIntersectingObject(platform.class);
            if(platform!=null)
            {
                move(5);
            }
            Person = getOneIntersectingObject(Person.class);
            if(Person!=null)
            {
                move(5);
            }
        }
        if(Greenfoot.isKeyDown("d"))
        {
            move (5);
            Actor platform = getOneIntersectingObject(platform.class);
            if(platform!=null)
            {
                move(-5);
            }
            Person = getOneIntersectingObject(Person.class);
            if(Person!=null)
            {
                move(-5);
            }
        }
        int groundLevel2 = getWorld().getHeight() - getImage().getHeight()/2;
        Actor floor = getOneIntersectingObject(floor.class);
        Actor platform = getOneIntersectingObject(platform.class);
        boolean onGround2 = getY() == groundLevel2 || floor!=null;
        if (!onGround2) // in middle of jump
        {
           if (ySpeed == 0 && apexTimer > 0) apexTimer--; // run apex timer
           if (ySpeed == 0 && apexTimer > 0) return; // apex timer still running
           if (floor==null)
           {
               ySpeed++; // adds gravity effect
               setLocation(getX(), getY()+ySpeed); // fall (rising slower or falling faster)}
           }
           if (getY()>=groundLevel2) // has landed (reached ground level)
           {
                setLocation(getX(), groundLevel2); // set on ground
                Greenfoot.getKey(); // clears any key pressed during jump
           }
           if (platform!=null)
           {
               ySpeed = 5; // adds gravity effect
               setLocation(getX(), getY()+ySpeed); // fall (rising slower or falling faster)}
           }
        }
        else // on ground
        {
           if (Greenfoot.isKeyDown("w")) // jump key detected
           {
               ySpeed = -20; // add jump speed
               setLocation(getX(), getY()+ySpeed); // leave ground
               apexTimer = 5;  // set apex timer (adjust value to suit)
           }
        }
    }
}
