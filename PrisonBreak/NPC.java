import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NPC here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NPC extends Actor
{
    /**
     * Act - do whatever the NPC wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    public void changeSize(double x, double y)
    {
        GreenfootImage myImage = getImage();
        double newX = (int)myImage.getHeight()/x;
        double newY = (int)myImage.getWidth()/y;
        myImage.scale(( int) newY, (int) newX);
    }
}
