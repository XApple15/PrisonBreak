import greenfoot.*;  

public class Hack extends Jobs
{
    private int timer = 500;
    private boolean click = false;
    private boolean code = false;
    public Hack()
    {
        setImage("SettingMenu.png");
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
                    getWorld().addObject(new displayCode(), 500, 400);
                    code = true;
                }
            }
        }
    }
    public boolean code()
    {
        if(Greenfoot.mouseClicked(this))
        {
            click = true;
            getWorld().removeObjects(getWorld().getObjects(StartButton.class));            
            getWorld().addObject(new LoadingBar(), 500, 800);
        }
        return click;
    }
}
