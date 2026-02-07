import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {

    String image = "canva-yellow-neutral-cute-playful-fun-trendy-thank-you-2025-year-recap-instagram-post-B2Ntw8NhnbU.jpg";
    //create scene objects
    LastYear lastYear = new LastYear();
    ThisYear thisYear = new ThisYear();

    //call top level methods
    lastYear.drawScene();
    thisYear.drawScene();

    //play scenes ( in order of arguments)
    Theater.playScenes(lastYear, thisYear);


    
    
  }
}