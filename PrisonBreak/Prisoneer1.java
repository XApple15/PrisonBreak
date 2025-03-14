import greenfoot.*;  
import java.util.List;
public class Prisoneer1 extends Prisoneer
{
    private int movingCounter = 0;

    public Prisoneer1()
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
        List setting = getWorld().getObjects(SettingMenu.class);
        if(setting.size() == 0)
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
}
