/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yourturn6complete;

/**
 *
 * @author smirich
 */
public interface Tasker
{
   void addTask (Task task);

   Task getATask (int taskNumber) throws Exception;

   String getAllTasks ();

   void markTaskAsComplete (int taskNumber);
}
