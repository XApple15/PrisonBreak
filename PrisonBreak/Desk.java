import greenfoot.*; 
import java.util.List;

public class Desk extends Objects
{
    String GoToDesktxt = " Go to the Computer";
    String PressCtoOpentxt = "Press C to turn on the Computer" ;
    String ClickOnStarttxt = "Click on START button to start hacking the security system !";
    String RememberAndClosetxt = "Remember the 4-digit code and press E to turn off the Computer";

    Hint GoToDesk = new Hint(" ");
    Hint PressCtoOpen = new Hint(" ");
    BiggerHint ClockOnStart = new BiggerHint(" ");
    BiggerHint RememberAndClose = new BiggerHint(" ");
    public Desk() 
    {
        GreenfootImage Desk = new GreenfootImage("Desk.png");
        setImage(Desk);
        changeSize( 1.5 , 1.5);
        ImageSet();
    }   
    StartButton Hack1;
    private Player1 Player1;
    private boolean ishere= false;
    public void act()
    {
        Hints();
        VerifEnchanced();
        CloseHack();
    }
    
    private void Hints()
    {
        GoToDesk.setText( GoToDesktxt);
        PressCtoOpen.setText ( PressCtoOpentxt);
    }

    public void VerifEnchanced()
    {
        List <VentNormal> VentNormal = getObjectsInRange( 500, VentNormal.class);
        List <Vent3> Vent3 = getObjectsInRange( 500, Vent3.class);
        if( VentNormal.size() == 0 && Vent3.size() == 0) 
        {
            List <Player1> Player2 = getObjectsInRange(100 , Player1.class);
            if(Player2.size() == 0)
            {
                getWorld().addObject( GoToDesk, 100,100);
            }
            if(Player2.size() !=0 && Greenfoot.isKeyDown("c") == false ) 
            {
                getWorld().addObject( PressCtoOpen , 200,100);
                getWorld().removeObject( GoToDesk);
            }
            if(Player2.size() != 0 && ishere == false && Greenfoot.isKeyDown("c"))
            {
                
                StartButton Hack1= new StartButton();
                Hack Hack12 = new Hack();
                getWorld().addObject( Hack12, 500,275);
                getWorld().addObject( Hack1, 625,300);
                ishere= true;
            }
        }
    }

    public void CloseHack()
    {
        List <Player1> Player2 = getObjectsInRange(100 , Player1.class);
        if(Player2.size() != 0 && Greenfoot.isKeyDown("e"))
        {
            getWorld().removeObjects(getWorld().getObjects(Hack.class));
        }
    }
}
