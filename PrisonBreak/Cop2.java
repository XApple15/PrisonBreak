import greenfoot.*;  
public class Cop2 extends NPC
{
    private int movingCounter = 0;
    public void act() 
    {
        MovingCycle();
        if(getY()== 0)
        {
            getWorld().removeObjects(getWorld().getObjects(Cop2.class));
        }
    } 
    
    public Cop2()
    {
        setImage( "Cops/Cop2/Cop2_back.png");
        changeSize(1.5 , 1.5);
    }
        public void MovingCycle()
    {
        if(movingCounter < 200) {
            setLocation(getX() + 1, getY());
            setImage( "Cops/Cop2/Cop2_right.png");
            changeSize(1.5 , 1.5);
        }
        else if(movingCounter < 470)  {
            setLocation(getX(), getY() - 1);
            setImage( "Cops/Cop2/Cop2_back.png");
            changeSize(1.5 , 1.5);
        }
        else if(movingCounter < 570)  {
            setLocation(getX() + 1, getY());
            setImage( "Cops/Cop2/Cop2_right.png");
            changeSize(1.5 , 1.5);
        }
        else if(movingCounter < 1500)  {
            setLocation(getX(), getY() - 1);
            setImage( "Cops/Cop2/Cop2_back.png");
            changeSize(1.5 , 1.5);
        }
        else {
            movingCounter = 700;
        }
        movingCounter++;
    }
}
