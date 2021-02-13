import greenfoot.*;  
public class MainMenuButton extends Buttons
{
    public MainMenuButton()
    {
        setImage("menubutton.png");
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MainMenu());
        }
    }    
}
