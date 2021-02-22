import greenfoot.*;  

public class Hack extends Jobs
{
    private int timer = 500;
    private boolean click = false;
    private boolean code = false;

    public Hack()
    {
        setImage("HackWallpaper.png");
    }

    public void act() 
    {
        if(code() == true)
        {
            timer--;
            if(timer<=0)
            {
                if(code == false)
                {
                    getWorld().addObject(new displayCode(), 655, 345);

                    code = true;
                }
            }
        }
    }

    public boolean code()
    {
        if(Greenfoot.mouseClicked(null))
        {
            Actor mouseActor = Greenfoot.getMouseInfo().getActor();
            if(mouseActor instanceof StartButton)
            {
                click = true;
                getWorld().addObject(new LoadingBar(), 625, 350);
                getWorld().removeObjects(getWorld().getObjects(StartButton.class));  
            }
        }
        return click;
    }

}
