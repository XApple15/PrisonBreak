import greenfoot.*; 
public class Resume extends SettingMenu
{
    public Resume()
    {
        setImage("Resume.png");
        changeSize(4,4);
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            getWorld().removeObjects(getWorld().getObjects(SettingMenu.class));
        }
    }
}
