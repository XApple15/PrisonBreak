import greenfoot.*; 
public class X extends SettingMenu
{
    public X()
    {
        setImage("X.png");
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            getWorld().removeObjects(getWorld().getObjects(SettingMenu.class));
        }
    }
}
