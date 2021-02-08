import greenfoot.*;  

public class Level2 extends World
{
    long FirstTimeAdd = System.currentTimeMillis();
    long DelayAddCop = 10000;
    private boolean isAdded = false;
    public static GreenfootSound backgroundMusic1 = new GreenfootSound("Soundtrack2.mp3");
    public boolean musicStart = false;
    public Level2()
    {    
        super(1200, 700, 1); 
        Description();
    }
    
    public void MusicStart()
    {
        if(musicStart == false)
        {
            backgroundMusic1.playLoop();
            backgroundMusic1.setVolume(100);
            musicStart = true;
        }
    }
    public void Description()
    {
        addObject( new BackgroundLvl2(), 600,350);
        addObject( new Lvl2_1() , 217, 536);
        addObject( new Lvl2_2() , 217, 170);
        addObject( new Lvl2_3(),  696, 41);
        addObject( new Lvl2_4(), 1026, 330);
        
        
        addObject( new Player1(), 820,127);
        addObject( new Player2(), 820, 177);
        addObject( new BigDoor(), 219 ,348); 
        addObject( new KeyPad(), 233 , 298);
        
        addObject( new Timer(), 300,300);
        addObject(new Settings(),1150,25);
    }
    
    public void act()
    {
        if( System.currentTimeMillis() < FirstTimeAdd + DelayAddCop ) 
            return;
        if (isAdded == false ) 
        {
            addObject( new CopRunner() , 100,100);
            isAdded = true;
        }
        MusicStart();
    }
}
