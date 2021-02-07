import greenfoot.*;  
public class Prisoner1 extends Prisoner
{
    private int movingCounter = 0;
    public Prisoner1()
    {
        GreenfootImage P1 = new GreenfootImage("P1.png");
        setImage(P1);
        changeSize(4,4);
        ImageSet();
    }
    public void act() 
    {
        movePrisoner1();
    }    
    public void movePrisoner1()
    {
        if(movingCounter<30)
        {
            setLocation(getX()+1,getY());
        }
        else if(movingCounter<59)
        {
            setLocation(getX()-1,getY());
        }
        else 
        {
            movingCounter = 0;
        }
        movingCounter++;
    }
}
