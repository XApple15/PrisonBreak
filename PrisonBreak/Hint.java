import greenfoot.*;
 
public class Hint extends Jobs
{
    public Hint(String text)
    {
        setText("Hint : " + text);
    }
     
    public void setText(String text)
    {
        GreenfootImage textImg = new GreenfootImage("Hint : " + text, 24, Color.BLACK, new Color(0, 0, 0, 0));
        GreenfootImage img = new GreenfootImage(300, 26);
        img.setColor(new greenfoot.Color(255, 204, 102));
        img.fill();
        img.drawImage(textImg, 150-textImg.getWidth()/2, 13-textImg.getHeight()/2);
        setImage(img);
    }
}