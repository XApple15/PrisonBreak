import greenfoot.*;  
import java.util.List;
/**
 * Cutting Vent
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Job1 extends Jobs
{
    boolean FinishedCutting = false;
    boolean Bar_Reverse = false ;
    boolean finishedCutting = false;
    
    
    private int i, j, bar_number;
    private int CutDelay = 50;
    long lastCutTime = 01;
    long LastTime, CurrentTime;
    int currentCut = 0;
    int BAR_NO = 1 ;
    
    public static final long CUT_TIME_DIF = 100;
    public static final int MAX_CUT = 10;   
    public void act() 
    {
            Cutting();
    }    

    public  void Cutting() 
    {
        if ( Greenfoot.isKeyDown("c")  == false || finishedCutting ) 
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

    private void goToNextPoint() // teleporteaza player1 si 2 in ventroom
    {
        getWorld().removeObjects( getWorld().getObjects(Vent1.class));
        getWorld().removeObjects( getWorld().getObjects(Players.class));
        getWorld().removeObjects( getWorld().getObjects(VentNormal.class));
        getWorld().addObject( new Vent2(), 595,612);
        getWorld().addObject( new Vent3(), 135,578);
        getWorld().addObject( new Player1(), 1150,90);
        getWorld().addObject( new Player2(), 1150, 135);
        getWorld().addObject( new WalkieTalkie(), 670, 532);
        getWorld().removeObject(this);
    }
}
