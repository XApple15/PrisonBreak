import greenfoot.*;  
import java.util.List;

public class Player2 extends Players
{
    public void act() 
    {
        LostGame();
        Movement();
    }

    public Player2()
    {
        setImage( "Players/Player2/Pl_2_left.png");
    }
    public void Movement()
    {
        List setting = getWorld().getObjects(SettingMenu.class);
        if(setting.size() == 0)
        {
            if(Greenfoot.isKeyDown("up"))
            {
                setLocation(getX(), getY()-3);
                if(hitObject())
                {
                    setLocation(getX(), getY()+3);
                }
                setImage( "Players/Player2/Pl_2_back.png");            
            }
            if(Greenfoot.isKeyDown("left"))
            {
                setLocation(getX()-3, getY());
                if(hitObject())
                {
                    setLocation(getX()+3, getY());
                }
                setImage( "Players/Player2/Pl_2_left.png");           
            }
            if(Greenfoot.isKeyDown("down"))
            {
                setLocation(getX(), getY() + 3);
                if(hitObject())
                {
                    setLocation(getX(), getY()-3);
                }
                setImage( "Players/Player2/Pl_2_front.png");            
            }
            if(Greenfoot.isKeyDown("right"))
            {
                setLocation(getX() + 3, getY());
                if(hitObject())
                {
                    setLocation(getX() - 3, getY());
                }
                setImage( "Players/Player2/Pl_2_right.png");            
            }
        }
    }

}     

