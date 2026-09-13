import java.util.HashMap;

public class Main {

    static HashMap<String, String> table = new HashMap<>();
    static {
        table.put("A-Dirty", "Suck");
        table.put("A-Clean", "Right");
        table.put("B-Dirty", "Suck");
        table.put("B-Clean", "Left");
    }
    static String tableDrivenAgent(String location, String status) {
        return table.get(location + "-" + status);
    }

    public static void main(String[] args) {

        String[][] percepts = {
            {"A", "Dirty"},
            {"A", "Clean"},
            {"B", "Dirty"},
            {"B", "Clean"}
        };
        for (String[] percept : percepts) {
            String action = tableDrivenAgent(percept[0], percept[1]);
            System.out.println("Percept = (" + percept[0] + ", " + percept[1] + ") -> Action = " + action);
        }
    }
}