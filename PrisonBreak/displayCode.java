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
public class displayCode extends Hack
{
    private String CodeFile = "misc/Code.txt";
    private boolean isGenerated =false;

    private int CODE;
    public void act()
    {
        if( isGenerated == false)
        {
            CODE = Greenfoot.getRandomNumber( 9999 );
            if ( CODE > 1245) 
            {
                isGenerated = true;
                return;
            }
            return;
        }
    }

    public displayCode()
    {
        deleteFile( CodeFile);
        GreenfootImage displayCode = new GreenfootImage(200,300);
        while( isGenerated == false ) GenerateCode();
        displayCode.drawString(CODE+"", 50, 100);
        setImage(displayCode);

        saveFile( CodeFile , true , CODE+"");
    }  

    public void GenerateCode()
    {

        CODE = Greenfoot.getRandomNumber( 9999 );
        if ( CODE > 1245) 
        {
            isGenerated = true;
            return;
        }
        return;

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
