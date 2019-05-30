import kareltherobot.*;

public class BreadCrumbFollower extends Robot
{
    public BreadCrumbFollower(int s, int a, Direction d, int b)
    {
        super(s,a,d,b);
    }

    // complete the following method (plus others as needed)
    public void travel()
    {
        //pickBeeper();
        if (beeperInFront() || beeperLeft() || beeperRight())
        {
            travel();
        }
        turnOff();
    }
    
    public boolean beeperInFront()
    {
        if (frontIsClear())
        {   
            move();
            if (!nextToABeeper())
            {
                turnAround();
                move();
                turnAround();
                return false;
            }
            else
            {
                return true;
            }
        }
        else
            return false;
    }
    public boolean beeperLeft()
    {
        turnLeft();
        if (frontIsClear())
        {
            move();
            if (!nextToABeeper())
            {
                turnAround();
                move();
                turnLeft();
                return false;
            }
            else
            {
                return true;
            }
        }
        else
            return false;
    }
    public boolean beeperRight()
    {
        turnRight();
        if (frontIsClear())
        {
            move();
            if (!nextToABeeper())
            {
                turnAround();
                move();
                turnRight();
                return false;
            }
            else
            {
                return true;
            }
        }
        else
            return false;
    }
    public void turnAround()    
    {
        turnLeft();
        turnLeft();
    }
    public void turnRight()
    {
        turnAround();
        turnLeft();
    }
}