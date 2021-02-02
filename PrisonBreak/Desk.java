import greenfoot.*; 
import java.util.List;


public class Desk extends Objects
{
    public Desk() 
    {
        GreenfootImage Desk = new GreenfootImage("Desk.png");
        setImage(Desk);
        changeSize(2,2);
        ImageSet();
    }   
    StartButton Hack1;
    private Player1 Player1;
    private boolean ishere= false;
    public void act()
    {
        VerifEnchanced();
        CloseHack();
    }
    public void Verif()
    {
        Actor Player1= getOneIntersectingObject(Player1.class);
        if( Player1 != null)
        { 
            Greenfoot.stop();
        }
    }
    public void VerifEnchanced()
        {
            List <Player1> Player2 = getObjectsInRange(100 , Player1.class);
            if(Player2.size() != 0 && ishere == false && Greenfoot.isKeyDown("c"))
            {
                StartButton Hack1= new StartButton();
                Hack Hack12 = new Hack();
                getWorld().addObject( Hack12, 500,275);
                getWorld().addObject( Hack1, 625,300);
                ishere= true;
            }
    }
    public void CloseHack()
    {
        List <Player1> Player2 = getObjectsInRange(100 , Player1.class);
        if(Player2.size() != 0 && Greenfoot.isKeyDown("e"))
        {
            getWorld().removeObjects(getWorld().getObjects(Hack.class));
        }
    }
}
