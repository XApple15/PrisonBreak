import greenfoot.*;  
import java.util.List;

public class Vent1 extends Vents
{
    private Player1 Player1;
    private boolean ok = true;
    private boolean ishere= false;
    private boolean HoldCdeleted = false;
    long LastTime;
    private int i;
    private int Delay = 100 ; // delay pt afisarea imaginilor ventului
    Hint GoToVent = new Hint(" ");
    Hint HoldC = new Hint(" ");
    String GoToVenttxt = "Go near the vent in your cell " ;
    String HoldCtxt = "Hold C to cut the vents";

    public void act()
    {
        Hints();
        VerifPlayer1();     
    }
    
    
    private void  Hints()
    {
        HoldC.setText( HoldCtxt );
        GoToVent.setText( GoToVenttxt );
        getWorld().addObject(GoToVent, 181, 653);  // adauga hint ul 
    }

    public Vent1() 
    {
        setImage("Vents/Vent_1.png");    
        turn(90);
    }    

    public void VerifPlayer1() // verifica daca player1 este in raza de 40 de px
    {
        List <Player1> Player1 = getObjectsInRange(40 , Player1.class);

        if( Player1.size() !=0)
        {
            getWorld().removeObject(GoToVent);    
            getWorld().addObject(HoldC, 181, 680);
        }
        if( Greenfoot.isKeyDown("c") == true )
        {
            getWorld().removeObject( HoldC);
        }
        if( Player1.size() != 0 && ishere == false && Greenfoot.isKeyDown("c"))
        {
            getWorld().removeObject( HoldC );
            HoldCdeleted = true;
            getWorld().addObject( new Job1(), 181,555);
            ishere= true;
        }
        if( ishere == true && Greenfoot.isKeyDown("c") == false )
        {
            ishere = false;
        }

    }
}
