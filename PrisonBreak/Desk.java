import greenfoot.*; 
import java.util.List;

public class Desk extends Objects
{
    private boolean pressC = false;
    private boolean rememberandclose = false;
    
    String PressCtoOpentxt = "Press X to turn on the Computer and \nSTART hacking to find the 4-digit code!" ;
    String RememberAndClosetxt = "Hack the security system and press E to \nturn off the Computer after you find the code";

    BiggerHint PressCtoOpen = new BiggerHint(" ");
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
        PressCtoOpen.setText ( PressCtoOpentxt);
        RememberAndClose.setText(RememberAndClosetxt);
    }

    public void VerifEnchanced()
    {
        List <VentNormal> VentNormal = getObjectsInRange( 500, VentNormal.class);
        List <Vent3> Vent3 = getObjectsInRange( 500, Vent3.class);
        if( VentNormal.size() == 0 && Vent3.size() == 0) 
        {
            List <Player1> Player2 = getObjectsInRange(100 , Player1.class);
            if(Player2.size() !=0 && Greenfoot.isKeyDown("x") == false && pressC == false) 
            {
                getWorld().addObject( PressCtoOpen , 200,100);
                pressC = true;
            }
            if(Player2.size() != 0 && ishere == false && Greenfoot.isKeyDown("x") && rememberandclose == false)
            {
                getWorld().removeObject( PressCtoOpen);
                getWorld().addObject( RememberAndClose , 200,100);
                StartButton Hack1= new StartButton();
                Hack Hack12 = new Hack();
                getWorld().addObject( Hack12, 500,275);
                getWorld().addObject( Hack1, 625,300);
                ishere= true;
                rememberandclose = true;
            }
        }
    }

    public void CloseHack()
    {
        List <Player1> Player2 = getObjectsInRange(100 , Player1.class);
        if(Player2.size() != 0 && Greenfoot.isKeyDown("e"))
        {
            getWorld().removeObjects(getWorld().getObjects(Hack.class));
            getWorld().removeObject( RememberAndClose);
        }
    }
}
