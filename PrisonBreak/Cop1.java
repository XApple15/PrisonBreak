import greenfoot.*;  
public class Cop1 extends NPC
{
    private int movingCounter = 0;
    public boolean move = false;
    public void act() {
        MovingCycle();
    }
    
    public void MovingCycle()
    {
        if(move == true)
        {
            if (movingCounter < 400) {
                setLocation(getX() , getY() - 1);
            }
            else if (movingCounter < 550) {
                setLocation(getX(), getY() + 1);
            }
            else if(movingCounter < 1100)  {
                setLocation(getX() - 1, getY());
            }
            else if(movingCounter < 1650)  {
                setLocation(getX() + 1, getY());
            }
            else if(movingCounter < 1800)  {
                setLocation(getX(), getY() - 1);
            }
            else if(movingCounter < 2200)  {
                setLocation(getX(), getY() +1);
            }
            else {
                movingCounter = 0;
            }
            movingCounter++;
        }
    }
    public void PlayerClose()
    {  
    }
}
