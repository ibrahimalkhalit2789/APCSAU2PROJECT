import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[]args) {
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("  _____   _                      _       _                   _______                                       \n" +
                " |_   _| | |                    | |     (_)                 |__   __|                                      \n" +
                "   | |   | |__    _ __    __ _  | |__    _   _ __ ___          | |      ___    _   _   _ __    ___    __ _ \n" +
                "   | |   | '_ \\  | '__|  / _` | | '_ \\  | | | '_ ` _ \\         | |     / _ \\  | | | | | '__|  / _ \\  / _` |\n" +
                "  _| |_  | |_) | | |    | (_| | | | | | | | | | | | | |        | |    | (_) | | |_| | | |    |  __/ | (_| |\n" +
                " |_____| |_.__/  |_|     \\__,_| |_| |_| |_| |_| |_| |_|        |_|     \\___/   \\__,_| |_|     \\___|  \\__, |\n" +
                "                                                                                                      __/ |\n" +
                "                                                                                                     |___/ ");
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




        System.out.println("\nLINEAR EQUATION CALCULATOR");
        Scanner scan = new Scanner(System.in);

        System.out.println("\nEnter Coordinate 1 (x, y): ");
        String coordinatePair1 = scan.nextLine();
     //   System.out.println("Enter Coordinate 2: (x, y)");
     //   String coordinatePair2 = scan.nextLine();

        String x1 = coordinatePair1.substring(coordinatePair1.indexOf("(") + 1, coordinatePair1.indexOf(",") - 1);
        String y1 = coordinatePair1.substring(coordinatePair1.indexOf(",") + 1, coordinatePair1.indexOf(")") - 1);


        System.out.println(x1 + y1);
    }

}
