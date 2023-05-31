import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Special Food for our elephant.
 * 
 * @author Jason Qian
 * @version May 2023
 */
public class Gapple extends Actor
{
    int speed = 10;
    
    /**
     * Act - do whatever the Gapple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */   
    public void act()
    {
        // Apple falls downwards. 
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        // Remove gapple when gapple gets to bottom
        MyWorld world = (MyWorld) getWorld();
        if (getY() >= world.getHeight())
        {
            world.removeObject(this);
        }
    }
    
    /**
     * Speed of the gapple
     *
     */
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
