import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PreGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PreGame extends World
{
    Back BackButton = new Back();
    Next NextButton = new Next();
    int scenario = 1;
    
    String Dialog1 = "A asa a fost da ce sa vla \n da ad ad \n";
    String Dialog2= " DAAAA";
     
    public PreGame()
    {    
        super(1200, 700, 1); 
        Description();
    }
    
    private void Description()
    {
        addObject( new BackgroundPreGame(), 600, 350);
        
        
        addObject( BackButton , 181, 649);
        addObject( NextButton, 1011, 649);
    }
    
    public void act()
    {
        int prev = scenario;
        if(Greenfoot.mouseClicked(BackButton))
        {
            if( scenario == 1) Greenfoot.setWorld(new MainMenu());
            scenario --;
            
            removeObjects(getObjects(TextBox.class));
            TextBox Scenario1 = new TextBox(" ");
            String Stringg = TB + scenario;
            Scenario1.setTextt( (String) TB + scenario );
            addObject( Scenario1 , 300, 300);
        }
        if( Greenfoot.mouseClicked(NextButton) )
        {
            if( scenario == 10 ) Greenfoot.setWorld( new Level1());
            scenario ++;
            
            removeObjects(getObjects(TextBox.class));
            TextBox Scenario2 = new TextBox(" ");
            Scenario2.setTextt( (String) Dialog + scenario );
            addObject( Scenario2 , 300, 300);
        }
        if( prev == scenario) return;
        else 
        {
            if( Greenfoot.mouseClicked(BackButton))
            {
                removeObjects(getObjects(TextBox.class));
                TextBox Scenario1 = new TextBox(" ");
                Scenario1.setTextt( (String) Dialog + scenario );
                addObject( Scenario1 , 300, 300);
            }
            else if( Greenfoot.mouseClicked(NextButton))
            {}
        }
    }
    
    
}
