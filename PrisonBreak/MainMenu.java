import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    private GreenfootSound muzica_mainmenu = new GreenfootSound ("African_fun_long.mp3");
    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        super(1000, 600, 1); 
        setBackground("bluerock.jpg");
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GreenfootImage logo = new GreenfootImage ("logo.jpg");
        Picture logoPic= new Picture(logo);
        addObject(logoPic,getWidth()/2,150);

        Play play = new Play();
        addObject(play,500,382);
        Instructions instructions = new Instructions();
        addObject(instructions,173,514);
        Exit exit = new Exit();
        addObject(exit,842,532);
        exit.setLocation(891,520);
        instructions.setLocation(250,520);
    }

    public void started()
    {
        muzica_mainmenu.play();
    }
    public void stopped()
    {
        muzica_mainmenu.stop();
    }
    
}
