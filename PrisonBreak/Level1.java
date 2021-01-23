import greenfoot.*;  

public class Level1 extends World
{
    public Level1()
    {    
        super(1000, 600, 1); 
        act();
        prepare();
    }
    
    private void prepare()
    {
        Player1 player1 = new Player1();
        addObject(player1,272,239);
        Player2 player2 = new Player2();
        addObject(player2,869,204);
        Settings settings = new Settings();
        addObject(settings,83,529);
        settings.setLocation(61,552);
        Floor floor = new Floor();
        addObject(floor,487,238);
        Floor floor2 = new Floor();
        addObject(floor2,548,234);
        Floor floor3 = new Floor();
        addObject(floor3,632,231);
        Floor floor4 = new Floor();
        addObject(floor4,633,272);
        floor4.setLocation(639,272);
        floor4.setLocation(636,265);
        floor2.setLocation(588,234);
        floor.setLocation(595,261);
        Floor floor5 = new Floor();
        addObject(floor5,689,222);
        floor5.setLocation(665,234);
        Floor floor6 = new Floor();
        addObject(floor6,694,280);
        floor6.setLocation(662,264);
        Floor floor7 = new Floor();
        addObject(floor7,624,319);
        floor7.setLocation(594,299);
        floor7.setLocation(592,296);
        Floor floor8 = new Floor();
        addObject(floor8,621,316);
        floor8.setLocation(642,301);
        Floor floor9 = new Floor();
        addObject(floor9,704,308);
        floor9.setLocation(659,304);
        floor9.setLocation(676,302);
    }
}
