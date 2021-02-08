import greenfoot.*; 

public class Instructions extends Buttons
{
    public Instructions()
    {
        GreenfootImage myTitle = new GreenfootImage("ButtonsUI/HowToPlay.png");
        //Font adjustedFont = new Font(true, false, 40);
        //myTitle.setFont(adjustedFont);
        // myTitle.setColor(Color.WHITE);
        //myTitle.drawString("How to Play", 0, 50);
        setImage(myTitle);
    }
    public void act() 
    {
        checkMouse();
        checkClick(new HowToPlay());
    }    
}
