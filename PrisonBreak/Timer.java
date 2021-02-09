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
 * Timer care foloseste fisier .txt
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Timer extends Actor
{
    private boolean isFirstDeleted = false;
    
    private long StartTime = System.currentTimeMillis();
    private long currentTime,  durationSeconds;
    private long  Delay = 1000;
    private long StartTimeDelay = 01;
    int z;
    
    String LastTimeFromFile ;
    private String filename = "misc/Timer.txt";

    BestTime Timerr = new BestTime(" ");

    public void act() 
    {
        SetTime();
        getWorld().addObject(Timerr,100,100);
    }  

    public Timer()
    {
        setImage(new GreenfootImage(1,1));
    }

    private void SetTime()
    {
        if( System.currentTimeMillis() < StartTimeDelay + Delay ) return; // delay de o secunda intre afisari
        StartTimeDelay = System.currentTimeMillis(); 

        if( isFirstDeleted == true)  getWorld().removeObject(Timerr);

        loadFile( (String) filename); // incarca fisierul
        currentTime = System.currentTimeMillis();
        durationSeconds = stringToInteger ( (String) LastTimeFromFile); // transforma stringul cu timpul din fisier in integer
        durationSeconds = durationSeconds +1; // adauga cate o secunda pe ciclu
        if( durationSeconds / 60 <=9 ) // cazuri de afisare a cifrei 0 
            Timerr.setText( " Time elapsed : 0" + durationSeconds/60 + ":"+ durationSeconds%60);
        if( durationSeconds % 60 <= 9 )
            Timerr.setText( " Time elapsed : " + durationSeconds/60 + ":0"+ durationSeconds%60);
        if( durationSeconds / 60 <=9  && durationSeconds % 60 <=9 )
            Timerr.setText( " Time elapsed : " + "0"+ durationSeconds/60 + ":0" + durationSeconds%60);

        isFirstDeleted = true;
        getWorld().addObject( Timerr , 210 ,37);
        // deleteFile( (String) filename);

        saveFile( (String) filename , true , durationSeconds+""); // adauga un string cu numarul de secunde curent
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
        z = fileText.size();
        LastTimeFromFile = fileText.get(z-1);

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
        z++;
        return true;
    }

    private int stringToInteger(String numStr)
    {
        int val = 0;
        for (int i = 0; i < numStr.length(); i++) val = val * 10 + "0123456789".indexOf(numStr.charAt(i));
        return val;
    }
}

