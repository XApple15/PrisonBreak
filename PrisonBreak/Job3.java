import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Job1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Job3 extends Jobs
{
    boolean FinishedCutting = false;
    long LastTime, CurrentTime;
    private int i, j, bar_number;
    private int CutDelay = 50;
    int Player = 1;// este actionat de player 1
    
     long lastCutTime = 01;
    int currentCut = 0;
    boolean finishedCutting = false;
    public static final long CUT_TIME_DIF = 100;
    public static final int MAX_CUT = 10;
    int BAR_NO = 1 ;
    boolean Bar_Reverse = false ;
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

    private void goToNextPoint() // teleporteaza player2 in camera gardianului
    {
        getWorld().removeObjects( getWorld().getObjects(Vent3.class)); 
        getWorld().removeObjects( getWorld().getObjects(Player1.class));
        getWorld().addObject( new Player1(), 137, 533);
        getWorld().removeObject(this);
    }



}
