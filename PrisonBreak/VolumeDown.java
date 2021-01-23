import greenfoot.*; 

public class VolumeDown extends SettingMenu
{
    public VolumeDown()
    {
        setImage("-.png");
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse.getClickCount() == 1)
        {
            getWorld().removeObjects(getWorld().getObjects(FullVolume.class));
            getWorld().addObject(new HalfVolume(), 500, 800);
        }
        if(mouse.getClickCount() == 2)
        {
            getWorld().removeObjects(getWorld().getObjects(HalfVolume.class));
            getWorld().addObject(new NoVolume(), 500, 800);
        }
        }
    }    
}

