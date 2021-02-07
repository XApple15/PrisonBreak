import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BestTime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BestTime extends Actor
{
    public BestTime(String text)
    {
        setText(" " + text);
    }
     
    public void setText(String text)
    {
        GreenfootImage textImg = new GreenfootImage( text, 33, Color.BLACK, new Color(0, 0, 0, 0));
        GreenfootImage img = new GreenfootImage(280, 44);
        img.setColor(new greenfoot.Color(255, 204, 102));
        img.fill();
        img.drawImage(textImg, 140-textImg.getWidth()/2, 22-textImg.getHeight()/2);
        setImage(img);
    }   
}
