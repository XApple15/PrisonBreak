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
            Settings setting = (Settings)getWorld().getObjects(Settings.class).get(0);
            setting.clickon = false;
            getWorld().removeObjects(getWorld().getObjects(SettingMenu.class));
        }
    }
}
