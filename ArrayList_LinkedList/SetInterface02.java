import java.util.Set;

public class SetInterface02 {
    public static void main(String[] args) {
        // Set<Integer> nums = new HashSet<Integer>();
        Set<Integer> nums = (Set<Integer>) new TreeSet< >();

        nums.add(62);
        nums.add(54);
        nums.add(82);
        nums.add(21);
        nums.add(55);

        for (int n : nums) {
            System.out.print(n + " ");
        }

        System.out.println("\nSet : " + nums);
    }
}
