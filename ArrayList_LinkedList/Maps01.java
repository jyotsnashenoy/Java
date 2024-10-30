import java.util.HashMap;
import java.util.Map;

public class Maps01 {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Abilash", 56);
        students.put("Bharath", 23);
        students.put("Chethan", 67);
        students.put("Darshan", 92);
        students.put("Esha", 45);

        System.out.println(students.keySet());

        for (String key : students.keySet()) {
            System.out.println(key + " : " + students.get(key));
        }
    }
}
