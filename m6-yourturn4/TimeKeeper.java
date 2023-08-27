/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yourturn4complete;

/**
 *
 * @author ITSC
 */
public interface TimeKeeper
{
    void setTime (int hours, int minutes, boolean pm);

    String getTime ();
}
