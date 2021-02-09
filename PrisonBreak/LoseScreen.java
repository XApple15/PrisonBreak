import greenfoot.*;  
public class LoseScreen extends World
{
    public LoseScreen()
    {    
        super(1200, 700, 1); 
        AddButtons();
    }
    
    private void AddButtons()
    {
        addObject( new LoseScreenBackground() , 600, 350);
        addObject( new GoToMainMenu() , 600,552);
    }
}
