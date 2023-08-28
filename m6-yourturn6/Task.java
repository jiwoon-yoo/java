package yourturn6complete;
/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class Task
{
   private String taskSubject;
   private Priority priority;
   private boolean complete;

   public boolean isComplete ()
   {
      return complete;
   }

   public void setComplete (boolean complete)
   {
      this.complete = complete;
   }

   public Task (String taskSubject, Priority priority)
   {
      this.taskSubject = taskSubject;
      this.priority = priority;
      this.complete = false;
   }

   public String getTaskSubject ()
   {
      return taskSubject;
   }

   public void setTaskSubject (String taskSubject)
   {
      this.taskSubject = taskSubject;
   }

   public Priority getPriority ()
   {
      return priority;
   }

   public void setPriority (Priority priority)
   {
      this.priority = priority;
   }

   @Override
   public String toString ()
   {

      String status = (complete) ? "COMPLETE" : "Not Complete";
      String returnValue = String.format("%-15s\t%-15s\t%-15s\n", this.taskSubject, this.priority, status);
      return returnValue;
   }


}
