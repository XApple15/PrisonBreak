import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Box here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Box extends Jobs
{
    public void Box( int x,int y)
    {
        GreenfootImage image = new  GreenfootImage(x, y);
        image.setColor(Color.RED);
        image.fill();
        setImage(image);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
