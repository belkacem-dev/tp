package sevree;
import java.util.Scanner;
public class netflix {
        
        private boolean iskidprofile;
        private String[] watchhistory;
        private String[] watchlist;
        
        public void addToWatchlist(String show) {
                // Code to add a show to the watchlist
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the name of the show to add to the watchlist:");
                String showToAdd = scanner.nextLine();
                scanner.close();
                // Assuming watchlist is an array, we need to create a new array with an additional slot
                String[] newWatchlist = new String[watchlist.length + 1];
                for (int i = 0; i < watchlist.length; i++) {
                        newWatchlist[i] = watchlist[i];
                }
                newWatchlist[watchlist.length] = showToAdd;
                watchlist = newWatchlist;
        }
        public void playtitle (String title) {
                // Code to play a title
                System.out.println("Playing: " + title);
                this.watchhistory = new String[watchhistory.length + 1];
                this.watchhistory[watchhistory.length] = title;
        }
        public void toggleKidsMode() {
        this.iskidprofile = !this.iskidprofile;
        System.out.println("Kids mode is now: " + this.iskidprofile);
}
}
