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
          GreenfootImage myImage = getImage();
          myImage.scale(100, 50);  
      }
  }
}
