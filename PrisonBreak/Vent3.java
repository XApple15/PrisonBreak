import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class Vent3 extends Vents
{
    private boolean ishere= false;
    private boolean HoldCdeleted = false;
    private boolean DontCutCopadded= false;
    private boolean HoldCadded = false;
    private boolean isTurned = false;
    private boolean GoToVentadded = false;
    private long LastTime = 01;
    private int DelayEx = 200;

    BiggerHint GoToVent = new BiggerHint(" ");
    Hint HoldC = new Hint(" ");
    HintAlert DontCutCop = new HintAlert(" ");
    String GoToVenttxt = "Go to the second Vent \n with yellow margins!" ;
    String HoldCtxt = "Hold C to cut the vents!";
    String DontCutCoptxt = "Don`t cut the vents while\nthere is a cop in the room!";
    public void act()
    { 
        VerifPlayer2();
    }

    public Vent3() 
    {
        setImage("Vents/Vent_3.png");
    }    
    
    private void Hints()
    {
        HoldC.setText( HoldCtxt );
        GoToVent.setText( GoToVenttxt );
        DontCutCop.setText( DontCutCoptxt );
    }

    private void VerifPlayer2() // verifica daca player1 este in raza de 40 de px
    {       
        if( System.currentTimeMillis() <  LastTime + DelayEx )  {return;}
        LastTime = System.currentTimeMillis();

        Hints();
        
        List <Player1> Player1 = getObjectsInRange(40 , Player1.class);
        if( Player1.size() == 0 && GoToVentadded == false ) 
        {
            if( GoToVentadded == false )
            {
                getWorld().addObject(GoToVent, 181, 670);   GoToVentadded= true;
            }
            if ( DontCutCopadded == true )
            {
                getWorld().removeObject( DontCutCop );    DontCutCopadded = false;    
            }
            if(  HoldCadded == true ) // serge Hintul daca playerul nu mai este
            {
                getWorld().removeObject( HoldC );     HoldCadded = false;  
            }
        }
        if( Player1.size() !=0)
        {
            getWorld().removeObject(GoToVent);     GoToVentadded = false;
            getWorld().addObject(HoldC, 181, 680);   HoldCadded = true;
            
            if( DontCutCopadded == false  ) 
            {
                getWorld().addObject( DontCutCop, 181, 635);
                DontCutCopadded = true;
            }
            if( ishere == false && Greenfoot.isKeyDown("c") == true )
            {
                List <Cop2> Cop11 = getObjectsInRange( 100, Cop2.class);
                if( Cop11.size() != 0 )
                {
                    // FAIL screen
                }
                getWorld().removeObject( HoldC );   HoldCdeleted = true;
                getWorld().removeObject( DontCutCop);

                getWorld().addObject( new Job3(), 181,555);
                ishere= true;
            }
        }

        if( Greenfoot.isKeyDown("c") == true )
        {
            getWorld().removeObject( HoldC);
        }

        if( ishere == true && Greenfoot.isKeyDown("c") == false ) // reseteaza pentru ca daca nu mai apasa c, job 1 se sterge
        {
            ishere = false;
        }
        
    }
}

