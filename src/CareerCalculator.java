import java.util.*;

public class CareerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CareerRecommender recommender = new CareerRecommender();

        System.out.println("===== Career Calculator =====");
        System.out.print("Enter your main skill: ");
        String skill = sc.nextLine();
        System.out.print("Enter your main interest: ");
        String interest = sc.nextLine();

        List<Career> careers = recommender.getCareerSuggestions(skill, interest);

        // Remove duplicate career names
        Set<String> careerNames = new LinkedHashSet<>();
        for (Career c : careers) {
            careerNames.add(c.getCareerName());
        }

        if (careerNames.isEmpty()) {
            System.out.println("No exact match found! Try different inputs.");
        } else {
            System.out.println("\nHere are some career suggestions based on your profile:");
            for (String name : careerNames) {
                System.out.println("- " + name);
            }
        }

        sc.close();
    }
}
