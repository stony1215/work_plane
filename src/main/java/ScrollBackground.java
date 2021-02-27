import resources.Animation;

import java.awt.*;

/**
 * 一个可以滚动的动画背景
 */
public class ScrollBackground implements Animation {
    //背景图片
    Image[] background=null;
    //当前 X轴 位置
    public int x=0,speed=1;
    public ScrollBackground(Image image){
        //当前设置了两个关卡,对应两个背景图片
        background=new Image[]{Load.image("background-1.jpg"),Load.image("background-2.jpg")};
    }
    public void show(Graphics g){
        //绘制第一张图片
        g.drawImage(background[0],0,x,null);
        //在第一张图片上方再次绘制
        g.drawImage(background[0],0,x-Data.HEIGHT,null);
        //更新图片在X轴上的位置
        x=x>=Data.HEIGHT?0:x+speed;
        //查看速度是不是为1,如果不是,说明现在正在等待切换背景,此时加速
        speed=speed==1?1:speed%70+1;
        //speed的加速效果只持续一回合
        if(x==0)speed=1;
    }

    @Override
    public boolean isEnd() {
        return false;
    }

    @Override
    public void setAnimation(Object animation) {
        //切换背景
        Image img=background[0];
        background[0]=background[1];
        background[1]=img;
    }
}
