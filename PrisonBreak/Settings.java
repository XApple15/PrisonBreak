import greenfoot.*;  

public class Settings extends Actor
{  
  public Settings()
  {
      GreenfootImage myImage = getImage();
      myImage.scale(50, 25);
  }
  public void act()
  {
      if(Greenfoot.mouseClicked(this))
      {
          getWorld().addObject(new SettingMenu(), 300,200);
          getWorld().addObject(new X(), 350, 400);
          getWorld().addObject(new FullVolume(), 100, 300);
          getWorld().addObject(new VolumeDown(), 150,350);
          getWorld().addObject(new VolumeUp(), 50, 250);
      }
  }
}
