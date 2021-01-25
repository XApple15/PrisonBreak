import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Job1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Job1 extends Jobs
{
    int NumberOfCutsMade = 0;
    int NumberOfCutsRequiered = 20; 
    boolean FinishedCutting = false;
    public void act() 
    {
        description();
        Cutting();
    }    
    private void description()
    {
         GreenfootImage Job_1= new GreenfootImage("Wall.png");
         Job_1.scale(200,500);
         setImage(Job_1);     
         
    }
    public  void Cutting() // incepe taierea
    {
       while(Greenfoot.isKeyDown("c"))
        {
            for(int i=1;i<=5;i++)
               { 
                 setImage("cut"+i+".png");
                 NumberOfCutsMade++;
                 if(NumberOfCutsMade == 20)
                   { 
                       FinishedCutting=true;
                   }    
               }
            
        }
    }
    
    
}
