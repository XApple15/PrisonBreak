import greenfoot.*;  

public class Level1 extends World
{
    public Level1()
    {    
        super(1200, 600, 1); 
        act();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player1 player1 = new Player1();
        addObject(player1,272,239);
        Player2 player2 = new Player2();
        addObject(player2,869,204);
    }
}
