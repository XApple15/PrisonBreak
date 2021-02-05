import greenfoot.*;  
import java.util.List;

public class KeyPad extends Objects
{
    public KeyPad()
    {
        GreenfootImage KeyPad = new GreenfootImage("KeyPad.png");
        setImage(KeyPad);
        changeSize(14,14);
        ImageSet();
    }
    KeyPass KeyPass1;
    private Player1 Player1;
    private boolean ishere= false;
    public void act()
    {
        VerifEnchanced();
        CloseHack();
    }
    public void Verif()
    {
        Actor Player1= getOneIntersectingObject(Player1.class);
        if( Player1 != null)
        { 
            Greenfoot.stop();
        }
    }
    public void VerifEnchanced()
        {
            List <Player1> Player2 = getObjectsInRange(100 , Player1.class);
            if(Player2.size() != 0 && ishere == false && Greenfoot.isKeyDown("c"))
            {
                KeyPass KeyPass1 = new KeyPass();
                Number1 number1 = new Number1();
                Number2 number2 = new Number2();
                Number3 number3 = new Number3();
                Number4 number4 = new Number4();
                Number5 number5 = new Number5();
                Number6 number6 = new Number6();
                Number7 number7 = new Number7();
                Number8 number8 = new Number8();
                Number9 number9 = new Number9();
                Number0 number0 = new Number0();
                DeleteNumber deletenumber = new DeleteNumber();
                getWorld().addObject( KeyPass1, 500,275);
                getWorld().addObject( number1, 460,230);
                getWorld().addObject( number2, 500,230);
                getWorld().addObject( number3, 540,230);
                getWorld().addObject( number4, 460,275);
                getWorld().addObject( number5, 500,275);
                getWorld().addObject( number6, 540,275);
                getWorld().addObject( number7, 460,320);
                getWorld().addObject( number8, 500,320);
                getWorld().addObject( number9, 540,320);
                getWorld().addObject( number0, 500,365);
                getWorld().addObject( deletenumber, 540,365);
                ishere= true;
            }
    }
    public void CloseHack()
    {
        List <Player1> Player2 = getObjectsInRange(100 , Player1.class);
        if(Player2.size() != 0 && Greenfoot.isKeyDown("e"))
        {
            getWorld().removeObjects(getWorld().getObjects(KeyPass.class));
        }
    }
}
