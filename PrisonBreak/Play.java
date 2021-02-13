import greenfoot.*;  

public class Play extends Buttons
{
    public Play()
    {
        GreenfootImage playButton = new GreenfootImage("ButtonsUI/PlayButton.png");
        //Font adjustedFont = new Font(true, false, 50);
        //playButton.setFont(adjustedFont);
        //playButton.setColor(Color.WHITE);
        //playButton.drawString("Play", 0, 50);
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
