import greenfoot.*;  
public class KeyPass extends Jobs
{
    private boolean click = false;
    public KeyPass()
    {
        setImage("KeyPass.png");
    }
    public void act() 
    {
        
    }   
        public boolean code()
    {
        if(Greenfoot.mouseClicked(null))
        {
            Actor mouseActor = Greenfoot.getMouseInfo().getActor();
            if(mouseActor instanceof Number0)
            {           
            }
            else if(mouseActor instanceof Number1)
            {
            }
            else if(mouseActor instanceof Number2)
            {
            }
            else if(mouseActor instanceof Number3)
            {
            }
            else if(mouseActor instanceof Number4)
            {
            }
            else if(mouseActor instanceof Number5)
            {
            }
            else if(mouseActor instanceof Number6)
            {
            }
            else if(mouseActor instanceof Number7)
            {
            }
            else if(mouseActor instanceof Number8)
            {
            }
            else if(mouseActor instanceof Number9)
            {
            }
            else if(mouseActor instanceof DeleteNumber)
            {
            }
        }
        return click;
    }
}
