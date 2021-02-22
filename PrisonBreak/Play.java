import greenfoot.*;  

public class Play extends Buttons
{
    public Play()
    {
        GreenfootImage playButton = new GreenfootImage("ButtonsUI/PlayButton.png");
        setImage(playButton);
    }

    public void act() 
    {
        checkMouse(); 
        checkClick(new PreGame()); 
        if (Greenfoot.mouseClicked(this))
        {
            if(getWorld() instanceof MainMenu)
                MainMenu.soundtrack.stop();
        }
    } 
}
