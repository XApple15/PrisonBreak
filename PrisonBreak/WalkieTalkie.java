import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class WalkieTalkie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WalkieTalkie extends GuardiansRoom
{
    private boolean GoToadded = false;
    private boolean canAddPressToSpeak = false;
    Hint GoToWalkie = new Hint(" ");
    Hint PressToSpeak = new Hint(" ");
    Hint ReadThis = new Hint(" ");
    String GoToWalkietxt = "Grab the Walkietalkie from the Desk";
    String PressToSpeaktxt = "Press NUM1 to speak";
    String ReadThistxt = " Press NUM2 to make the Chief leave his room" ;
    public void act() 
    {
        GoToWalkie.setText( GoToWalkietxt );
        PressToSpeak.setText( PressToSpeaktxt );
        ReadThis.setText( ReadThistxt );
        RunJob();
    }    
    public WalkieTalkie()
    {
        setImage ( "WalkieTalkie.png" );
    }
    private void RunJob()
    {
        List <Vent2> Vent22 = getObjectsInRange ( 500, Vent2.class);
        
        if( Vent22.size() == 0 && GoToadded == false  )
        {
            getWorld().addObject( GoToWalkie, 100,100);
            GoToadded = true;
            canAddPressToSpeak = true;
        }
        
        List <Player2> Player22 = getObjectsInRange( 40 ,Player2.class);
        if( Player22.size() !=0 && canAddPressToSpeak == true)
        {
            getWorld().removeObject( GoToWalkie);
            getWorld().addObject( PressToSpeak, 200,200);
            if( Greenfoot.isKeyDown("1") == true )
            {
                Greenfoot.stop();
            }
        }
    }
}
