package resources;

import java.awt.*;

public interface Animation<T> {
    //显示绘制子集
    void show(Graphics g);
    //动画是否借宿
    boolean isEnd();
    //设置动画
    void setAnimation(T animation);
}
