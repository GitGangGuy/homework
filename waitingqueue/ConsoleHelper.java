package waitingqueue; // I'll shut up about this...sometime

import java.io.Console;

// java doesnt have static classes so I have to use a weird combination of finals, static properties and a private constructor. I'm sold!
final class ConsoleHelper {
    static Console console;

    private ConsoleHelper() {
        console = System.console();
    }

    static void Write(String _txt) {
        System.out.println(_txt);
    }

    // Java still sucks, doesnt have optional parameters
    static String Read(String _prompt) {
        // Why can I use System.out.println for writing to console but not something
        // like System.in.readln for reading? java logic I guess
        return console.readLine(_prompt);
    }

    // So I have to write a very similar method again here (yay O_O); I should be
    // happy it at least supports overloads
    static String Read() {
        return console.readLine();
    }
}