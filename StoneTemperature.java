//Write a Java program to store the temperature of a stone for 30 days using an array. Find and display:

//The highest temperature recorded during the 30 days.
//The lowest temperature recorded during the 30 days.
//The average temperature of the 30 days.
//The number of days on which the temperature was greater than 35°C.
public class StoneTemperature {

    public static void main(String[] args) {

        int[] temp = {
            30, 32, 35, 36, 38,
            40, 34, 33, 37, 39,
            31, 30, 35, 36, 38,
            41, 42, 34, 33, 37,
            39, 32, 31, 36, 38,
            40, 35, 34, 37, 39
        };

        int highest = temp[0];
        int lowest = temp[0];
        int sum = 0;
        int count = 0;

        for (int i = 0; i < temp.length; i++) {

            if (temp[i] > highest) {
                highest = temp[i];
            }

            if (temp[i] < lowest) {
                lowest = temp[i];
            }

            sum = sum + temp[i];

            if (temp[i] > 35) {
                count++;
            }
        }

        double average = (double) sum / temp.length;

        System.out.println("Highest Temperature : " + highest + "°C");
        System.out.println("Lowest Temperature  : " + lowest + "°C");
        System.out.println("Average Temperature : " + average + "°C");
        System.out.println("Days > 35°C         : " + count);
    }
}
