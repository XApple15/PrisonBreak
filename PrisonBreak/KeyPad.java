import greenfoot.*;  
import java.util.List;

public class KeyPad extends Objects
{
    String PressCtoTypeTheCodetxt = "Press C to open the KeyPad";
    String TypeCodetxt = "Type the code and press E to close";
    String GoToExittxt = "Exit the building!";
    String GoToPrisonExittxt = "Go to the Prison exit !";
    String FollowYourMatetxt = "Follow your Ex-cellmate!";

    Hint GoToPrisonExit = new Hint(" ");
    Hint PressCtoTypeTheCode = new Hint(" ");
    Hint TypeCode = new Hint(" ");
    Hint GoToExit = new Hint(" ");
    Hint FollowYourMate = new Hint(" ");
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
    private boolean presstotype = false;
    private boolean typecode = false;
    private boolean exitbuilding = false;
    private boolean gotoprisonexit = false ;
    private boolean followadded = false;
    public void act()
    {
        Hints();
        VerifEnchanced();
        CloseHack();
    }

    private void Hints()
    {
        PressCtoTypeTheCode.setText(PressCtoTypeTheCodetxt);
        TypeCode.setText(TypeCodetxt);
        GoToExit.setText(GoToExittxt);
        GoToPrisonExit.setText( GoToPrisonExittxt);
        FollowYourMate.setText( FollowYourMatetxt);
    }

    public void VerifEnchanced()
    {
        List <Player1> Player2 = getObjectsInRange(120 , Player1.class);
        List <Desk> DeskHack = getObjectsInRange( 500, Desk.class);
        if( Player2.size() == 0 && ishere == true)
        {
            getWorld().removeObjects( getWorld().getObjects(KeyPass.class));
            ishere = false;
        }
        if( DeskHack.size() == 0 ) 
        {
            if( followadded == false )
            {
                getWorld().addObject( FollowYourMate , 1011,680);
                followadded = true;
            }
            if( gotoprisonexit == false)
            {
                getWorld().addObject( GoToPrisonExit , 181,640);
                gotoprisonexit = true;
            }
            if( Player2.size() !=0 && ishere == false ) 
            {
                getWorld().removeObject( GoToPrisonExit);
                getWorld().addObject( PressCtoTypeTheCode, 181, 640 );
                if( Greenfoot.isKeyDown("c") ) 
                {
                    if( presstotype == true) getWorld().removeObject( PressCtoTypeTheCode);
                    if( typecode == false )
                    {
                        getWorld().addObject(TypeCode , 181,680);
                        typecode = true;
                    }
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
        }
        else {
            if(Player2.size() != 0 && ishere == false  )
            {
                if( presstotype == false )
                {
                        getWorld().addObject( PressCtoTypeTheCode ,181, 680);
                        presstotype = true;
                    }

                    if( Greenfoot.isKeyDown("c") ) 
                    {
                        if( presstotype == true) getWorld().removeObject( PressCtoTypeTheCode);
                        if( typecode == false )
                        {
                            getWorld().addObject(TypeCode , 181,640);
                            typecode = true;
                        }
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
            }
        }

        public void CloseHack()
        {
            List <Player1> Player2 = getObjectsInRange(120 , Player1.class);
            if(Player2.size() != 0 && Greenfoot.isKeyDown("e"))
            {
                if( exitbuilding == false )
                {
                    getWorld().addObject( GoToExit , 181,680);
                    exitbuilding = true ;
                }
                getWorld().removeObject(TypeCode);
                getWorld().removeObjects(getWorld().getObjects(KeyPass.class));
                ishere = false;
            }
        }
    }
