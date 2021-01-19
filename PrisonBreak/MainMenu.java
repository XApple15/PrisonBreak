import greenfoot.*;  

public class MainMenu extends World
{
    public MainMenu()
    {    
        super(1000, 600, 1); 
        prepare();
        act();
    }
    private void prepare()
    {
        GreenfootImage logo = new GreenfootImage("Logo.png");
        Logo logoPic = new Logo(logo);
        addObject(logoPic,getWidth()/2,150);
        Play play = new Play();
        Exit exit = new Exit();
        Instructions instructions = new Instructions();
        addObject(play,getWidth()/2,288);
        addObject(instructions,getWidth()/2,401);
        addObject(exit,575,531);
        
        
    }


}
