import greenfoot.*;  

public class Player1 extends Players
{
    public void act() 
    {
      
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY()-3);
            if(hitObject())
            {
                setLocation(getX(), getY()+3);
            }
            setImage( "Players/Player1/Pl_1_back.png");
            
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-3, getY());
            if(hitObject())
            {
            setLocation(getX()+3, getY());
            }
            setImage( "Players/Player1/Pl_1_left.png");
            
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 3);
            if(hitObject())
            {
                setLocation(getX(), getY()-3);
            }
            setImage( "Players/Player1/Pl_1_front.png");
            
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 3, getY());
            if(hitObject())
            {
            setLocation(getX() - 3, getY());
            }
            setImage( "Players/Player1/Pl_1_right.png");
            
        }
    } 
    public Player1()
    {
        setImage("Players/Player1/Pl_1_left.png");
        
    }

}
