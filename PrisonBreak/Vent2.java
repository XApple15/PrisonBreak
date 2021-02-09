import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Vent-ul din camera gardianului 
 * 
 *
 * 
 */
public class Vent2 extends Vents
{ 
    private boolean ishere= false;
    private boolean HoldCdeleted = false;
    private boolean DontCutCopadded= false;
    private boolean HoldCadded = false;
    private boolean GoToVentadded = false ;
    
    private long LastTime = 01;
    private int DelayEx = 200;
   
    BiggerHint GoToVent = new BiggerHint(" ");
    Hint HoldC = new Hint(" ");
    HintAlert DontCutCop = new HintAlert(" ");
    
    String GoToVenttxt = "Go to the first Vent \nwith yellow margins!" ;
    String HoldCtxt = "Hold NUM5 to cut the vents!";
    String DontCutCoptxt = "Don`t cut the vents while\nthere is a cop in the room!";
    
    public void act()
    {       
        VerifPlayer2();
    }

    public Vent2() 
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

        List <Player2> Player2 = getObjectsInRange(40 , Player2.class);

        if( Player2.size() == 0 && GoToVentadded == false ) 
        {
            if( GoToVentadded == false ) 
            { 
                getWorld().addObject(GoToVent, 1019, 670);   GoToVentadded= true;
            }
            if ( HoldCadded == true )
            {
                getWorld().removeObject( HoldC );    HoldCadded = false;         
            }
            if( DontCutCopadded == true ) // sterge Hintul daca playerul nu mai este
            {
                getWorld().removeObject( DontCutCop );    DontCutCopadded = false;   
            }
        }
        if( Player2.size() !=0)
        {
            if( GoToVentadded == true )
            {
                getWorld().removeObject(GoToVent);    GoToVentadded = false;                
            }
            if( HoldCadded == false )
            {
                getWorld().addObject(HoldC, 1019, 680);   HoldCadded = true;              
            }
            if( DontCutCopadded == false  ) 
            {
                getWorld().addObject( DontCutCop, 1019, 635);   DontCutCopadded = true;                
            }
            if(  ishere == false && Greenfoot.isKeyDown("5") == true )
            {
                List <Cop1> Cop11 = getObjectsInRange( 100, Cop1.class);
                if( Cop11.size() != 0 ) // fail daca cop ul este in apropiere
                {
                    Greenfoot.setWorld( new LoseScreen());
                    return;
                }
                getWorld().removeObject( HoldC );
                getWorld().removeObject( DontCutCop);
                HoldCdeleted = true;
                getWorld().addObject( new Job2(), 1019,555);
                ishere= true;
            }
        }

        if( Greenfoot.isKeyDown("5") == true )
        {
            getWorld().removeObject( HoldC);
        }

        if( ishere == true && Greenfoot.isKeyDown("5") == false ) // reseteaza pentru ca daca nu mai apasa c, job 1 se sterge
        {
            ishere = false;
        }

    }
}

