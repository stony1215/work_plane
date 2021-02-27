import java.awt.*;

public interface Scenes {
    //定义鼠标的按下,弹起,移动
    int MOUSE_DOWN=0,MOUSE_UP=1,MOUSE_MOVED=2;

    //监听键盘按下
    void onKeyDown(int keyCode);

    //监听键盘弹起
    void onKeyUp(int keyCode);

    //监听鼠标左键弹起
    void onMouse(int x,int y,int struts);

    //绘制自身
    void draw(Graphics g);
}
