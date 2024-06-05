import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();

        scores.put("SubhanNalla", 23);
        scores.put("Uzair", 90);
        scores.put("Aman", 70);

        System.out.println(scores);

        System.out.println("Aman's Score: "+ scores.get("Aman"));

        scores.remove("SubhanNalla");

        System.out.println("After Removal: "+scores);

        if(scores.containsKey("Uzair")){
            System.out.println("Uzair's Score Exists");
        }
        if(scores.containsValue(70)){
            System.out.println("The Score of 70 Exists");
        }

        System.out.println("The Size of HashMaps is "+ scores.size());

        scores.put("Sameer", 63);
        System.out.println("Updated HashMap: "+scores);

        for (String key : scores.keySet()) {
            System.out.println(key+"'s Value: "+ scores.get(key));
        }
        scores.clear();
        System.out.println("Condition of HashMap: "+scores);
    }
}
