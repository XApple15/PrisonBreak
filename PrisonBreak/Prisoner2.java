import greenfoot.*; 
public class Prisoner2 extends Prisoner
{
    private int movingCounter = 0;
    public Prisoner2()
    {
        GreenfootImage P2 = new GreenfootImage("P2.png");
        setImage(P2);
        changeSize(4,4);
        ImageSet();
    }
    public void act() 
    {
        movePrisoner2();
    }    
    public void movePrisoner2()
    {
        if(movingCounter<30)
        {
            setLocation(getX(),getY()+1);
        }
        else if(movingCounter<59)
        {
            setLocation(getX(),getY()-1);
        }
        else 
        {
            movingCounter = 0;
        }
        movingCounter++;
    }
}