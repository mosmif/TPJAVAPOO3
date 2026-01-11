import java.util.HashMap;
import java.util.Map;

public class StudentGradesMap {
    
    public static void main(String[] args) {
        // Create HashMap: key = student name, value = grade
        Map<String, Double> grades = new HashMap<>();
        
        System.out.println("=== Student Grades Management ===\n");
        
        // 1. Insert student grades
        grades.put("Oussama", 17.5);
        grades.put("Amina", 19.0);
        grades.put("Youssef", 14.75);
        grades.put("Fatima", 18.25);
        grades.put("Ibrahim", 16.0);
        
        System.out.println("1. Initial grades:");
        printGrades(grades);
        
        // 2 & 3. Increase a student's grade (two examples)
        increaseGrade(grades, "Youssef", 2.5);     // Youssef: 14.75 → 17.25
        increaseGrade(grades, "Oussama", 1.0);     // Oussama: 17.5 → 18.5
        
        // 4. Delete a student's grade
        deleteGrade(grades, "Ibrahim");
        
        // 5. Display size of the map
        System.out.println("\n5. Current number of students: " + grades.size());
        
        // 6. Display average, max and min grades
        showStatistics(grades);
        
        // 7. Check if there is a grade equal to 20
        checkPerfectScore(grades);
        
        // Final state
        System.out.println("\nFinal grades:");
        printGrades(grades);
    }
    
    // Helper method to print all grades using forEach + lambda
    private static void printGrades(Map<String, Double> grades) {
        if (grades.isEmpty()) {
            System.out.println("   No students in the system.");
            return;
        }
        
        grades.forEach((name, grade) -> 
            System.out.printf("   %-12s : %.2f%n", name, grade));
        System.out.println();
    }
    
    // Increase a student's grade
    private static void increaseGrade(Map<String, Double> grades, String name, double points) {
        if (grades.containsKey(name)) {
            double newGrade = grades.get(name) + points;
            // Optional: cap at 20
            if (newGrade > 20) newGrade = 20.0;
            
            grades.put(name, newGrade);
            System.out.printf("→ Increased %s's grade by %.1f → new grade: %.2f%n", 
                             name, points, newGrade);
        } else {
            System.out.println("→ Student '" + name + "' not found!");
        }
        printGrades(grades);
    }
    
    // Delete a student
    private static void deleteGrade(Map<String, Double> grades, String name) {
        if (grades.containsKey(name)) {
            Double removedGrade = grades.remove(name);
            System.out.printf("→ Removed %s (grade was %.2f)%n", name, removedGrade);
        } else {
            System.out.println("→ Student '" + name + "' not found!");
        }
        printGrades(grades);
    }
    
    // Show average, max and min
    private static void showStatistics(Map<String, Double> grades) {
        if (grades.isEmpty()) {
            System.out.println("No grades to calculate statistics.");
            return;
        }
        
        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        
        for (double grade : grades.values()) {
            sum += grade;
            if (grade > max) max = grade;
            if (grade < min) min = grade;
        }
        
        double average = sum / grades.size();
        
        System.out.printf("6. Statistics:%n");
        System.out.printf("   Average  : %.2f%n", average);
        System.out.printf("   Maximum  : %.2f%n", max);
        System.out.printf("   Minimum  : %.2f%n", min);
        System.out.println();
    }
    
    // Check if there's a perfect score (20)
    private static void checkPerfectScore(Map<String, Double> grades) {
        boolean hasTwenty = grades.containsValue(20.0);
        
        System.out.print("7. Is there a grade of 20.0? → ");
        if (hasTwenty) {
            System.out.println("YES!");
            // Bonus: show who got 20
            grades.forEach((name, grade) -> {
                if (grade == 20.0) {
                    System.out.println("   → Congratulations " + name + "!");
                }
            });
        } else {
            System.out.println("NO");
        }
        System.out.println();
    }
}
