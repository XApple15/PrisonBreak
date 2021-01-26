
import greenfoot.*; 

public class Players extends Actor
{   
    public boolean hitObject()
    {
        if(isTouching(WallHorizontal.class))
        return true;
        else
        return false;
    }
}
