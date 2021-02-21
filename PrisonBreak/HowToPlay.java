import greenfoot.*;

public class HowToPlay extends World
{
    public HowToPlay()
    {    
        super(1200, 700, 1); 
        prepare();
    }
    public void prepare()
    {
        addObject(new BackgroundHowToPlay(), 600, 350);
        
        addObject(new text19(), 1000, 600);
        
    }
}
