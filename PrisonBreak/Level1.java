import greenfoot.*;  

public class Level1 extends World
{
    public Level1()
    {    
        super(1000, 600, 1); 
        act();
        prepare();
    }
    
    private void prepare()
    {
        Player1 player1 = new Player1();
        addObject(player1,272,239);
        Player2 player2 = new Player2();
        addObject(player2,869,204);
        Settings settings = new Settings();
        addObject(settings,83,529);
        settings.setLocation(61,552);
    }
}
