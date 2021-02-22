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

public class MainMenu extends World
{
    private String filename = "misc/BestTime.txt";
    public static GreenfootSound soundtrack ;

    public MainMenu()
    {    
        super(1200, 700, 1); 
        prepare();
    }

    public void act()
    {
        MusicStart();
    }

    private void prepare()
    {
        GreenfootImage logo = new GreenfootImage("Logo.png");
        Logo logoPic = new Logo(logo);
        addObject(logoPic,getWidth()/2,150);

        addObject( new Play() , getWidth()/2 ,288 );
        addObject( new Instructions() , getWidth()/2 , 401) ;
        addObject( new Exit() , getWidth()/2 , 531 );

        loadFile( (String) filename);
    }

    private int stringToInteger(String numStr)
    {
        int val = 0;
        for (int i = 0; i < numStr.length(); i++) val = val * 10 + "0123456789".indexOf(numStr.charAt(i));
        return val;
    }

    public void MusicStart()
    {
        if (soundtrack == null)
        {
            soundtrack = new GreenfootSound("jail.mp3");
            soundtrack.setVolume(100);
        }
        soundtrack.playLoop();
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
        BestTime besttime = new BestTime(" ");
        int x = stringToInteger( (String) fileText.get(0));

        besttime.setText("Best Time : " + x/60 + ":"+ x%60);
        if( x/60 <= 9 )
        {
            if( x%60 <= 9 ) besttime.setText("Best Time : " + "0" + x/60 + ":" +"0"+ x%60 );
            else besttime.setText("Best Time : " + "0" +  x/60 + ":"+ x%60);
        }
        else if( x % 60 <=9 ) besttime.setText("Best Time : " + x/60 + ":"+ "0" + x%60);

        addObject(besttime, 981, 623);
        return fileText;
    }

}
