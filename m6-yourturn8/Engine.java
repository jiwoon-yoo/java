package yourturn8complete;
/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class Engine
{
    private boolean engineRunning = false;

    public void startEngine ()
    {
        this.engineRunning = true;
    }

    public void stopEngine ()
    {
        this.engineRunning = false;
    }

    public boolean isEngineRunning ()
    {
        return this.engineRunning;
    }
}
