import greenfoot.*;  

public class Level1 extends World
{
    boolean IsNextToJob=false;
    public Level1()
    {    
        super(1200, 700, 1); 
        prepare(); 
    }
    
    
    private void prepare()
    {
        Background_lvl1 Background = new Background_lvl1();
        addObject(Background,600,350);
        Walls();
        Settings settings = new Settings();
        addObject(settings,83,529);
        settings.setLocation(61,552);

      

        Player1 player1 = new Player1();
        addObject(player1,1000,100);
        Player2 player2 = new Player2();
        addObject(player2,974,151);
        
        Vent1 Vent11 = new Vent1();
        addObject(Vent11, 1097,73);
        
        VentNormal VentN2 = new VentNormal();
        addObject(VentN2, 595,612);
        
        VentNormal VentN3 = new VentNormal();
        addObject( VentN3 , 135,578);
        
        
        addObject( new CellDoor() ,874 , 126);
        addObject( new CellDoor() ,874 ,289 );
        addObject( new CellDoor() ,874 ,459 );
        

        Desk Desk1 = new Desk();
        addObject(Desk1, 315, 525);
        
        DeskStatic Desk20 = new DeskStatic();
        addObject( Desk20, 619,529);
        
        Cop1 cop1 = new Cop1();
        addObject( cop1, 620, 500);
        Cop2 cop2 = new Cop2();
        addObject( cop2, 70,500);
        
        KeyPad KeyPad1= new KeyPad();
        addObject( KeyPad1, 25, 185);
        
        Bed Bed1 = new Bed();
        addObject( Bed1, 800, 100);

        
    }
    

    private void Walls()
    {
        wall11 wall11 = new wall11();
        addObject(wall11,21,105);
        
        wall12 wall12 = new wall12();
        addObject(wall12,191,162);
        
        wall21 wall21 = new wall21();
        addObject(wall21,20,431);
        
        wall22 wall22 = new wall22();
        addObject(wall22,139,335);
        
        wall23 wall23 = new wall23();
        addObject(wall23,352,336);
        
        wall24 wall24 = new wall24();
        addObject(wall24,500,336);
        
        wall25 wall25 = new wall25();
        addObject(wall25,345,440);
        
        wall26 wall26 = new wall26();
        addObject(wall26,531,448);
        
        wall27 wall27 = new wall27();
        addObject(wall27,559,402);
        
        wall28 wall28 = new wall28();
        addObject(wall28,682,400);
        
        wall29 wall29 = new wall29();
        addObject(wall29,271,570);
        
        wall30 wall30 = new wall30();
        addObject(wall30,690,606);
        
        wall31 wall31 = new wall31();
        addObject(wall31,709,488);
        
        wall32 wall32 = new wall32();
        addObject(wall32,875,553);
        
        wall33 wall33 = new wall33();
        addObject(wall33,1000,572);
        
        wall34 wall34 = new wall34();
        addObject(wall34,1106,291);
        
        wall35 wall35 = new wall35();
        addObject(wall35,875,378);
        
        wall36 wall36 = new wall36();
        addObject(wall36,994,373);
        
        wall37 wall37 = new wall37();
        addObject(wall37,875,212);
        
        wall38 wall38 = new wall38();
        addObject(wall38,994,203);
        
        wall39 wall39 = new wall39();
        addObject(wall39,819,21);
        
        wall40 wall40 = new wall40();
        addObject(wall40,875,72);
        
        wall41 wall41 = new wall41();
        addObject(wall41,530,109);
        
        wall42 wall42 = new wall42();
        addObject(wall42,481,162);
        
        wall51 wall51 = new wall51();
        addObject(wall51,599,693);
        
        wall52 wall52 = new wall52();
        addObject(wall52,1192,349);
        
        wall53 wall53 = new wall53();
        addObject(wall53,1152,2);
        
        wall54 wall54 = new wall54();
        addObject(wall54,7,640);    
    }   
}
