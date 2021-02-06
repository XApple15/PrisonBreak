import greenfoot.*;  
import java.util.List;


public class Bars extends Objects
{
    
    private Player1 Player1;
    private boolean ishere= false;
    Hint GoToVent = new Hint(" ");
    Hint HoldC = new Hint(" ");
    String GoToVenttxt = " Go to the vent in your cell " ;
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
        getWorld().addObject(GoToVent, 400, 650);  // adauga hint ul 
    }

    public Bars() 
    {
        GreenfootImage Bars = new GreenfootImage("Bars_v2.png"); // Pat
        setImage(Bars);
        changeSize(1.5 , 1.5);
        ImageSet();
    }    

    
    public void VerifPlayer1() // verifica daca player1 este in raza de 40 de px
        {
            List <Player1> Player2 = getObjectsInRange(40 , Player1.class);
            if( Player2.size() !=0)
            {
                getWorld().removeObject(GoToVent);
                
                getWorld().addObject(HoldC, 400, 600);
            }
            if( Player2.size() != 0 && ishere == false && Greenfoot.isKeyDown("c"))
            {
                Job1 Job11= new Job1();
                getWorld().addObject( Job11, 272,550);
                ishere= true;
            }
            if( Player2.size() == 0 && ishere == true )
            {
                ishere= false;
            }
    }
}
