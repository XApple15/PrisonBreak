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
            if(Player2.size() != 0 && ishere == false)
            {
                StartButton Hack1= new StartButton();
                Hack Hack12 = new Hack();
                getWorld().addObject( Hack1, 199,100);
                getWorld().addObject( Hack12, 300,500);
                ishere= true;
            }
    }
}
