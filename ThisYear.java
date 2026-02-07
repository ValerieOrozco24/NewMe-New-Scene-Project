import org.code.theater.*;
import org.code.media.*;

public class LastYear extends Scene {
// variables (insatnce and static)
private String[] pictures;
  private String[] captions = {"",
"Family TIme",
"Family Time",
                               
 };
  //construtor
  public LastYear(){
pictures = FileReader.toStringArray("data.txt");
  }
  public LastYear(String[] pictures){
    this.pictures = pictures;
  }
/**
  *top level drawScene method
  */
  public void drawScene(){
    drawTitleScreen();
    pause(2.0);
    drawImagesWithCaptions();
    drawEndScreen();
  }
//other methods
  public void drawTitleScreen(){
     drawImage(pictures[0], 0, 0, 400, 400, 0.0);
    
  }
  public void drawEndScreen(){
    drawImage(pictures[1], 0, 0, 400, 400, 0.0);
  }
  public void drawImagesWithCaptions(){
    setCaptionStyle();
    for(int i=2; i < pictures.length; i++){
      drawImage(pictures[i], 0, 0, 400, 400, 0.0);
      drawText(captions[i], 50, 350);
      pause(2.0);
  
      }
  }
  public void setCaptionStyle(){
    setTextHeight(35);
    setTextColor("white");
    setTextStyle(Font.SERIF, FontStyle.BOLD);
  }
}