import java.util.*;
import java.util.Collections;
import java.util.concurrent.LinkedBlockingQueue;

public class TrackListJava {
    /*---------------------------------------------------*/
    /*----------------  displaySongList  ----------------*/
    public void displaySongList (){
        HashMap<String, String> songMap = getTrackList();        
        //Print the list
        System.out.println("\n" + "    Tracks    :     Lyrics  ");
        printCharLine("-", 35);
        for (String key : songMap.keySet()){
            System.out.println(songMap.get(key) + " : " +  key);
        }//for
    }//retrieveSongList


    //---------------------- getTrackName ------------------
    public String getTrackName(String name){
        HashMap<String, String> list = getTrackList();
        Collection<String> values = list.values();
        Set<String> track = list.keySet();
        String tempStrg = "not found";
        Object[] obj = values.toArray();

        //Search for current track name        
        for(int i = 0; i < values.size(); i++){
            if ( obj[i] == name )
                {
                tempStrg = (String)obj[i];
                break;
            }//if
        }//for

        if (tempStrg.equals("not found")){ tempStrg = "Track name '" + name + "' was not found."; }
        return tempStrg;

    }//getTrackName 


    //------------------- getTrackList() ---------------------  
    public HashMap<String, String> getTrackList(){
        HashMap<String, String> songMap = new HashMap<String, String>();

        //Build song list
        songMap.put("I'll Take You There", "The Staple Singers"); 
        songMap.put("Conpletely Yes", "Sandra Crouch"); 
        songMap.put("Unconditional", "Fred Hammond");
        songMap.put("Walk by Faith", "Jeremy Camp");        
        songMap.put("known", "Tauren Wells");
        songMap.put("In The Middle", "Isaac Carree");
        songMap.put("Yahweh", "Jokia");

        return songMap;
    }         
    
    //---------------- printCharLine ---------------------------
    public void printCharLine(String ch, int count){
        for (int i = 0; i < count; i++){       
            System.out.print(ch );
        }//for
        System.out.print("\n");
    }   
}//PuzzleJava