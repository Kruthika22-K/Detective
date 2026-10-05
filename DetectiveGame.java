public class DetectiveGame {

    // Prints a line of '=' characters using a for loop
    static void printLine() {
        for (int i = 0; i < 33; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    // Prints the main investigation menu
    static void displayMenu() {
        System.out.println();
        printLine();
        System.out.println(" DETECTIVE INVESTIGATION");
        printLine();
        System.out.println("1. View Suspects");
        System.out.println("2. Investigate Suspect");
        System.out.println("3. Collect Clue");
        System.out.println("4. View Collected Clues");
        System.out.println("5. Accuse Suspect");
        System.out.println("6. Exit");
    }

    public static void main(String[] args) {

        // ----- Create the five Suspect objects and store them in an array -----
        Suspect s1 = new Suspect(1, "Alex", "Computer Lab", "Working on a project");
        Suspect s2 = new Suspect(2, "Maya", "Library", "Studying");
        Suspect s3 = new Suspect(3, "Rahul", "Staff Room", "Meeting a faculty member");
        Suspect s4 = new Suspect(4, "Sara", "Canteen", "Having lunch");
        Suspect s5 = new Suspect(5, "Arjun", "Department Office", "Collecting documents");

        Suspect[] suspects = {s1, s2, s3, s4, s5};

        // ----- Create objects of the other components -----
        ClueManager clueManager = new ClueManager();
        Investigation investigation = new Investigation();

        // ----- Predefined menu choices (no Scanner needed) -----
        // choices[i]    -> menu option selected at step i
        // inputValues[i] -> suspect ID / clue number used by that option
        //                   (0 = not required for that option)
        int[] choices     = {1, 2, 2, 4, 3, 3, 3, 3, 7, 4, 5, 5, 6};
        int[] inputValues = {0, 3, 9, 0, 1, 3, 3, 4, 0, 0, 2, 5, 0};

        System.out.println("The question paper has gone missing! Starting investigation...");

        int step = 0;

        // ----- Loop to repeat the investigation -----
        while (step < choices.length) {

            int choice = choices[step];
            int value = inputValues[step];
            step++;

            displayMenu();
            System.out.println("\nDetective selects option: " + choice);
            System.out.println();

            // ----- Menu selection using switch -----
            switch (choice) {

                case 1:
                    // View Suspects
                    Suspect.displayAllSuspects(suspects);
                    break;

                case 2:
                    // Investigate Suspect (predefined suspect ID)
                    System.out.println("Investigating suspect with ID: " + value);
                    investigation.investigateSuspect(suspects, value);
                    break;

                case 3:
                    // Collect Clue (predefined clue number)
                    clueManager.displayAvailableClues();
                    System.out.println("\nDetective tries to collect clue number: " + value);
                    clueManager.collectClue(value);
                    break;

                case 4:
                    // View Collected Clues
                    clueManager.displayCollectedClues();
                    break;

                case 5:
                    // Accuse Suspect (predefined suspect ID)
                    System.out.println("Detective accuses suspect with ID: " + value);
                    investigation.accuseSuspect(value);
                    break;

                case 6:
                    // Exit
                    System.out.println("Exiting the investigation. Goodbye, Detective!");
                    return;

                default:
                    // Invalid menu option: skip to the next step
                    System.out.println("Invalid option! Please choose between 1 and 6.");
                    continue;
            }
        }

        System.out.println("\nInvestigation ended.");
    }
}