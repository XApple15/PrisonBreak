import greenfoot.*;

public class Buttons extends Actor
{
    private boolean mouseOver = false;
    private static int MAX_TRANS = 255;

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
        }
    }

    public void adjTrans(int adjust)
    {
        GreenfootImage tempImage = getImage();
        tempImage.setTransparency(adjust);
        setImage(tempImage);
    }
}
