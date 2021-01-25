import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CellDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CellDoorWall extends Objects
{
    public CellDoorWall() 
    {
        GreenfootImage WallHorizontal = new GreenfootImage("Wall_cell_door.png");
        setImage(WallHorizontal);
        changeSize(1.5 , 1);
        ImageSet();
    }    
}
