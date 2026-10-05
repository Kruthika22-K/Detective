public class Investigation {

    // Actual culprit ID
    private int actualCulpritId = 5;

    // Method to investigate a suspect
    public void investigateSuspect(Suspect[] suspects, int suspectId) {

        Suspect suspect = Suspect.getSuspectById(suspects, suspectId);

        if (suspect != null) {
            System.out.println("===== INVESTIGATING SUSPECT =====");
            suspect.displaySuspect();
        } else {
            System.out.println("Suspect not found.");
        }
    }

    // Method to accuse a suspect
    public void accuseSuspect(int accusedId) {

        int attempts = 0;

        while (attempts < 3) {

            attempts++;

            System.out.println("===== ACCUSATION =====");
            System.out.println("Attempt: " + attempts);
            System.out.println("Accused Suspect ID: " + accusedId);

            if (accusedId == actualCulpritId) {

                System.out.println("CASE SOLVED!");
                System.out.println("You identified the culprit.");
                System.out.println("The missing question paper has been recovered.");

                return;

            } else {

                System.out.println("Incorrect accusation.");

                if (attempts == 3) {
                    break;
                }

                System.out.println("You have another attempt.");
            }
        }

        System.out.println("INVESTIGATION FAILED!");
        System.out.println("You have used all three attempts.");
        System.out.println("The culprit escaped.");
    }
}