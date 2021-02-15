import greenfoot.*;  
import java.util.List;
public class Cop1 extends NPC
{
    private int movingCounter = 0;
    boolean n = false;
    int timer = 0;
    boolean isSet= false;
    private long LastTime = 01;
    private int DelayEx = 200;
    boolean delay = false;
    boolean lastTime = false;
    public void act() {
        PlayerNearby();
        MovingCycle();
        OpenDoor1();
    }

    public Cop1()
    {
        setImage("Cops/Cop1/Cop1_back.png");
        changeSize(1.5 , 1.5);
    }

    public void MovingCycle()
    {
        List setting = getWorld().getObjects(SettingMenu.class);
        if(setting.size() == 0)
        {
            if(n==true)
            {
                if(delay == false)
                { 
                    if( System.currentTimeMillis() <  LastTime + timer )   
                        return;
                    delay = true;
                }
    
                if (movingCounter < 400) {
                    setLocation(getX() , getY() - 1);
                    setImage( "Cops/Cop1/Cop1_back.png");
                    changeSize(1.5 , 1.5);
                }
                else if (movingCounter < 550) {
                    setLocation(getX(), getY() + 1);
                    setImage( "Cops/Cop1/Cop1_front.png");
                    changeSize(1.5 , 1.5);
                }
                else if(movingCounter < 1100)  {
                    setLocation(getX() - 1, getY());
                    setImage( "Cops/Cop1/Cop1_left.png");
                    changeSize(1.5 , 1.5);
                }
                else if(movingCounter < 1650)  {
                    setLocation(getX() + 1, getY());
                    setImage( "Cops/Cop1/Cop1_right.png");
                    changeSize(1.5 , 1.5);
                }
                else if(movingCounter < 1800)  {
                    setLocation(getX(), getY() - 1);
                    setImage( "Cops/Cop1/Cop1_back.png");
                    changeSize(1.5 , 1.5);
                }
                else if(movingCounter < 2200)  {
                    setLocation(getX(), getY() +1);
                    setImage( "Cops/Cop1/Cop1_front.png");
                    changeSize( 1.5 , 1.5 );
                }
                else {
                    movingCounter = 0;
                }
                movingCounter++;
            }
        }

    }

    public void PlayerNearby()
    {
        if(timer < 20000 && isSet == false)
        {
            timer = Greenfoot.getRandomNumber(45000);
            return;
        }
        isSet = true;
        List <Player2> Player2 = getObjectsInRange(200 , Player2.class);
        if(Player2.size() != 0)
        {
            n= true;
        }
        if(lastTime == false)
        {
            LastTime = System.currentTimeMillis();
            lastTime = true;
        }
    }
        public void OpenDoor1()
    {
        List <DoorCop1> doorcop1 = getObjectsInRange(40 , DoorCop1.class);
        if(doorcop1.size() != 0)
        {
            getWorld().removeObjects(getWorld().getObjects(DoorCop1.class));
            getWorld().addObject(new CellDoor(), 605, 395);
        }
    }
}
