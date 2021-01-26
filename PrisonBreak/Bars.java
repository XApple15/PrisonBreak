import greenfoot.*;  
import java.util.List;


public class Bars extends Objects
{
    Job1 Job11;
    private Player1 Player1;
    public void act()
    {
        VerifEnchanced();
    }

    public Bars() 
    {
        GreenfootImage Bars = new GreenfootImage("Bars.png"); // Pat
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
        List <Player1> Player2 = getObjectsInRange(100 , Player1.class);
        if(Player2.size() != 0)
        {
            Jobs Job11= new Jobs();
            getWorld().addObject( Job11, 199,100);
        }
        if(Player2.size() == 0)
        {
            Jobs job = (Jobs)getWorld().getObjects(Job1.class).get(1);
            if( job != null ) 
                {
                    World world;
                    world = getWorld();
                    world.removeObject(job);
                }
            
        }
    }
}
