import greenfoot.*;  
public class text19 extends HowToPlayText
{
    public text19()
    {
        setImage("HowToPlay/19.png");
    }

    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MainMenu());
        }
    }    
}
