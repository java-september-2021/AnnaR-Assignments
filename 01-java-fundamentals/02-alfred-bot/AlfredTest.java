public class AlfredTest{

    public static void main(String[] args){
   // System.out.println("this is a test");

    AlfredQuotes alfredBot = new AlfredQuotes();

    String testGreeting = alfredBot.basicGreeting();
    System.out.println(testGreeting);

    String testGuestGreeting = alfredBot.guestGreeting("Beth Kane", "Evening");
    System.out.println(testGuestGreeting);

    String testDateAnnouncement = alfredBot.dateAnnouncement();
    System.out.println(testDateAnnouncement);


    String alexisTest  = alfredBot.respondBeforeAlexis("Alexis! Play some low-fi beats.");
    String alexisTest2 = alfredBot.respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is.");
    String notRelevantTest = alfredBot.respondBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing..");
    
    System.out.println(alexisTest);
    System.out.println(alexisTest2);
    System.out.println(notRelevantTest);

}//main


}//class

