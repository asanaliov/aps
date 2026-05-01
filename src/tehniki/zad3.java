package tehniki;

import java.util.*;

class Task implements Comparable<Task> {
    int duration;
    int earn;
    int hourlyEarn;

    public Task(int duration, int earn) {
        this.duration = duration;
        this.earn = earn;
        this.hourlyEarn = earn / duration;
    }

    @Override
    public int compareTo(Task other) {
        return other.hourlyEarn - this.hourlyEarn;
    }

    @Override
    public String toString() {
        return "duration=" + duration +
                ", earn=" + earn +
                ", hourlyEarn=" + hourlyEarn +
                '}' + '\n';
    }
}

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Task> taskList = new ArrayList<>();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int duration = scanner.nextInt();
            int earn = scanner.nextInt();

            taskList.add(new Task(duration, earn));
        }

        int hours = 40;
        taskList.sort(Task::compareTo);

        int maxEarned = 0;
        for (int i = 0; i < n; i++) {
            Task task = taskList.get(i);
            if (hours >= task.duration) {
                maxEarned += task.earn;
                hours = hours - task.duration;
            } else {
                maxEarned += task.hourlyEarn * hours;
                hours = 0;
            }
        }

        System.out.println(maxEarned);


    }
}
