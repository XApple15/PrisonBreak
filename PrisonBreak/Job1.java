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
    int NumberOfCutsMade = 0;
    boolean FinishedCutting = false;
    private int LastCut = 1;
    long LastTime = System.currentTimeMillis();
    long CurrentTime;
    public void act() 
    {
        description();
        List <Job1> IsJob1Here = getWorld().getObjects(Job1.class);
        if ( IsJob1Here != null ) 
        {
            Cutting();
        }
        if ( FinishedCutting == true ) 
        {
            DeleteVent();
        }
    }    
    private void description()
    {
         GreenfootImage Job_1= new GreenfootImage("bmw.jpg");
         setImage(Job_1);       
    }
    public  void Cutting() // incepe taierea
    {
        if(Greenfoot.isKeyDown("c"))
        {
            for(int i= LastCut;i<=20;i++)
               { 
                 setImage("cut"+i+".png");
                 NumberOfCutsMade++;
                 if(NumberOfCutsMade == 20)
                   { 
                       FinishedCutting=true;
                   }    
                 if ( Greenfoot.isKeyDown("c") == false )
                    {
                        return; // iese din FOR daca nu mai este apasata tasta "C"
                    }
                 CurrentTime = System.currentTimeMillis(); // Delay pentru desfasurarea imaginilor 
                 if ( LastTime + 500 >= CurrentTime ) 
                    {
                    LastTime = System.currentTimeMillis();
                    }
               } 
        }
        else
            {
                
            }
        if( Greenfoot.isKeyDown("x"))
        {
            getWorld().removeObject(this);  // sterge Job1 daca este apasata tasta ESC
        }
    }
    public void DeleteVent()
    {
        getWorld().removeObject(this);
    }
}
