import greenfoot.*;  
import java.util.List;
/**
 * Cutting Vent
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Job2 extends Jobs
{
    boolean FinishedCutting = false;
    boolean finishedCutting = false;
    boolean Bar_Reverse = false ;
    
    long lastCutTime = 01;
    long LastTime, CurrentTime;
    private int i, j, bar_number;
    private int CutDelay = 50;
    int BAR_NO = 1 ;  
    int currentCut = 0;
    
    public static final long CUT_TIME_DIF = 100;
    public static final int MAX_CUT = 10;
    
    public void act() 
    {
            Cutting();
    }    

    public  void Cutting() 
    {
        if ( Greenfoot.isKeyDown("5")  == false || finishedCutting ) 
        {
            lastCutTime = 01;
            getWorld().removeObject(this);
            return;
        }
        if( System.currentTimeMillis() > lastCutTime + CUT_TIME_DIF)
        {
            lastCutTime = System.currentTimeMillis();
            if( Bar_Reverse == true ) currentCut--;
            else currentCut ++;
            setImage( "cuts/cut" + BAR_NO + "_" + currentCut + ".png");
            if(currentCut == MAX_CUT && BAR_NO == 4 ) finishCutting();
            if(currentCut == MAX_CUT) 
            {
                Bar_Reverse = true;
            }
            if( currentCut == 1 && Bar_Reverse == true) 
            {
                Bar_Reverse = false;
                BAR_NO++;
            }
        }
    }
    
    private void finishCutting()
    {
        finishedCutting = true;
        goToNextPoint();
    }

    private void goToNextPoint() // teleporteaza player2 in camera gardianului
    {
        getWorld().removeObjects( getWorld().getObjects(Vent2.class)); 
        getWorld().removeObjects( getWorld().getObjects(Player2.class));
        getWorld().addObject( new Player2(), 596, 563);
        getWorld().removeObject(this);
    }
}
