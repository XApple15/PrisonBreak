import greenfoot.*; 
import java.util.List;
public class VolumeUp extends SettingMenu
{
    private int timer = 0;
    public VolumeUp()
    {
        setImage("+.png");
    }

    public void act() 
    {
        MusicUp();
    }  
    public void MusicUp()
    {
        List Music0 = getWorld().getObjects(NoVolume.class);
        List Music25 = getWorld().getObjects(Music25.class);
        List Music50 = getWorld().getObjects(HalfVolume.class);
        List Music75 = getWorld().getObjects(Music75.class);
        List Music100 = getWorld().getObjects(FullVolume.class);
        if (Greenfoot.mouseClicked(this))
        {
            if(Music0.size() != 0)
            {
                getWorld().removeObjects(getWorld().getObjects(NoVolume.class));
                getWorld().addObject(new Music25(), 600, 350);
            }
            else if(Music25.size() != 0)
            {
                getWorld().removeObjects(getWorld().getObjects(Music25.class));
                getWorld().addObject(new HalfVolume(), 600, 350);
            }
            else if(Music50.size() != 0)
            {
                getWorld().removeObjects(getWorld().getObjects(HalfVolume.class));
                getWorld().addObject(new Music75(), 600, 350);
            }
            else if(Music75.size() != 0)
            {
                getWorld().removeObjects(getWorld().getObjects(Music75.class));
                getWorld().addObject(new FullVolume(), 600, 350);
            }
        }
    }
}