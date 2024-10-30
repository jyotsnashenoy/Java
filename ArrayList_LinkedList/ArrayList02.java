import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        // Collection<Integer> nums= new ArrayList<Integer>();
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);

        for (int n : nums) {
            System.out.println(n);
        }

        System.out.println("Element at Inedex-2 is " + nums.get(2));
        System.out.println("Element 2 is at Index-" + nums.indexOf(2));
        System.out.println("ArrayList size : " + nums.size());
        System.out.println("Add Element : " + nums.add(7));
        System.out.println("ArrayList : " + nums);
    }
}