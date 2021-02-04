import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HintAlert extends Hints
{
    public HintAlert(String text)
    {
        setText("Hint : " + text);
    }
     
    public void setText(String text)
    {
        GreenfootImage textImg = new GreenfootImage("Alert: " + text, 26, Color.BLACK, new Color(0, 0, 0, 0));
        GreenfootImage img = new GreenfootImage(354, 50);
        img.setColor(new greenfoot.Color(255, 41, 41));
        img.fill();
        img.drawImage(textImg, 177-textImg.getWidth()/2, 25-textImg.getHeight()/2);
        setImage(img);
    }
}

