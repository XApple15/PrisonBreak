import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Job1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Job1 extends Jobs
{
    boolean FinishedCutting = false;
    long LastTime, CurrentTime;
    private int i, j, bar_number;
    private int CutDelay = 50;
    int Player = 1;// este actionat de player 1
    
    public void act() 
    {
        
        if( Greenfoot.isKeyDown("c")) 
          {  
              Cutting();
          }

    }    

    public  void Cutting() 
    {
        for ( bar_number = 1 ; bar_number <=4 ; bar_number++ ) // ia pe rand cele 4 bari
        {
            for( i=1 ; i<=10;i++) 
            {
                setImage("cuts/cut" + bar_number + "_"  + i + ".png" );
                if( Greenfoot.isKeyDown("c") == false ) // termina daca nu mai apasa pe C
                { getWorld().removeObject(this); return;}
                LastTime = System.currentTimeMillis();
                while ( LastTime + CutDelay >= System.currentTimeMillis() ) {} // delay dintre afisarea imag
                getWorld().repaint();
            }
            for(i=9 ; i>=1 ;i-- ) 
            {
                setImage("cuts/cut" + bar_number + "_"  + i + ".png" );
                if( Greenfoot.isKeyDown("c") == false )
                {  getWorld().removeObject(this); return;}
                LastTime = System.currentTimeMillis();
                while ( LastTime + CutDelay >= System.currentTimeMillis() ) {}
                getWorld().repaint();
            }

        }
        setImage("cuts/cut_final.png"); // arata imag cu barile taiate
        getWorld().repaint();
        
        goToNextPoint();   
    }

    private void goToNextPoint() // teleporteaza player1 si 2 in ventroom
    {
        getWorld().removeObjects( getWorld().getObjects(Bars.class));
        getWorld().removeObjects( getWorld().getObjects(Players.class));
        getWorld().addObject( new Player1(), 1150,90);
        getWorld().addObject( new Player2(), 1150, 100);
        getWorld().removeObject(this);
    }


    private void DisplayText()   
    {
       
    }

}
