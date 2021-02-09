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

/**
 * afiseaza Current Time si Best Time, iar in caz ca Current Time < Best Time, creeaza un nou bestscore
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class WinScreen extends World
{
    public int BestTimeinSec;
    public int LastTimeinSec;
    
    private String BestTimeFile = "misc/BestTime.txt";
    private String LastTimeFile = "misc/Timer.txt";
   

    public void act()
    {
            ScoreAndMisc();
    }

    public WinScreen()
    {    
        super(1200, 700, 1); 
        addObject( new BackgroundWinScreen(), 600, 350);
        ScoreAndMisc();
    }

    private void ScoreAndMisc()
    {
        BestTime CurrentFinalTime = new BestTime(" ");
        BestTime besttime = new BestTime(" ");
        loadFileLastTime( (String) LastTimeFile); 
        loadFileBestTime ( (String) BestTimeFile); 
        

        if( LastTimeinSec < BestTimeinSec )
        {
            CurrentFinalTime.setText ( " NEW BEST TIME : " + LastTimeinSec /60 + ":" + LastTimeinSec %60);
            besttime.setText( " Last Best Time : " + BestTimeinSec/60 + ":" + BestTimeinSec %60);
            deleteFile( (String) BestTimeFile);
            saveFile ( (String) BestTimeFile , true, LastTimeinSec+"");
        }
        else 
        {
            CurrentFinalTime.setText ( " Current Time : " + LastTimeinSec/60 + ":" + LastTimeinSec %60);
            besttime.setText( " Your Best Time : " + BestTimeinSec/60 + ":" + BestTimeinSec%60);           
        }

        addObject(CurrentFinalTime, 600, 350);
        addObject(besttime, 600,450);
        addObject(new GoToMainMenu(), 600, 530);
    }
    
    public java.util.List<String> loadFileLastTime(String filename) {
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
        int z = fileText.size();
        LastTimeinSec = stringToInteger( (String) fileText.get(z-1));

        return fileText;
    }
    
    public java.util.List<String> loadFileBestTime(String filename) {
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

    private int stringToInteger(String numStr)
    {
        int val = 0;
        for (int i = 0; i < numStr.length(); i++) val = val * 10 + "0123456789".indexOf(numStr.charAt(i));
        return val;
    }
}
