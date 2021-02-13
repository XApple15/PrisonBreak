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
        List Music0 = getWorld().getObjects(Music0.class);
        List Music10 = getWorld().getObjects(Music10.class);
        List Music20 = getWorld().getObjects(Music20.class);
        List Music30 = getWorld().getObjects(Music30.class);
        List Music40 = getWorld().getObjects(Music40.class);
        List Music50 = getWorld().getObjects(Music50.class);
        List Music60 = getWorld().getObjects(Music60.class);
        List Music70 = getWorld().getObjects(Music70.class);
        List Music80 = getWorld().getObjects(Music80.class);
        List Music90 = getWorld().getObjects(Music90.class);
        List Music100 = getWorld().getObjects(Music100.class);
        if (Greenfoot.mouseClicked(this))
        {
            if(Music0.size() != 0)
            {
                getWorld().removeObjects(getWorld().getObjects(Music0.class));
                getWorld().addObject(new Music10(), 600, 350);
                Settings sound = (Settings)getWorld().getObjects(Settings.class).get(0);
                sound.soundbar = new Music10();
                if(getWorld() instanceof Level1)
                Level1.backgroundMusic.setVolume(10);
                if(getWorld() instanceof Level2)
                Level2.backgroundMusic1.setVolume(10);
            }
            if(Music10.size() != 0)
            {
                getWorld().removeObjects(getWorld().getObjects(Music10.class));
                getWorld().addObject(new Music20(), 600, 350);
                Settings sound = (Settings)getWorld().getObjects(Settings.class).get(0);
                sound.soundbar = new Music20();
                if(getWorld() instanceof Level1)
                Level1.backgroundMusic.setVolume(20);
                if(getWorld() instanceof Level2)
                Level2.backgroundMusic1.setVolume(20);
            }            
            else if(Music20.size() != 0)
            {
                getWorld().removeObjects(getWorld().getObjects(Music20.class));
                getWorld().addObject(new Music30(), 600, 350);
                Settings sound = (Settings)getWorld().getObjects(Settings.class).get(0);
                sound.soundbar = new Music30();
                if(getWorld() instanceof Level1)
                Level1.backgroundMusic.setVolume(30);
                if(getWorld() instanceof Level2)
                Level2.backgroundMusic1.setVolume(30);
            }
            if(Music30.size() != 0)
            {
                getWorld().removeObjects(getWorld().getObjects(Music30.class));
                getWorld().addObject(new Music40(), 600, 350);
                Settings sound = (Settings)getWorld().getObjects(Settings.class).get(0);
                sound.soundbar = new Music40();
                if(getWorld() instanceof Level1)
                Level1.backgroundMusic.setVolume(40);
                if(getWorld() instanceof Level2)
                Level2.backgroundMusic1.setVolume(40);
            }  
            if(Music40.size() != 0)
            {
                getWorld().removeObjects(getWorld().getObjects(Music40.class));
                getWorld().addObject(new Music50(), 600, 350);
                Settings sound = (Settings)getWorld().getObjects(Settings.class).get(0);
                sound.soundbar = new Music50();
                if(getWorld() instanceof Level1)
                Level1.backgroundMusic.setVolume(50);
                if(getWorld() instanceof Level2)
                Level2.backgroundMusic1.setVolume(50);
            }
            else if(Music50.size() != 0)
            {
                getWorld().removeObjects(getWorld().getObjects(Music50.class));
                getWorld().addObject(new Music60(), 600, 350);
                Settings sound = (Settings)getWorld().getObjects(Settings.class).get(0);
                sound.soundbar = new Music60();
                if(getWorld() instanceof Level1)
                Level1.backgroundMusic.setVolume(60);
                if(getWorld() instanceof Level2)
                Level2.backgroundMusic1.setVolume(60);
            }
            if(Music60.size() != 0)
            {
                getWorld().removeObjects(getWorld().getObjects(Music60.class));
                getWorld().addObject(new Music70(), 600, 350);
                Settings sound = (Settings)getWorld().getObjects(Settings.class).get(0);
                sound.soundbar = new Music70();
                if(getWorld() instanceof Level1)
                Level1.backgroundMusic.setVolume(70);
                if(getWorld() instanceof Level2)
                Level2.backgroundMusic1.setVolume(70);
            }
            else if(Music70.size() != 0)
            {
                getWorld().removeObjects(getWorld().getObjects(Music70.class));
                getWorld().addObject(new Music80(), 600, 350);
                Settings sound = (Settings)getWorld().getObjects(Settings.class).get(0);
                sound.soundbar = new Music80();
                if(getWorld() instanceof Level1)
                Level1.backgroundMusic.setVolume(80);
                if(getWorld() instanceof Level2)
                Level2.backgroundMusic1.setVolume(80);
            }
            if(Music80.size() != 0)
            {
                getWorld().removeObjects(getWorld().getObjects(Music80.class));
                getWorld().addObject(new Music90(), 600, 350);
                Settings sound = (Settings)getWorld().getObjects(Settings.class).get(0);
                sound.soundbar = new Music90();
                if(getWorld() instanceof Level1)
                Level1.backgroundMusic.setVolume(90);
                if(getWorld() instanceof Level2)
                Level2.backgroundMusic1.setVolume(90);
            }
            if(Music90.size() != 0)
            {
                getWorld().removeObjects(getWorld().getObjects(Music90.class));
                getWorld().addObject(new Music100(), 600, 350);
                Settings sound = (Settings)getWorld().getObjects(Settings.class).get(0);
                sound.soundbar = new Music100();
                if(getWorld() instanceof Level1)
                Level1.backgroundMusic.setVolume(100);
                if(getWorld() instanceof Level2)
                Level2.backgroundMusic1.setVolume(100);
            }
        }
    }
}