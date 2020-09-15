
package waitingqueue; // worse than namespaces in every way (hell, even JS does this better)

import java.util.ArrayList;

public class Main { // no static classes make me sad. Who claimed that java was a well-typed
                    // language again?
    public static void main(String[] args) {
        ConsoleHelper.Write("==== Welcome to assignment #1 - Waiting queue ====");
        boolean hasExited = false;
        while (!hasExited) {
            CreateTaxi();
            ConsoleHelper.Write("==== Entering queue control ====");
            ConsoleHelper.Write("==== STUB ====");
            ConsoleHelper.Write("==== Exiting queue control ====");
            if (ConsoleHelper.Read("Quit? (Y/n) ") == "Y") {
                hasExited = true;
            }
        }
    }

    public static Taxi CreateTaxi() {
        ConsoleHelper.Write("==== Creating a new taxi ====");
        String input = "";
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();
        Passenger driver = new Passenger("DEFAULT");
        input = ConsoleHelper.Read("Enter passenger name #" + (passengers.size() + 1) + " or X to finish: ")
        while ((input) != "X" && input.strip() != "") {
            passengers.add(new Passenger(input.strip()));
        }
        while ((input = ConsoleHelper.Read("Enter driver name: ")).strip() != "") {
            driver = new Passenger(input.strip());
        }
        ConsoleHelper.Write("==== New taxi has been created ====");
        return new Taxi(driver, passengers.toArray(new Passenger[0]));
    }
}