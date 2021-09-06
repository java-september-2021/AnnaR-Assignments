
public class TestTrackListJava{
    public static void main(String[] args){
        TrackListJava ttl = new TrackListJava();

        /*----------------  displaySongList  ----------------*/
        ttl.displaySongList();


        //------------------- getTrackName() ---------------------
        /*---   First method call  --*/
        System.out.print("\n\n" + "Extracting the first artist request: ");
        String artistName = "Tauren Wells";
        String trackName =  ttl.getTrackName(artistName);

        if (trackName.equals(artistName)){
            System.out.println("Track name '" + trackName + "' was found." );
        }else {
            System.out.println("\n\n" + trackName);
        }

        /*---   Second method call  --*/
        System.out.print("" + "Extracting the second artist request:  ");
        artistName = "Some Song Name";
        trackName =  ttl.getTrackName(artistName);

        if (trackName.equals(artistName)){
            System.out.println(" The current track name is  "+ trackName );
        }else {
            System.out.println( trackName);
        }

    }//main
}//class

