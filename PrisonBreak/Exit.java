import greenfoot.*; 

public class Exit extends Buttons
{
    public Exit()
    {
        GreenfootImage myTitle = new GreenfootImage("ButtonsUI/QUIT.png");
        setImage(myTitle); 
    }
    public void act() 
    {
        checkMouse();
        if(Greenfoot.mouseClicked(this))
        {
            if(getWorld() instanceof MainMenu)
                MainMenu.soundtrack.stop();
            Greenfoot.stop();
        }
    }    
}
