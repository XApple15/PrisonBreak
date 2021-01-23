import greenfoot.*;

public class Player2 extends Prisoners
{
  public Player2()
    {
    }
  public void act() 
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-3);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-3, getY());
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+3);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+3, getY());
        }
    }    
}
