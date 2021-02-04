import greenfoot.*;  
public class LoadingBar extends Hack
{
    GifImage gifImage = new GifImage("progress.gif");
    public LoadingBar()
    {
        int scalePercent = 50;
        for (GreenfootImage image : gifImage.getImages())
        {
            int wide = image.getWidth()*scalePercent/100;
            int high = image.getHeight()*scalePercent/100;
            image.scale(wide, high);
        }
    }
    public void act()
    {
        setImage(gifImage.getCurrentImage());
    }
}
