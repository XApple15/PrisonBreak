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
            Level2.backgroundMusic1.stop();
            Level1.backgroundMusic.stop();
            Greenfoot.setWorld(new MainMenu());
        }
    }    
}
