import java.util.Scanner;

public class StudyTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("──────────── ⋆⋅☆⋅⋆ ────────────");
        System.out.println("     Welcome to Study Tracker >⩊<     ");
        System.out.println("──────────── ⋆⋅☆⋅⋆ ────────────");

        System.out.print("Enter total planned study hours for today: ");
        double planned = sc.nextDouble();

        if (planned <= 0) {
            System.out.println("Planned hours must be greater than 0");
            return;
        }

        System.out.println("\nEnter actual study hours for each subject:");

        System.out.print("╰┈➤ Physics: ");
        double physics = sc.nextDouble();

        System.out.print("╰┈➤ Chemistry: ");
        double chemistry = sc.nextDouble();

        System.out.print("╰┈➤ Maths: ");
        double maths = sc.nextDouble();

        System.out.print("╰┈➤ Biology: ");
        double biology = sc.nextDouble();

        double actual = physics + chemistry + maths + biology;

       double percentage = Math.min((actual / planned) * 100, 100);
     double remaining = Math.max(planned - actual, 0);
        double average = actual / 4;

        double max = physics;
        String strongest = "Physics";

        double min = physics;
        String weakest = "Physics";

        if (chemistry > max) {
            max = chemistry;
            strongest = "Chemistry";
        }
        if (maths > max) {
            max = maths;
            strongest = "Maths";
        }
        if (biology > max) {
            max = biology;
            strongest = "Biology";
        }

        if (chemistry < min) {
            min = chemistry;
            weakest = "Chemistry";
        }
        if (maths < min) {
            min = maths;
            weakest = "Maths";
        }
        if (biology < min) {
            min = biology;
            weakest = "Biology";
        }

        System.out.println("-------*:･ﾟ✧ Summary *:･ﾟ✧ ---------\n");
        System.out.println("Total Actual Hours: " + actual);
        System.out.println("Average Per Subject: " + average);
        System.out.println("Completion: " + percentage + "%");
        System.out.println("Remaining hours: " + remaining);
        System.out.println("Strongest Subject: " + strongest);
        System.out.println("Weakest Subject: " + weakest);
        System.out.println("------------------------------------");         
     
        if (physics < 1) System.out.println("Warning: Physics studied less than 1 hour");
        if (chemistry < 1) System.out.println("Warning: Chemistry studied less than 1 hour");
        if (maths < 1) System.out.println("Warning: Maths studied less than 1 hour");
        if (biology < 1) System.out.println("Warning: Biology studied less than 1 hour");

       
        if (percentage >= 100) {
            System.out.println("Excellent discipline!");
        } 
        else if (percentage >= 75) {
            System.out.println("Good job you can do better qt");
        } 
        else {
            System.out.println("Push harder tomorrow, improve 1% daily ");
        }


        sc.close();
    }
}