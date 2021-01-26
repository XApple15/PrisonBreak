import greenfoot.*;  

public class Player1 extends Players
{
    public void act() 
    {
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY()-3 + checkObstacle());
            
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-3 + checkObstacle(), getY());
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 3 - checkObstacle());
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 3 - checkObstacle(), getY());
        }
        
    } 
    
    
}
