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
public class KeyPass extends Jobs
{
    private String CodeFile = "misc/Code.txt";
    private boolean click = false;
    public int m = 10;
    public int n = 10;
    public int p = 10;
    public int q = 10;
    public int code;
    private boolean dooropen = false;
    private int CODE;
    private int fails = 0;
    private boolean hasFailed= false;
    private boolean isLoadedCode = false;
    public KeyPass()
    {
        setImage("KeyPass.png");
    }
    public void act() 
    {
        code();
        if( isLoadedCode == false )
        {
            loadFile(CodeFile);
            isLoadedCode = true;
        }
            if(code==CODE)
        {
            getWorld().removeObjects(getWorld().getObjects(BigDoor.class));
            if(dooropen == false)
            {
            CellDoor celldoor = new CellDoor();
            getWorld().addObject(celldoor, 20, 280);
            celldoor.setRotation(90);
            dooropen = true;
            }
        }
        if(code != CODE && code >1000 && hasFailed == false )
        {
            fails ++;
            if( fails == 3 ) Greenfoot.setWorld(new LoseScreen() );
            hasFailed = true;
        }
        if( code == 0 )
        {
            hasFailed = false;
        }
    }   
    public void code()
    {
        if(Greenfoot.mouseClicked(null))
        {
            Actor mouseActor = Greenfoot.getMouseInfo().getActor();
            if(mouseActor instanceof Number0)
            {    
                if(m==10){ m=0; getWorld().addObject(new Digital0(), 450, 180);}
                else if(n==10){n=0; getWorld().addObject(new Digital0(), 485, 180);}
                else if(p==10){p=0; getWorld().addObject(new Digital0(), 520, 180);}
                else if(q==10){q=0; getWorld().addObject(new Digital0(), 555, 180);}
            }
            else if(mouseActor instanceof Number1)
            {
                if(m==10) {m=1; getWorld().addObject(new Digital1(), 450, 180);}
                else if(n==10){n=1; getWorld().addObject(new Digital1(), 485, 180);}
                else if(p==10){p=1; getWorld().addObject(new Digital1(), 520, 180);}
                else if(q==10){q=1; getWorld().addObject(new Digital1(), 555, 180);}
            }
            else if(mouseActor instanceof Number2)
            {
                if(m==10) { m=2; getWorld().addObject(new Digital2(), 450, 180);}
                else if(n==10){n=2; getWorld().addObject(new Digital2(), 485, 180);}
                else if(p==10){p=2; getWorld().addObject(new Digital2(), 520, 180);}
                else if(q==10){q=2; getWorld().addObject(new Digital2(), 555, 180);}
            }
            else if(mouseActor instanceof Number3)
            {
                if(m==10) {m=3; getWorld().addObject(new Digital3(), 450, 180);}
                else if(n==10){n=3;getWorld().addObject(new Digital3(), 485, 180);}
                else if(p==10){p=3;getWorld().addObject(new Digital3(), 520, 180);}
                else if(q==10){q=3;getWorld().addObject(new Digital3(), 555, 180);}
            }
            else if(mouseActor instanceof Number4)
            {
                if(m==10) {m=4; getWorld().addObject(new Digital4(), 450, 180);}
                else if(n==10){n=4; getWorld().addObject(new Digital4(), 485, 180);}
                else if(p==10){p=4; getWorld().addObject(new Digital4(), 520, 180);}
                else if(q==10){q=4; getWorld().addObject(new Digital4(), 555, 180);}
            }
            else if(mouseActor instanceof Number5)
            {
                if(m==10){ m=5; getWorld().addObject(new Digital5(), 450, 180);}
                else if(n==10){n=5; getWorld().addObject(new Digital5(), 485, 180);}
                else if(p==10){p=5; getWorld().addObject(new Digital5(), 520, 180);}
                else if(q==10){q=5; getWorld().addObject(new Digital5(), 555, 180);}
            }
            else if(mouseActor instanceof Number6)
            {
                if(m==10) {m=6; getWorld().addObject(new Digital6(), 450, 180);}
                else if(n==10){n=6; getWorld().addObject(new Digital6(), 485, 180);}
                else if(p==10){p=6; getWorld().addObject(new Digital6(), 520, 180);}
                else if(q==10){q=6; getWorld().addObject(new Digital6(), 555, 180);}
            }
            else if(mouseActor instanceof Number7)
            {
                if(m==10) {m=7; getWorld().addObject(new Digital7(), 450, 180);}
                else if(n==10){n=7; getWorld().addObject(new Digital7(), 485, 180);}
                else if(p==10){p=7; getWorld().addObject(new Digital7(), 520, 180);}
                else if(q==10){q=7; getWorld().addObject(new Digital7(), 555, 180);}
            }
            else if(mouseActor instanceof Number8)
            {
                if(m==10) {m=8; getWorld().addObject(new Digital8(), 450, 180);}
                else if(n==10){n=8; getWorld().addObject(new Digital8(), 485, 180);}
                else if(p==10){p=8; getWorld().addObject(new Digital8(), 520, 180);}
                else if(q==10){q=8; getWorld().addObject(new Digital8(), 555, 180);}
            }
            else if(mouseActor instanceof Number9)
            {
                if(m==10) {m=9; getWorld().addObject(new Digital9(), 450, 180);}
                else if(n==10){n=9; getWorld().addObject(new Digital9(), 485, 180);}
                else if(p==10){p=9; getWorld().addObject(new Digital9(), 520, 180);}
                else if(q==10){q=9; getWorld().addObject(new Digital9(), 555, 180);}
            }
            else if(mouseActor instanceof DeleteNumber)
            {
                m=10;n=10;p=10;q=10;
                getWorld().removeObjects(getWorld().getObjects(Digital.class));
            }
        }
        if(m!=10 && n!=10 && p!=10 && q!=10)
        {
            code = m*1000+n*100+p*10+q;
        }
    }
    String scodes =String.valueOf(code);
  
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
        
        CODE = stringToInteger( (String) fileText.get(0));
        return fileText;
    }
    
     private int stringToInteger(String numStr)
    {
        int val = 0;
        for (int i = 0; i < numStr.length(); i++) val = val * 10 + "0123456789".indexOf(numStr.charAt(i));
        return val;
    }
}
