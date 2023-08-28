package yourturn6complete;
/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class TaskList implements Tasker
{
   private Task[] tasks = new Task[10];

   public void addTask (Task task)
   {
      for (int floor = 0; floor < tasks.length; floor++) {
         if (this.tasks[floor] == null) {
            this.tasks[floor] = task;
            return;
         }
      }
   }

   public Task getATask (int taskNumber) throws Exception
   {
      if (this.tasks[taskNumber] == null) {
         throw new Exception("Task doesn't exist");
      }
      return this.tasks[taskNumber];
   }

   public String getAllTasks ()
   {
      String returnTasks = "";
      for (int floor = 0; floor < this.tasks.length; floor++) {
         if (this.tasks[floor] != null) {
            returnTasks += floor + "." + this.tasks[floor].toString();
         }
      }
      return returnTasks;
   }

  
   public void markTaskAsComplete (int taskNumber)
   {
      if (this.tasks != null) {
         this.tasks[taskNumber].setComplete(true);
      }
   }

}
