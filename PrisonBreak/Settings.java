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
          getWorld().addObject(new SettingMenu(), 600,350);
          getWorld().addObject(new Resume(), 600, 415);
          getWorld().addObject(new Sound(), 600, 250);
          getWorld().addObject(new GoToMainMenu(), 600, 475);
          getWorld().addObject(new FullVolume(), 600, 350);
          getWorld().addObject(new VolumeDown(), 450,350);
          getWorld().addObject(new VolumeUp(), 750, 350);
      }
  }
}
