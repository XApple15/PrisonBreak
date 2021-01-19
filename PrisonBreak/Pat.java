import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pat extends Objects
{
    /**
     * Act - do whatever the Pat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Pat() 
    {
       GreenfootImage Pat = new GreenfootImage("Pat.png"); // Pat
       int x= Pat.getWidth();
       int y= Pat.getHeight();
       Pat.scale(x/2, y/2);
       setImage(Pat);
    }    
    
}
