import greenfoot.*;
 
public class Hint extends Hints
{
    public Hint(String text)
    {
        setText("Hint : " + text);
    }
     
    public void setText(String text)
    {
        GreenfootImage textImg = new GreenfootImage("Hint: " + text, 24, Color.BLACK, new Color(0, 0, 0, 0));
        GreenfootImage img = new GreenfootImage(354, 20);
        img.setColor(new greenfoot.Color(255, 204, 102));
        img.fill();
        img.drawImage(textImg, 177-textImg.getWidth()/2, 10-textImg.getHeight()/2);
        setImage(img);
    }
}