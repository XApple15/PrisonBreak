
import greenfoot.*; 

public class Players extends Actor
{   
    public boolean hitObject()
    {
        if(isTouching(Objects.class))
        return true;
        else
        return false;
    }
}
