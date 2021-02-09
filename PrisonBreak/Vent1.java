import greenfoot.*;  
import java.util.List;

/**
 * Vent-ul din celula personajelor principale , care actioneaza in functie de tasta apasata
 * 
 *
 * 
 */
public class Vent1 extends Vents
{

    private boolean ok = true;
    private boolean ishere= false;
    private boolean HoldCdeleted = false;
    private boolean isTurned = false;

    private long LastTime = 01;
    private int DelayEx = 200;
    
    Hint GoToVent = new Hint(" ");
    Hint HoldC = new Hint(" ");
    
    String GoToVenttxt = "Go near the vent in your cell " ;
    String HoldCtxt = "Hold C to cut the vents";

    public void act()
    {        
        VerifPlayer1();         
    }

    private void  Hints()
    {
        HoldC.setText( HoldCtxt );
        GoToVent.setText( GoToVenttxt );
    }

    public Vent1() 
    {
        setImage("Vents/Vent_3.png");
        turn(90);
    }    

    public void VerifPlayer1() // verifica daca player1 este in raza de 40 de px
    { 
        if( System.currentTimeMillis() <  LastTime + DelayEx )  return;
        LastTime = System.currentTimeMillis();

        Hints();

        List <Player1> Player1 = getObjectsInRange(40 , Player1.class); // verifica daca player1 este in apropiere
        
        if( Player1.size() == 0 ) getWorld().addObject(GoToVent, 181, 653);  // adauga hint ul 
        if( Player1.size() !=0)
        {
            getWorld().removeObject(GoToVent);    
            getWorld().addObject(HoldC, 181, 680);
            if( ishere == false && Greenfoot.isKeyDown("c"))
            {
                getWorld().removeObject( HoldC );
                HoldCdeleted = true;
                getWorld().addObject( new Job1(), 181,555);
                ishere= true;
            }
        }
        if( Greenfoot.isKeyDown("c") == true )
        {
            getWorld().removeObject( HoldC);
        }
        if( ishere == true && Greenfoot.isKeyDown("c") == false )
        {
            ishere = false;
            getWorld().removeObject(HoldC);            
        }

    }
}
