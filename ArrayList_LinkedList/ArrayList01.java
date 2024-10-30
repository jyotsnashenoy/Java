import java.util.ArrayList;
import java.util.Collection;

class ArrayList01 {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        // List<Integer> nums = new ArrayList<Interger>();

        nums.add(6);
        nums.add(8);
        nums.add(5);
        nums.add(2);
        // nums.add("5");

        System.out.println(nums);

        for (int n : nums) {
            System.out.println(n);
        }
    }
}