import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Load {
    public static Image image(String path){
        try{
            BufferedImage img= ImageIO.read(Load.class.getResource("/resources/img/"+path));
            return img;
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
