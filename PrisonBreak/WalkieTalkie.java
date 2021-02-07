import greenfoot.*; 
import java.util.List;

public class WalkieTalkie extends GuardiansRoom
{
    private boolean GoToadded = false;
    private boolean DONE = false;
    private boolean PressToSpeakadded = false;
    private boolean NextCPadded = false;
    private long LastTime;
    private long LastTimeEX = 01;
    private int DelayEx = 200;
    
    BiggerHint GoToWalkie = new BiggerHint(" ");
    Hint PressToSpeak = new Hint(" ");
    Hint ReadThis = new Hint(" ");
    
    String GoToWalkietxt = "Grab the Walkietalkie \n from the Desk ! ";
    String PressToSpeaktxt = "Press NUM1 to speak";
    String ReadThistxt = " Press NUM2 to make the Chief leave his room" ;
    
    public void act() 
    {
        RunJob();
    }    

    public WalkieTalkie()
    {
        setImage ( "WalkieTalkie.png" );
    }
    
    private void Hints()
    {
        GoToWalkie.setText( GoToWalkietxt );
        PressToSpeak.setText( PressToSpeaktxt );
        ReadThis.setText( ReadThistxt );
    }

    private void RunJob()
    {
        if( System.currentTimeMillis() <  LastTimeEX + DelayEx )  return;
        LastTimeEX = System.currentTimeMillis();
        
        Hints();
        
        if ( DONE == false )
        {
            List <Vent2> Vent22 = getObjectsInRange ( 500, Vent2.class);

            if( Vent22.size() == 0 && GoToadded == false  )
            {
                getWorld().addObject( GoToWalkie, 1019, 670);
                GoToadded = true;

                if( PressToSpeakadded == true ) 
                {
                    getWorld().removeObject(PressToSpeak);     PressToSpeakadded = false;  
                }
            }

            List <Player2> Player22 = getObjectsInRange( 40 ,Player2.class);
            
            if( Player22.size() !=0 )
            {
                getWorld().removeObject( GoToWalkie);   GoToadded = false;

                getWorld().addObject( PressToSpeak, 1019, 680);   PressToSpeakadded = true;

                if( Greenfoot.isKeyDown("1") == true )
                {
                    Cop2 cop2info = (Cop2)getWorld().getObjects(Cop2.class).get(0);
                    cop2info.n = 1;
                    DONE = true;
                    getWorld().removeObject(PressToSpeak);
                    LastTime = System.currentTimeMillis();
                }
            }
        }
        
        if( System.currentTimeMillis() > LastTime + 500  && DONE == true && NextCPadded == false)
        {
            DONE = true;
            NextCPadded = true;
            NextTask();
        }
    }
    
    private void NextTask(){
        getWorld().addObject( new TransparentVentExit(),595,612 );
    }
}
