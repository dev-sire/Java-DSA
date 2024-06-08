import java.util.List;
import java.util.Map;

public class SocialNetwork extends Graph {
    SocialNetwork(int v){
        super(v);
    }
    void addFriendship(String user1, String user2){
        addedges(user1, user2);
    }
    void displaySocialNetwork(){
        System.out.println("Social Network Connections: ");
        for(Map.Entry<String, List<String>> entry : adjList.entrySet()){
            String user = entry.getKey();
            List<String> friends = entry.getValue();
            System.out.println(user+ " is friends with "+friends);
        }
    }
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork(100);

        socialNetwork.addFriendship("Aman", "SubhanNalla");
        socialNetwork.addFriendship("SubhanNalla", "Uzair");
        socialNetwork.addFriendship("SubhanNalla", "Wajahat");
        socialNetwork.addFriendship("Aman", "Wajahat");
        socialNetwork.addFriendship("Wajahat", "Hammad");

        socialNetwork.displaySocialNetwork();
    }
}
