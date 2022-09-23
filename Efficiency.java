import java.util.Scanner;

public class Efficiency {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[]args) {
        String userReply;

        do {
            getValues();
            System.out.println("\n Would you like to do this again? (Y/N)");
            userReply = keyboard.next().toUpperCase();
        } while (userReply.startsWith("Y"));
    }

    private static void getValues() {
        double oldCar, newCar, converted, mostEfficient;
        converted = 0;
        mostEfficient = 0;
        String answer = "";
        System.out.print("Enter the Efficiency of the old car: ");
        oldCar = keyboard.nextFloat();
        System.out.print("Enter the Efficiency of the new car: ");
        newCar = keyboard.nextFloat();
        answer = convertion(oldCar, newCar, converted, mostEfficient);
        System.out.println("The most efficient is " + answer + " liters per 100 km");
    }

    private static String convertion(double oldCar, double newCar, double converted, double mostEfficient){
        String answer = "";
        converted = 235.21/oldCar;
        if (converted > newCar){
            mostEfficient = converted;
            answer += "The old car with " + String.format("%.2f", mostEfficient);
        } else if(converted < newCar) {
            mostEfficient = newCar;
            answer += "The new car with " + String.format("%.2f", mostEfficient);
        } else {
            mostEfficient = converted;
            answer += "Both the old car and the new car have the same efficiency of" + String.format("%.2f", mostEfficient);
        }
        return answer;
    }
}

