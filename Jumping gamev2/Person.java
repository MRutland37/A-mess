import greenfoot.*;
 
public class Person extends Actor
{
    private int ySpeed;
    private int apexTimer;
    private int score = 0;
    private static score sc = new score();
 
    public Person()
    {
    }
    
    public int getScore(){
        return this.score;
        }
        
    public void act()
    {
        Actor Person2 = getOneObjectAtOffset(0, 24, Person2.class);
       
        
        
        if (Person2!=null){
        sc.run(this);
        this.score = score + 1;
    }
        
        if(Greenfoot.isKeyDown("left"))
        {
            move (-5);
            Actor platform = getOneIntersectingObject(platform.class);
            if(platform!=null)
            {
                move(5);
            }
            Person2 = getOneIntersectingObject(Person2.class);
            if(Person2!=null)
            {
                move(5);
            }
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move (5);
            Actor platform = getOneIntersectingObject(platform.class);
            if(platform!=null)
            {
                move(-5);
            }
            Person2 = getOneIntersectingObject(Person2.class);
            if(Person2!=null)
            {
                move(-5);
            }
        }
        int groundLevel = getWorld().getHeight() - getImage().getHeight()/2;
        Actor floor = getOneIntersectingObject(floor.class);
        Actor platform = getOneIntersectingObject(platform.class);
        boolean onGround = getY() == groundLevel || floor!=null;
        if (!onGround) // in middle of jump
        {
           if (ySpeed == 0 && apexTimer > 0) apexTimer--; // run apex timer
           if (ySpeed == 0 && apexTimer > 0) return; // apex timer still running
           if (floor==null)
           {
               ySpeed++; // adds gravity effect
               setLocation(getX(), getY()+ySpeed); // fall (rising slower or falling faster)}
           }
           if (getY()>=groundLevel) // has landed (reached ground level)
           {
                setLocation(getX(), groundLevel); // set on ground
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
           if (Greenfoot.isKeyDown("up")) // jump key detected
           {
               ySpeed = -20; // add jump speed
               setLocation(getX(), getY()+ySpeed); // leave ground
               apexTimer = 5;  // set apex timer (adjust value to suit)
           }
        }
    }
    
}