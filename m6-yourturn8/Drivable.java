package yourturn8complete;

/**
 * @Rich Smith at ZenOfProgramming.com
 */

public interface Drivable 
{
    String driveTo(Location destination) throws Exception;
    
    String  getListOfPassengerNames();
}
