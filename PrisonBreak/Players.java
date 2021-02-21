import greenfoot.*; 
import java.util.List;
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
    public void LostGame()
    {
        List <NPC> NPC = getObjectsInRange(100 , NPC.class);
        if(NPC.size() != 0)
        {
            if(getWorld() instanceof Level1)
                Level1.backgroundMusic.stop();
            if(getWorld() instanceof Level2)
                Level2.backgroundMusic1.stop();
            Greenfoot.setWorld(new LoseScreen());
        }
    }
}

