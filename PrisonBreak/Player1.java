import greenfoot.*;  

public class Player1 extends Prisoners
{
    public void act() 
    {
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY()-3);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-3, getY());
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY()+3);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX()+3, getY());
        }
    } 
    
    
}
