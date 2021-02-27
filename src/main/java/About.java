import java.awt.*;

public class About implements Scenes {
    //背景图片
    Image background;
    //确定按钮
    Image[] buttonOK;
    //按钮状态
    int buttonOKStruts=0;

    public About(){
        background= Load.image("关于作者-背景.png");
        buttonOK= new Image[]{Load.image("确定.png"), Load.image("确定-鼠标移上.png"),
                Load.image("确定-鼠标按下.png")};
    }

    @Override
    public void onKeyDown(int keyCode) {

    }

    @Override
    public void onKeyUp(int keyCode) {

    }

    @Override
    public void onMouse(int x, int y, int struts) {

    }

    @Override
    public void draw(Graphics g) {

    }
}
