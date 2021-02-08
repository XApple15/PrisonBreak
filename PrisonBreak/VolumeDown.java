import greenfoot.*; 
import java.util.List;

public class VolumeDown extends SettingMenu
{
    private int timer = 0;
    public VolumeDown()
    {
        setImage("-.png");
    }
    public void act() 
    {
        MusicDown();
    } 
    public void MusicDown()
    {
        List Music0 = getWorld().getObjects(NoVolume.class);
        List Music25 = getWorld().getObjects(Music25.class);
        List Music50 = getWorld().getObjects(HalfVolume.class);
        List Music75 = getWorld().getObjects(Music75.class);
        List Music100 = getWorld().getObjects(FullVolume.class);
        if (Greenfoot.mouseClicked(this))
        {
            if(Music100.size() != 0)
            {
                getWorld().removeObjects(getWorld().getObjects(FullVolume.class));
                getWorld().addObject(new Music75(), 600, 350);
            }
            else if(Music75.size() != 0)
            {
                getWorld().removeObjects(getWorld().getObjects(Music75.class));
                getWorld().addObject(new HalfVolume(), 600, 350);
            }
            else if(Music50.size() != 0)
            {
                getWorld().removeObjects(getWorld().getObjects(HalfVolume.class));
                getWorld().addObject(new Music25(), 600, 350);
            }
            else if(Music25.size() != 0)
            {
                getWorld().removeObjects(getWorld().getObjects(Music25.class));
                getWorld().addObject(new NoVolume(), 600, 350);
            }
        }
    }
}

