import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BiggerHint extends Hints
{
    public BiggerHint(String text)
    {
        setText("Hint : " + text);
    }
     
    public void setText(String text)
    {
        GreenfootImage textImg = new GreenfootImage("Hint: " + text, 22, Color.BLACK, new Color(0, 0, 0, 0));
        GreenfootImage img = new GreenfootImage(354, 40);
        img.setColor(new greenfoot.Color(255, 204, 102));
        img.fill();
        img.drawImage(textImg, 177-textImg.getWidth()/2, 20-textImg.getHeight()/2);
        setImage(img);
    }
}

