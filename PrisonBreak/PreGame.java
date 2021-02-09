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
    
    String Dialog1 = "Yo , I`m done staying in here. Let`s get out ! ";
    String Dialog2= " Hell yes ! What`s your plan?";
    String Dialog3= "I`ve been thinking about this for months.\n Firstly, we should cut the vent in our \nroom. After that , we`ll walk trough\n the Vent hall and we`ll check for Cops.\n Your first destination will be the\n Guradian`s room. There, you have to wait\n until he will leave the room, and sneak\n inside by cutting the vent. If you`re\n lucky, you should find his WalkieTalkie.\n There , you have to use it, and make the\n Chief Officer go to Canteen. After that,\n you have to go back in Vent hall and come\n to me in Chief`s room. From there, I will\n take the lead.";
    String Dialog4= "OK.";
    String Dialog5= "I have a friend that can help us break\n their Security System and get their\n Secuirity code which we`ll use to get out\n of the prison.";
    String Dialog6= "Let`s do it then !";
    String Dialog7= "Are you sure ?";
    String Dialog8= "Hell yeah !!!";
    String Dialog9= "High five !";
    
    String[] Dialog = { null, null ,Dialog1 , Dialog2, Dialog3,Dialog4,Dialog5,Dialog6,Dialog7,Dialog8,Dialog9};

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
        if(Greenfoot.mouseClicked(BackButton))
        {
            scenario--;
            if( scenario == 0)      {Greenfoot.setWorld(new MainMenu()); return;}
            if( scenario == 1 )
            {
                removeObjects(getObjects(TextBox.class));   return;          
            }
           
            removeObjects(getObjects(TextBox.class));
            TextBox Scenario1 = new TextBox(" ");

            Scenario1.setTextt( Dialog[scenario] );
            if( scenario %2 != 0 ) addObject( Scenario1 , 863, 378);
            else addObject( Scenario1 , 518, 378);
            return;
        }
        else if( Greenfoot.mouseClicked(NextButton) )
        {
            if( scenario == 10 )
            {Greenfoot.setWorld( new Level1()); return;}
            scenario ++;

            removeObjects(getObjects(TextBox.class));
            TextBox Scenario2 = new TextBox(" ");
            Scenario2.setTextt( Dialog[scenario] );
            if( scenario %2 != 0 ) addObject( Scenario2 , 863, 378);
            else addObject( Scenario2 , 518,378);
            return;
        }
    }   
}
