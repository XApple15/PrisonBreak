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
            Greenfoot.setWorld(new MainMenu());
        }
    }    
}
