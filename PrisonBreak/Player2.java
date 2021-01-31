import greenfoot.*;  

public class Player2 extends Players
{
    public void act() 
    {
        desc();
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-3);
            if(hitObject())
            {
                setLocation(getX(), getY()+3);
            }
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-3, getY());
            if(hitObject())
            {
            setLocation(getX()+3, getY());
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 3);
            if(hitObject())
            {
                setLocation(getX(), getY()-3);
            }
        }
        if(Greenfoot.isKeyDown("right"))
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
        GreenfootImage Player2= new GreenfootImage("ppl2.png");
        setImage(Player2);
        changeSize(1.5,1.5);
        ImageSet();
        
    }

    }     


