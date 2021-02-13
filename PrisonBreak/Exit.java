import greenfoot.*; 

public class Exit extends Buttons
{
    public Exit()
    {
        GreenfootImage myTitle = new GreenfootImage("ButtonsUI/QUIT.png");
        //Font adjustedFont = new Font(true, false, 40);
        //myTitle.setFont(adjustedFont);
        // myTitle.setColor(Color.WHITE);
        //myTitle.drawString("Exit", 0, 50);
        setImage(myTitle); 
    }
    public void act() 
    {
        checkMouse();
        if(Greenfoot.mouseClicked(this))
        {
            if(getWorld() instanceof MainMenu)
                MainMenu.soundtrack.stop();
            Greenfoot.stop();
        }
    }    
}
