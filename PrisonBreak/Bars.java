import greenfoot.*;  
import java.util.List;


public class Bars extends Objects
{
    Job1 Job11;
    private Player1 Player1;
    private boolean ishere= false;
    public void act()
    {
        VerifEnchanced();
    }

    public Bars() 
    {
        GreenfootImage Bars = new GreenfootImage("Bars_v2.png"); // Pat
        setImage(Bars);
        changeSize(1.5 , 1.5);
        ImageSet();
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
            List <Player1> Player2 = getObjectsInRange(40 , Player1.class);
            if(Player2.size() != 0 && ishere == false)
            {
                Job1 Job11= new Job1();
                getWorld().addObject( Job11, 400,200);
                ishere= true;
            }
            if(Player2.size() ==0 && ishere == true)
            {
                ishere= false;
            }
    }
}
