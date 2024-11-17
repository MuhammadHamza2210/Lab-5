
package tracker;
import java.util.ArrayList;
import java.util.Scanner;

public class TimeTrack {
    
    static class Task {
        String name;
        int startHour; 
        int endHour;   
        
        public Task(String name, int startHour, int endHour) {
            this.name = name;
            this.startHour = startHour;
            this.endHour = endHour;
        }
        
 
        public int calculateTimeSpent() {
            return endHour - startHour;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();
        int totalWeekTime = 0;
        
        
        System.out.println("Enter tasks for the week (enter -1 to stop):");
        while (true) {
            System.out.print("Enter task name (or -1 to stop): ");
            String name = scanner.nextLine();
            if (name.equals("-1")) break;
            
            System.out.print("Enter start time (in hours): ");
            int startHour = scanner.nextInt();
            System.out.print("Enter end time (in hours): ");
            int endHour = scanner.nextInt();
            scanner.nextLine(); 
            
            Task task = new Task(name, startHour, endHour);
            tasks.add(task);
            
            totalWeekTime += task.calculateTimeSpent();
        }
  
        System.out.println("Total time spent on all tasks this week: " + totalWeekTime + " hours.");
        if (totalWeekTime < 40) {
            System.out.println("Warning: You have spent less than 40 hours this week!");
        }
        
        scanner.close();
    }
}
