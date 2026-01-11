import java.util.HashSet;
import java.util.Set;

public class StudentGroupsSets {
    
    public static void main(String[] args) {
        
        // 1. Create and populate two HashSets
        Set<String> groupA = new HashSet<>();
        Set<String> groupB = new HashSet<>();
        
        // Adding students to group A
        groupA.add("Oussama");
        groupA.add("Amina");
        groupA.add("Youssef");
        groupA.add("Fatima");
        groupA.add("Ibrahim");
        
        // Adding students to group B
        groupB.add("Youssef");
        groupB.add("Fatima");
        groupB.add("Khadija");
        groupB.add("Mehdi");
        groupB.add("Sara");
        groupB.add("Oussama");
        
        // Display initial groups
        System.out.println("=== Student Groups ===");
        System.out.println("Group A: " + groupA);
        System.out.println("Group B: " + groupB);
        System.out.println();
        
        // 2. Intersection (students in both groups)
        Set<String> intersection = new HashSet<>(groupA);
        intersection.retainAll(groupB);
        
        System.out.println("2. Students in BOTH groups (intersection):");
        if (intersection.isEmpty()) {
            System.out.println("   No common students.");
        } else {
            System.out.println("   " + intersection);
        }
        System.out.println();
        
        // 3. Union (all unique students from both groups)
        Set<String> union = new HashSet<>(groupA);
        union.addAll(groupB);
        
        System.out.println("3. All students from both groups (union):");
        System.out.println("   " + union);
        System.out.println("   Total unique students: " + union.size());
    }
}
