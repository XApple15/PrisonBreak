import greenfoot.*;  

public class Objects extends Actor
{
        public void changeSize(int x,int y)
    {
        GreenfootImage myImage = getImage();
        int myNewHeight = (int)myImage.getHeight()/x;
        int myNewWidth = (int)myImage.getWidth()/y;
        myImage.scale(myNewWidth, myNewHeight);
    }
}
