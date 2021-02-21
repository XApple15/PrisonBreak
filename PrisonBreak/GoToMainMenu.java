import greenfoot.*;  
public class GoToMainMenu extends SettingMenu
{
    public GoToMainMenu()
    {
        setImage("GoToMainMenu.png");
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            if(getWorld() instanceof Level1)
                Level1.backgroundMusic.stop();
           if(getWorld() instanceof Level2)
                Level2.backgroundMusic1.stop();
            Greenfoot.setWorld(new MainMenu());
        }
    }    
}
