import greenfoot.*; 
 
public class Lyn extends Actor
{
    GreenfootImage[] images = new GreenfootImage[4];
    int imageNumber;
    long LastTime;
    public Lyn()
    {
        for( int i=1; i<images.length; i++ ) images[i] = new GreenfootImage( "Vents/Vent_" + i + ".png" );
        setImage( images[imageNumber] );
       
    }
 
    public void act()
    {
        animation();
    }
 
    public void animation()
    {
        imageNumber = ( imageNumber + 1 ) % images.length;
        setImage( images[imageNumber] );
         LastTime = System.currentTimeMillis();
        while ( LastTime + 500 >= System.currentTimeMillis() ) 
        {}
    }
}