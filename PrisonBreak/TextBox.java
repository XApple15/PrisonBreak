import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextBox extends Actor
{
    public TextBox(String text)
    {
        setTextt( text);
    }
     
    public void setTextt(String text)
    {
         int width = 600; // maximum width of a line
         int size = 24; // font size of text
         int height = new GreenfootImage(" ", size, null, null).getHeight();
        String[] lines = text.split("\n"); // get lines
        GreenfootImage image = new GreenfootImage(width, height*lines.length); // final image
        for (int i=0; i<lines.length; i++)
        { // draw each line image on final image
            GreenfootImage line = new GreenfootImage(lines[i], size, null, null);
            image.drawImage(line, 10, i*height);
        }
        
        //GreenfootImage textImg = new GreenfootImage("Hint: " + text, 22, Color.BLACK, new Color(0, 0, 0, 0));
        //GreenfootImage img = new GreenfootImage(354, 44);
        //img.setColor(new greenfoot.Color(255, 204, 102));
        //img.fill();
        //img.drawImage(textImg, 177-textImg.getWidth()/2, 22-textImg.getHeight()/2);
        setImage(image);
        
       
    }
    
    
    public int countChar(String str, char c , char d)
{
    int count = 0;

    for(int i=0; i < str.length() - 1; i++)
    {    if (str.charAt(i) == c &&  str.charAt(i+1) == 'n')
            count++;
    }

    return count;
}
}
