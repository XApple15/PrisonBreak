
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
    public void changeSize(double x, double y)
    {
        GreenfootImage myImage = getImage();
        double newX = (int)myImage.getHeight()/x;
        double newY = (int)myImage.getWidth()/y;
        myImage.scale(( int) newY, (int) newX);
    }
    public void ImageSet()
    {
        GreenfootImage myImage = getImage();
        setImage(myImage);
    }
}

