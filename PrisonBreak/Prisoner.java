import greenfoot.*;  
public class Prisoner extends Actor
{
    public void act() 
    {
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
