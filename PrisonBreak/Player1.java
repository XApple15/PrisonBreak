import greenfoot.*;  
import java.util.List;

public class Player1 extends Players
{
    public void act() 
    {
            LostGame();
            WinGame();
            Movement();
    } 
    public Player1()
    {
        setImage("Players/Player1/Pl_1_left.png");       
    }
    public void WinGame()
    {
        Actor player2 = (Actor)getWorld().getObjects(Player2.class).get(0); 
        Actor player1 = (Actor)getWorld().getObjects(Player1.class).get(0);
        if(getWorld() instanceof Level1)
        {
            if (player1.getX() == 0 && player2.getX() == 0)
            {  
                Level1.backgroundMusic.stop();
                Greenfoot.setWorld(new Level2());
            }
        }
        if(getWorld() instanceof Level2)
        {
            if (player1.getX() < 200 && player2.getX() < 200)
            {  
                Level2.backgroundMusic1.stop();
                Greenfoot.setWorld(new WinScreen());
            }
        }
    }
    
    public void Movement()
    {
        List setting = getWorld().getObjects(SettingMenu.class);
        if(setting.size() == 0)
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
    }
}
