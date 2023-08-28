package yourturn6complete;
/**
 * @Rich Smith at ZenOfProgramming.com
 */
public class Start
{
   public static void main (String[] args) throws Exception
   {
      System.out.println("Instantiate a TaskList");
      TaskList t1 = new TaskList();
      System.out.println("Add 4 tasks to the TaskList:");
      t1.addTask(new Task("Study for Java", Priority.HIGH));
      t1.addTask(new Task("Study more for Java", Priority.HIGH));
      t1.addTask(new Task("Watch TV", Priority.LOW));
      t1.addTask(new Task("Practice Java", Priority.HIGH));

      System.out.println("Print out the subject of task 2");
      System.out.println(t1.getATask(2).getTaskSubject());

      System.out.println("Print out all of the Tasks in the TaskList");
      System.out.println(t1.getAllTasks());
      System.out.println("Mark task 3 as complete");
      t1.markTaskAsComplete(3);
      System.out.println("Print out task 3");
      System.out.println(t1.getATask(3));
      System.out.println("Print out all of the Tasks in the TaskList");
      System.out.println(t1.getAllTasks());

   }
}
