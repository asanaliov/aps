package tehniki;

import java.util.*;
import java.util.stream.Collectors;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        List<Integer> arrivalList = new ArrayList<>();
        List<Integer> departureList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            int arrival = Integer.parseInt(parts[0]);
            int departure = Integer.parseInt(parts[1]);
            arrivalList.add(arrival);
            departureList.add(departure);
        }

        Collections.sort(arrivalList);
        Collections.sort(departureList);

        int i = 0, j = 0;
        int platformsCount = 0, maxPlatforms = 0;

        while (i < n && j < n) {
            if (arrivalList.get(i) <= departureList.get(j)) {
                platformsCount++;
                i++;
                if (platformsCount > maxPlatforms) maxPlatforms = platformsCount;
            } else {
                platformsCount--;
                j++;
            }
        }
        System.out.println(maxPlatforms);

    }
}
