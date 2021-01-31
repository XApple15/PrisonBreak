import greenfoot.*;  

public class Player1 extends Players
{
    public void act() 
    {
        desc();
        if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY()-3);
            if(hitObject())
            {
                setLocation(getX(), getY()+3);
            }
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX()-3, getY());
            if(hitObject())
            {
            setLocation(getX()+3, getY());
            }
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 3);
            if(hitObject())
            {
                setLocation(getX(), getY()-3);
            }
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 3, getY());
            if(hitObject())
            {
            setLocation(getX() - 3, getY());
            }
        }
    } 
    private void desc()
    {
        GreenfootImage Player1= new GreenfootImage("ppl3.png");
        setImage(Player1);
        changeSize( 1.5 , 1.5 );
        ImageSet();
        
    }

}
