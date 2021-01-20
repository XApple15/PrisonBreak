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
      }
  }
}
