import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class Vent2 extends Vents
{
    private boolean ok = true;
    private boolean ishere= false;
    private boolean HoldCdeleted = false;
    private boolean DontCutCopadded= false;
    private boolean HoldCadded = false;
    long LastTime;
    private int i;
    private int Delay = 100 ; // delay pt afisarea imaginilor ventului
    BiggerHint GoToVent = new BiggerHint(" ");
    Hint HoldC = new Hint(" ");
    HintAlert DontCutCop = new HintAlert(" ");
    String GoToVenttxt = "Go to the first Vent \nwith yellow margins!" ;
    String HoldCtxt = "Hold NUM5 to cut the vents!";
    String DontCutCoptxt = "Don`t cut the vents while\nthere is a cop in the room!";

    public void act()
    {
        Hints();
        VerifPlayer2();
    }
    
    
    private void  Hints()
    {
        HoldC.setText( HoldCtxt );
        GoToVent.setText( GoToVenttxt );
        getWorld().addObject(GoToVent, 1019, 670);  // adauga hint ul 
        DontCutCop.setText( DontCutCoptxt );
    }

    public Vent2() 
    {
        setImage("Vents/Vent_1.png");    
    }    

    public void VerifPlayer2() // verifica daca player1 este in raza de 40 de px
    {
        List <Player2> Player2 = getObjectsInRange(40 , Player2.class);

        if( Player2.size() !=0)
        {
            getWorld().removeObject(GoToVent);    
            getWorld().addObject(HoldC, 1019, 680);
            getWorld().addObject( DontCutCop, 1019, 635);
            DontCutCopadded = true;
            HoldCadded = true;
        }
        if( Greenfoot.isKeyDown("5") == true )
        {
            getWorld().removeObject( HoldC);
        }
        
        if( Player2.size() != 0 && ishere == false && Greenfoot.isKeyDown("5"))
        {
            List <Cop1> Cop11 = getObjectsInRange( 100, Cop1.class);
            if( Cop11.size() != 0 )
            {
                // FAIL screen
            }
            getWorld().removeObject( HoldC );
            getWorld().removeObject( DontCutCop);
            HoldCdeleted = true;
            getWorld().addObject( new Job2(), 1019,555);
            ishere= true;
        }
        if( ishere == true && Greenfoot.isKeyDown("5") == false ) // reseteaza pentru ca daca nu mai apasa c, job 1 se sterge
        {
            ishere = false;
        }
        if( Player2.size() == 0 && DontCutCopadded == true ) // sterge Hintul daca playerul nu mai este
        {
            getWorld().removeObject( DontCutCop );
            DontCutCopadded = false;
        }
        if( Player2.size() == 0 && HoldCadded == true ) // serge Hintul daca playerul nu mai este
        {
            getWorld().removeObject( HoldC );
            HoldCadded = false;
        }
    }
}

