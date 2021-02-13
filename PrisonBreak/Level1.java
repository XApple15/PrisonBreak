import greenfoot.*;  
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Level1 extends World
{
    private String filename = "misc/Timer.txt";
    
    public boolean musicStart = false;
    boolean IsNextToJob=false;
    
    public static GreenfootSound backgroundMusic = new GreenfootSound("Soundtrack1.mp3");

    public Level1()
    {    
        super(1200, 700, 1); 
        prepare(); 
    }
    public void act()
    {
        MusicStart();
    }
    public void MusicStart()
    {
        if(musicStart == false)
        {
            backgroundMusic.playLoop();
            backgroundMusic.setVolume(100);
            musicStart = true;
        }
    }
    private void prepare()
    {
        Walls();
        deleteFile( (String) filename);
        saveFile( (String) filename, true, "1");
        Settings settings = new Settings();
        addObject(settings,1150,25);
        
        Player1 player1 = new Player1();
        Player2 player2 = new Player2();
        addObject( player1,913,133);
        addObject(player2,1005,133);
       
        addObject(new Vent1(), 1097,73);
        addObject(new VentNormal(), 595,612);
        addObject( new VentNormal() , 135,578);
        
        
        addObject( new CellDoor() ,874 , 126);
        addObject( new CellDoor() ,874 ,289 );
        addObject( new CellDoor() ,874 ,459 );
        

        
        addObject(new Desk(), 177, 455);
        addObject( new DeskStatic(), 678,557);
        
        Cop1 cop1 = new Cop1();
        addObject( cop1, 620, 500);
        Cop2 cop2 = new Cop2();
        addObject( cop2, 70,500);
        
        KeyPad KeyPad1= new KeyPad();
        addObject( KeyPad1, 25, 185);
        
        
        addObject( new Bed(), 910, 75);
        addObject( new Bed(), 1005, 75);
        addObject( new Bed(), 910, 253);
        addObject( new Bed(), 910, 417);
        
        addObject(new BigDoor(), 11, 235);
        
        
        addObject( new DoorCop1() , 621,401);
        addObject( new DoorCop2() , 264,333);
        
        addObject( new Chairs(), 121, 454);
        addObject( new Chairs(), 635, 565);
        
        addObject( new Bath() ,1077 ,175);
        addObject( new Bath() ,1077 ,348) ;
        addObject( new Bath() ,1077 , 550);
        
        addObject(new Office(), 57,360);
        addObject(new Office(), 88,360);
        addObject(new Office(), 119,360);
        addObject(new Office(), 150,360);
        addObject(new Office(), 181,360);
        addObject(new Office(), 557, 48);
        addObject(new Office(), 588, 48);
        addObject(new Office(), 619, 48);
        addObject(new Office(), 650, 48);
        
        
        addObject(new Prisoner1(), 1000, 250);
        addObject(new Prisoner2(), 1000, 450);
        
        addObject(new Timer() , 300,200);
        
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

    public boolean deleteFile(String filename) {
        BufferedWriter file = null;
        try {
            file = new BufferedWriter(new FileWriter(filename));
            file.write("");
            file.close();
        }
        catch (FileNotFoundException fnfe) {
            //fnfe.printStackTrace();
            return true;
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
            return false;
        }
        finally {
            try {
                file.close();
            }
            catch (IOException ioe) {
                ioe.printStackTrace();
            }
            catch (NullPointerException npe) {
                //npe.printStackTrace();
            }
        }
        return true;
    }
    public boolean saveFile(String filename, boolean addToExistingFile, String ... fileText) {
        List<String> existingText = loadFile(filename);
        BufferedWriter file = null;
        try {
            file = new BufferedWriter(new FileWriter(filename));
            if (addToExistingFile) {
                for (String output : existingText) {
                    file.write(output);
                    file.write('\n');
                }
            }
            for (String output : fileText) {
                file.write(output);
                file.write('\n');
            }
            file.close();
        }
        catch (IOException ioe) {
            //ioe.printStackTrace();
            return false;
        }
        finally {
            try {
                file.close();
            }
            catch (IOException ioe) {
                ioe.printStackTrace();
            }
            catch (NullPointerException npe) {
                //npe.printStackTrace();
            }
        }
        
        return true;
    }
    public java.util.List<String> loadFile(String filename) {
        ArrayList<String> fileText = new ArrayList<String>();
        BufferedReader file = null;
        try {
            file = new BufferedReader(new FileReader(filename));
            String input;
            while ((input = file.readLine()) != null) {
                fileText.add(input);
            }
        }
        catch (FileNotFoundException fnfe) {
            //fnfe.printStackTrace();
            return null;
        }
        catch (IOException ioe) {
            //ioe.printStackTrace();
            return null;
        }
        finally {
            try {
                file.close();
            }
            catch (IOException ioe) {
                ioe.printStackTrace();
            }
            catch (NullPointerException npe) {
                //npe.printStackTrace();
            }
        }
        return fileText;
    }
}
