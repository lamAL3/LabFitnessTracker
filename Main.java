import java.util.Scanner;

class Workout {
    String type;
    int duration;

    void showWorkout() {
        System.out.println("--- Workout Summary ---");
        System.out.println("Workout Type: " + type);
        System.out.println("Duration (minutes): " + duration);
    }
}
class RunningWorkout extends Workout{
    double distance;
    void showDetails() {
        showWorkout();
        System.out.println("Distance (km): " + distance);
        System.out.println("Calories burned: " + distance * 60);
    }
}

public class Main {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        RunningWorkout workout1 = new RunningWorkout();
        System.out.print("Enter workout type: ");
        workout1.type = input.nextLine();
        System.out.print("Enter workout duration: ");
        workout1.duration = input.nextInt();
        System.out.print("Enter workout distance: ");
        workout1.distance = input.nextDouble();
        workout1.showDetails();
    }
}