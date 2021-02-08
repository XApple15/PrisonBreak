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
        addObject( new GoToMainMenu() , 600,552);
    }
}
