import java.util.ArrayList;
public class PlayList {
    public static void main(String[] args){
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Shape of you");
        songs.add("Believer");
        songs.add("Perfect");
        songs.add("Faded");
        songs.add("senorita");
        System.out.println("PlayList Songs : ");
        
        //For Each Loop
        for(String song : songs){
            System.out.println(song);
        }
        System.out.println("\n Total songs : " + songs.size());
        songs.remove("senorita");
        System.out.println("\n After removing senorita : ");
        for(String song : songs){
            System.out.println(song);
        }
        songs.add("Levitating");
        System.out.println("\n After adding Levitating :");
        for(String song : songs){
            System.out.println(song);
        }
    }
    
}
