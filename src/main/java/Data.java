import resources.Animation;

import java.awt.*;

public class Data {
    //窗口的宽度,高度,游戏的刷新速度
    public static final int WIDTH=500, HEIGHT=780,FPS=60;
    //显示游戏画面的面板
    public static Canvas canvas;
    //这个是标题栏的高度,即最大化最小化所在的标题栏的高度
    public static int TITLE_BOX_HEIGHT;
    //游戏背景 Animation 的泛型
    public static Animation background;
    //我方飞机子弹 飞机
    public static Image[] playerBulletImage,playerAircraftImage,playerDeathImage;
    //敌方飞机 敌方飞机子弹
    public static Image[][] enemyBulletImages,enemyAircraftImages,enemyDeathImages;
    //Boss飞机 boss飞机子弹
    public static Image[][] bossBulletImages,bossAircraftImages,bossDeathImages;
    //提示图片
    public static Image tips;
    //Boss血条
    public static Image hpBox;
    //Buff
    public static Image[][] buff;
    //玩家的生命数,玩家的移动速度
    public static final int LIFE=3,SPEED=8;
    //玩家的位置
    public static int x,y;

    //初始化
    public static void init(){

        //滚动背景
        Data.background=new ScrollBackground(null);
        //加载我方飞机图片
        playerAircraftImage=new Image[]{
                Load.image("我方飞机1.png"),Load.image("我方飞机2.png"),Load.image("我方飞机3.png")
        };
        //加载我方飞机子弹图片
        playerBulletImage=new Image[]{
                Load.image("子弹1.png"),Load.image("子弹1-击中效果1.png"),Load.image("子弹1-击中效果2.png")
        };
    }
}

















