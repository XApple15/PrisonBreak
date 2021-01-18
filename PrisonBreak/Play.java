import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Buttons
{
    // Rescalling the .png file
    
    public Play()
    {
        GreenfootImage playButton= new GreenfootImage("playButton.png");
        GreenfootImage image = new GreenfootImage(playButton);
        image.scale(200, 100); // scaling the original image
        setImage(image);
    }
    // Calling the constructor act which checks if the mouse is over the box
    public void act() 
    {
       checkMouse();
       checkClick(new Level1());
    }    
}
