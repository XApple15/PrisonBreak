import greenfoot.*;

public class Buttons extends Actor
{
    private boolean mouseOver = false;
    private static int MAX_TRANS = 255;
    public GreenfootSound soundtrack = new GreenfootSound("jail.mp3");
    boolean firstTurn = true;
    
    public void checkMouse() 
    {
        if(Greenfoot.mouseMoved(null))
        {
            mouseOver = Greenfoot.mouseMoved(this);
        }
        if(mouseOver)
        {
            adjTrans(MAX_TRANS/2);
        }
        else
        {
            adjTrans(MAX_TRANS);
        }
    } 
    public void checkClick(World world)
    {
        if(Greenfoot.mouseClicked(this))
        {
             Greenfoot.setWorld(world);
             soundtrack.stop();
        }
    }
    public void adjTrans(int adjust)
    {
        GreenfootImage tempImage = getImage();
        tempImage.setTransparency(adjust);
        setImage(tempImage);
    }
    void startingMusic()
    {
        if(firstTurn)
        {
            soundtrack.play();
            firstTurn = false;
        }
    }
}
