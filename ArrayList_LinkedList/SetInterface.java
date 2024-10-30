import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();

        // nums.add(62);
        // nums.add(54);
        // nums.add(82);
        // nums.add(21);
        // nums.add(55);

        nums.add(2);
        nums.add(1);
        nums.add(4);
        nums.add(3);
        nums.add(1);
        nums.add(5);

        for (int n : nums) {
            System.out.print(n + " ");
        }

        System.out.println("\nSet : " + nums);
    }
}
