
import greenfoot.*; 

public class Players extends Actor
{   
    public int checkObstacle()
    {
        Actor Objects = getOneIntersectingObject(WallHorizontal.class);
        if(Objects != null)
        {
            return 3;
        }
        return 0;
        
    }
}
