import greenfoot.*;  

public class SettingMenu extends Actor
{
    public SettingMenu()
    {
        setImage("SettingMenu.png");
    }
    public void changeSize(int x,int y)
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/x;
        int myNewWidth = (int)myImage.getWidth()/y;
        myImage.scale(myNewWidth, myNewHeight);
    }
}
