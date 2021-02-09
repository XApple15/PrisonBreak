import greenfoot.*;  
import java.util.List;
/**
 * Ventul Transparent care apare dupa ce se foloseste walkietalkie
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TransparentVentExit extends Vents
{
    private boolean GoToVentadded = false;
    private boolean PressToExitadded = false;

    Hint GoToVent = new Hint(" ");   
    Hint PressToExit = new Hint(" ");

    String GoToVenttxt =  "Get back in the vent ASAP";
    String PressToExittxt = "Press NUM0 to enter Ventroom";

    public void act() 
    {
        GoToVent.setText(GoToVenttxt);
        PressToExit.setText(PressToExittxt);
        CheckPlayer();
    }    

    public TransparentVentExit(){
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
                getWorld().addObject( GoToVent , 1019,650 );   GoToVentadded= true;    
            }
        }
        if( Player2.size() != 0)
        {
            if( GoToVentadded == true)
            {
                getWorld().removeObject( GoToVent);   GoToVentadded = false;  
            }
            if( PressToExitadded == false )
            {
                getWorld().addObject( PressToExit ,1019,682);  PressToExitadded = true;           
            }
            if( Greenfoot.isKeyDown("0") == true )
            {
                getWorld().removeObjects( getWorld().getObjects(Player2.class));               
                getWorld().addObject( new Player2(), 598,642);
                getWorld().addObject( new TransparentVentEnter(),135,578);
                getWorld().removeObject( GoToVent);
                getWorld().removeObject(PressToExit);
                getWorld().removeObject(this);
            }
        }

    }
}
