import greenfoot.*;  
import java.util.List;
import java.lang.Math; 

public class CopRunner extends NPC
{
    double distPlayer1toCop, distPlayer2toCop ;
    int movement = 1;

    public void act() 
    {
        List setting = getWorld().getObjects(SettingMenu.class);
        if(setting.size() == 0)
        {
            CheckPlayers();
        }
    }    

    private void CheckPlayers()
    {
        List <Player1> Player1List = getObjectsInRange( 1200, Player1.class);
        Actor Player1 = Player1List.get(0);
        distPlayer1toCop = Math.sqrt( Math.pow(getX() - Player1.getX(), 2) + Math.pow(getX() - Player1.getY(), 2));

        List <Player2> Player2List = getObjectsInRange( 1200, Player2.class);
        Actor Player2 = Player2List.get(0);

        distPlayer2toCop = Math.sqrt( Math.pow(getX() - Player2.getX(), 2)  + Math.pow( getX() - Player2.getY(), 2));

        if( distPlayer2toCop > distPlayer1toCop ) GoToPlayer ( (Actor) Player1 );
        else if( distPlayer2toCop < distPlayer1toCop ) GoToPlayer( (Actor) Player2);
        else GoToPlayer( (Actor) Player1);
    }

    private void GoToPlayer( Actor Player )
    {
        if( getX() > Player.getX() ) 
        {
            if( getY() > Player.getY() )
            {
                setLocation( getX() - movement , getY() - movement);
                setImage ( "Cops/Cop1/Cop1_left.png");
                changeSize(1.5 , 1.5);
                return ;
            }
            else if( getY() < Player.getY() )
            {
                setLocation( getX() - movement , getY() + movement ) ;
                setImage( "Cops/Cop1/Cop1_front.png");
                changeSize(1.5 , 1.5);
                return;
            }
            else if( getY() == Player.getY() )
            {
                setLocation( getX() - movement , getY() ) ;
                setImage( "Cops/Cop1/Cop1_left.png");
                changeSize(1.5 , 1.5);
                return;
            }            
        }
        else 
        {
            if( getX() < Player.getX() ) 
            {
                if( getY() > Player.getY() )
                {
                    setLocation( getX() + movement , getY() - movement);
                    setImage ( "Cops/Cop1/Cop1_right.png");
                    changeSize(1.5 , 1.5);
                    return ;
                }
                else if( getY() < Player.getY() )
                {
                    setLocation( getX() + movement , getY() + movement ) ;
                    setImage ( "Cops/Cop1/Cop1_front.png");
                    changeSize(1.5 , 1.5);
                    return;
                }
                else if( getY() == Player.getY() )
                {
                    setLocation( getX() + movement , getY() ) ;
                    setImage ( "Cops/Cop1/Cop1_right.png");
                    changeSize(1.5 , 1.5);
                    return;
                }   
            }
        }
        if( getX() == Player.getX() ) 
        {
            if( getY() > Player.getY() )
            {
                setLocation( getX()  , getY() - movement);
                setImage ( "Cops/Cop1/Cop1_back.png");
                changeSize(1.5 , 1.5);
                return ;
            }
            else if( getY() < Player.getY() )
            {
                setLocation( getX()  , getY() + movement ) ;
                setImage ( "Cops/Cop1/Cop1_front.png");
                changeSize(1.5 , 1.5);
                return;
            }

        }

    }
}
