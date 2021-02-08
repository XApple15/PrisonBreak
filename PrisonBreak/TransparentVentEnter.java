import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class TransparentVentExit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TransparentVentEnter extends Vents
{
    private boolean GoToVentadded = false;
    private boolean PressToEnteradded = false;
    BiggerHint GoToVent = new BiggerHint(" ");   
    Hint PressToEnter = new Hint(" ");
    Hint Follow = new Hint(" ");
    String Followtxt = "Follow your EX-cellmate";
    String GoToVenttxt =  "Go to the next Vent cut \nby your Ex-cellmate ";
    String PressToEntertxt = "Press NUM0 to enter Ventroom";
    public void act() 
    {
        GoToVent.setText(GoToVenttxt);
        PressToEnter.setText(PressToEntertxt);
        Follow.setText(Followtxt);
        CheckPlayer();
    }    

    public TransparentVentEnter(){
        GreenfootImage Exit = new GreenfootImage(1,1);
        setImage(Exit);
    }

    private void CheckPlayer()
    {
        List <Player2> Player2 = getObjectsInRange( 60, Player2.class);
        if( Player2.size() ==0  ) 
        {
            if( GoToVentadded == false)
            {
                getWorld().addObject( GoToVent , 1019,675 );
                GoToVentadded= true;
            }
        }
        if( Player2.size() != 0)
        {
            if( GoToVentadded == true)
            {
                getWorld().removeObject( GoToVent);
                GoToVentadded = false;
            }
            if( PressToEnteradded == false )
            {
                getWorld().addObject( PressToEnter ,1019,682);
                PressToEnteradded = true;
            }
            
            List <Vent3> Vent33 = getObjectsInRange( 10, Vent3.class);
            
            if( Greenfoot.isKeyDown("0") == true && Vent33.size() == 0 )
            {
                getWorld().removeObjects( getWorld().getObjects(Player2.class));               
                getWorld().addObject( new Player2(), 137, 533);
                getWorld().removeObject( GoToVent);
                getWorld().removeObject(PressToEnter);
                getWorld().addObject( Follow ,1019,682);
                getWorld().removeObject(this);
            }
        }

    }
}

    
