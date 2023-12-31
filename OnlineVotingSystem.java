import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OnlineVotingSystem {

    private Map<String, Integer> votes;

    public OnlineVotingSystem() {
        this.votes = new HashMap<>();
        // Initialize party votes to 0
        votes.put("Party A", 0);
        votes.put("Party B", 0);
        votes.put("Party C", 0);
    }

    public void castVote(String party) {
        if (votes.containsKey(party)) {
            votes.put(party, votes.get(party) + 1);
        } else {
            System.out.println("Invalid party!");
        }
    }

    public void displayResults() {
        System.out.println("ONLINE VOTING SYSTEM");
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            System.out.println("Party " + entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }

    public static void main(String[] args) {
        OnlineVotingSystem votingSystem = new OnlineVotingSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ONLINE VOTING SYSTEM");
            System.out.println("Enter 'vote' to cast your vote, 'results' to check results, or 'exit' to exit:");
            String input = scanner.nextLine();

            if ("vote".equalsIgnoreCase(input)) {
                System.out.println("Enter your name:");
                String name = scanner.nextLine(); // Currently not used, but can be for further extension.
                System.out.println("Enter your phone number:");
                String phone = scanner.nextLine(); // Currently not used, but can be for further extension.

                System.out.println("CAST YOUR VOTE HERE");
                System.out.println("Party A\nParty B\nParty C");
                String party = scanner.nextLine();

                votingSystem.castVote(party);
                System.out.println("Thank you for voting!");
            } else if ("results".equalsIgnoreCase(input)) {
                votingSystem.displayResults();
            } else if ("exit".equalsIgnoreCase(input)) {
                System.out.println("Exiting Online Voting System...");
                break;
            }
        }

        scanner.close();
    }
}
