import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Aici creez TextBox pentru PreGame , cu dimeniuni in functie de numarul de linii
 * 
 *
 * 
 */
public class TextBox extends Actor
{
    public TextBox(String text)
    {
        setTextt( text);
    }

    public void setTextt(String text)
    {
        int width = 400; // latimea maxima
        int size = 24; // marimea fontului
        int height = new GreenfootImage(" ", size, null, null).getHeight();
        
        String[] lines = text.split("\n"); // ia numarul de linii din cod si memoreaza in lines , caracterele fiecarei linii
        
        GreenfootImage image = new GreenfootImage(width, height*lines.length); // creeaza box ul in functie de numerul de linii
        image.setColor(new greenfoot.Color(255, 204, 102));
        image.fill();
        
        for (int i=0; i<lines.length; i++)
        { // construieste cutia cu linii
            GreenfootImage line = new GreenfootImage(lines[i], size, null, null);
            image.drawImage(line, 10, i*height);
        }
        
        setImage(image);
    }

}
