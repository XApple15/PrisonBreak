import greenfoot.*;  

public class Level1 extends World
{
    public Level1()
    {    
        super(1000, 600, 1); 
        
        prepare();
        
    }
    public void act()
    {
        int x= player1.getX()- door2.getX();
        int y=player1.getY()-door2.getY();
        if( x<=20 && x>=-20 && y<=20 && y>=-20)
        {
            Job1 Job11=new Job1();
            addObject( Job11, 100,100);}
    }
    
    private void prepare()
    {
        Floor16 floor16 = new Floor16();
        addObject(floor16,500,300);
        
        Walls();
        
        Player1 player1 = new Player1();
        addObject(player1,403,226);
        Player2 player2 = new Player2();
        addObject(player2,869,204);
        
        Settings settings = new Settings();
        addObject(settings,83,529);
        settings.setLocation(61,552);
        
        
        
        Door door1 = new Door();
        addObject(door1,838,226);
       
        Door door2 = new Door();
        addObject(door2,412,226);
        
        
    }

    private void Walls()
    {
        WallVertical wallVertical = new WallVertical();
        addObject(wallVertical,733,274);
        
        WallVertical wallVertical2 = new WallVertical();
        addObject(wallVertical2,733,415);
        
        WallVertical wallVertical3 = new WallVertical();
        addObject(wallVertical3,307,415);
       
        WallVertical wallVertical4 = new WallVertical();
        addObject(wallVertical4,307,274);
        
        WallHorizontal wallHorizontal = new WallHorizontal();
        addObject(wallHorizontal,718,506);
       
        WallHorizontal wallHorizontal2 = new WallHorizontal();
        addObject(wallHorizontal2,152,506);
        
        CellDoorWall cellDoorWall = new CellDoorWall();
        addObject(cellDoorWall,965,226);
       
        CellDoorWall cellDoorWall2 = new CellDoorWall();
        addObject(cellDoorWall2,899,226);
        
        CellDoorWall cellDoorWall3 = new CellDoorWall();
        addObject(cellDoorWall3,777,226);
        
        CellDoorWall cellDoorWall4 = new CellDoorWall();
        addObject(cellDoorWall4,351,226);
       
        CellDoorWall cellDoorWall5 = new CellDoorWall();
        addObject(cellDoorWall5,539,226);
        
        CellDoorWall cellDoorWall6 = new CellDoorWall();
        addObject(cellDoorWall6,473,226);
        
        CellDoorWall cellDoorWall7 = new CellDoorWall();
        addObject(cellDoorWall7,688,226);
        
        CellDoorWall cellDoorWall8 = new CellDoorWall();
        addObject(cellDoorWall8,629,226);
        
        CellDoorWall cellDoorWall9 = new CellDoorWall();
        addObject(cellDoorWall9,600,226);
    }
    
    }
    
 

