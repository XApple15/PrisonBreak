import greenfoot.*; 

public class Instructions extends Buttons
{
    public Instructions()
    {
        GreenfootImage myTitle = new GreenfootImage("ButtonsUI/HowToPlay.png");
        setImage(myTitle);
    }
    public void act() 
    {
        checkMouse();
        checkClick(new HowToPlay());
        if (Greenfoot.mouseClicked(this))
        {
            if(getWorld() instanceof MainMenu)
                MainMenu.soundtrack.stop();
        }
    }    
}
