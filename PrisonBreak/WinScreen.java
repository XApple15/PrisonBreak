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
public class WinScreen extends World
{
    public int BestTimeinSec;

    private String filename = "misc/BestTime.txt";
    int mins = 45;
    int sec = 35;

    public void act()
    {

    }

    public WinScreen()
    {    
        super(1200, 700, 1); 
        addObject( new Timer(), 300,300);
    }

    private void ScoreAndMisc()
    {
        BestTime CurrentFinalTime = new BestTime(" ");
        BestTime besttime = new BestTime(" ");
        loadFile( (String) filename);
        int CurrentTime = mins*60 + sec;

        if( CurrentTime > BestTimeinSec )
        {
            CurrentFinalTime.setText ( " NEW BEST TIME :" + mins + ":" + sec);
            besttime.setText( " Last Best Time : " + BestTimeinSec/60 + ":" + BestTimeinSec %60);
        }
        else 
        {
            CurrentFinalTime.setText ( " Current Time : " + mins + ":" + sec);
            besttime.setText( " Your Best Time : " + BestTimeinSec/60 + ":" + BestTimeinSec%60);
        }

        addObject(CurrentFinalTime, 300, 200);
        addObject(besttime, 300,100);

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

        BestTimeinSec = stringToInteger( (String) fileText.get(0));

        return fileText;
    }

    private int stringToInteger(String numStr)
    {
        int val = 0;
        for (int i = 0; i < numStr.length(); i++) val = val * 10 + "0123456789".indexOf(numStr.charAt(i));
        return val;
    }
}
