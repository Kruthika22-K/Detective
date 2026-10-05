public class Suspect {

    // Data members
    int suspectId;
    String name;
    String location;
    String alibi;

    // Constructor
    public Suspect(int suspectId, String name, String location, String alibi) {
        this.suspectId = suspectId;
        this.name = name;
        this.location = location;
        this.alibi = alibi;
    }

    // Method to display one suspect
    public void displaySuspect() {
        System.out.println("Suspect ID: " + suspectId);
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Alibi: " + alibi);
        System.out.println("---------------------------");
    }

    // Method to display all suspects
    public static void displayAllSuspects(Suspect[] suspects) {
        System.out.println("===== ALL SUSPECTS =====");

        for (Suspect suspect : suspects) {
            suspect.displaySuspect();
        }
    }

    // Method to get suspect by ID
    public static Suspect getSuspectById(Suspect[] suspects, int id) {
        for (Suspect suspect : suspects) {
            if (suspect.suspectId == id) {
                return suspect;
            }
        }

        return null;
    }

    // Main method for testing Student 1's code
    public static void main(String[] args) {

        // Creating five Suspect objects
        Suspect s1 = new Suspect(
                1, "Alex", "Computer Lab",
                "Working on a project"
        );

        Suspect s2 = new Suspect(
                2, "Maya", "Library",
                "Studying"
        );

        Suspect s3 = new Suspect(
                3, "Rahul", "Staff Room",
                "Meeting a faculty member"
        );

        Suspect s4 = new Suspect(
                4, "Sara", "Canteen",
                "Having lunch"
        );

        Suspect s5 = new Suspect(
                5, "Arjun", "Department Office",
                "Collecting documents"
        );

        // Storing objects in an array
        Suspect[] suspects = {s1, s2, s3, s4, s5};

        // Display all suspects
        displayAllSuspects(suspects);

        // Testing search by ID
        System.out.println("===== SEARCH RESULT =====");

        Suspect result = getSuspectById(suspects, 3);

        if (result != null) {
            result.displaySuspect();
        } else {
            System.out.println("Suspect not found.");
        }
    }
}