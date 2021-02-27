import javafx.scene.Scene;

import java.awt.*;

public class Home implements Scenes {

    //按钮的图片,数字的大小是三,包括了常规状态,鼠标悬浮,按下     游戏LOGO
    Image[] buttonBegin, buttonAbout, buttonSite, buttonRecord, buttonExit, LOGO;

    //status:0==常规,1==悬浮,2==按下
    int buttonBeginStatus=0, buttonAboutStatus=0,buttonSetStatus=0,
    buttonRecordStatus=0,buttonExitStatus=0;

    //绘制LOGO索引
    int logoIndex=0;

    public Home(){
        buttonBegin=new Image[3];
        buttonAbout=new Image[3];
        buttonSite=new Image[3];
        buttonRecord=new Image[3];
        buttonExit=new Image[3];
        LOGO=new Image[3];

        String[] paths={".png","-鼠标移上.png","-鼠标按下.png"};
        for(int i=0;i<3;i++){
            buttonBegin[i]=Load.image("开始游戏"+paths[i]);
            buttonAbout[i]=Load.image("关于作者"+paths[i]);
            buttonSite[i]=Load.image("游戏设定"+paths[i]);
            buttonRecord[i]=Load.image("历史排行"+paths[i]);
            buttonExit[i]=Load.image("结束游戏"+paths[i]);
            LOGO[i]=Load.image("LOGO"+i+".png");
        }


    }

    @Override
    public void onKeyDown(int keyCode) {

    }

    @Override
    public void onKeyUp(int keyCode) {

    }

    @Override

    public void onMouse(int x, int y, int struts) {
        int buttonStruts=struts==Scenes.MOUSE_MOVED?1:struts==Scenes.MOUSE_DOWN?2:0;
        //e.getY()获取的坐标包含了窗口标题栏的高度,判断点击位置时需要减去,如果监听鼠标事件时,监听对象是JPanel,则不需要此步骤,本程序监听的是JFrame
        //275+Data.TITLE_BOX_HEIGHT,这里因为移上原因,在画面上看到的位置,还需要加一个标题栏高度
        //这里判断的就是 鼠标点击的位置,是否在响应的按钮上方
        if(Rect.isInterRect(x,y,127,275+Data.TITLE_BOX_HEIGHT,265,58)){
            buttonBeginStatus=buttonStruts;
            if(struts==Scenes.MOUSE_DOWN) {Data.canvas.switchScenes("Game");}
        }else if(Rect.isInterRect(x,y,127,351+Data.TITLE_BOX_HEIGHT,265,58)){
            buttonAboutStatus=buttonStruts;
            if(struts==Scenes.MOUSE_DOWN){Data.canvas.switchScenes("About");}
        }else if(Rect.isInterRect(x,y,127,429+Data.TITLE_BOX_HEIGHT,265,58)){
            buttonSetStatus=buttonStruts;
            if(struts==Scenes.MOUSE_DOWN){Data.canvas.switchScenes("Site");}
        }else if(Rect.isInterRect(x,y,127,506+Data.TITLE_BOX_HEIGHT,265,58)){
            buttonRecordStatus=buttonStruts;
            if(struts== Scenes.MOUSE_DOWN){Data.canvas.switchScenes("Recording");}
        }else if(Rect.isInterRect(x,y,127,583+Data.TITLE_BOX_HEIGHT,265,58)){
            buttonRecordStatus=buttonStruts;
            if(struts== Scenes.MOUSE_DOWN){System.exit(0);}
        }
    }


    public void draw(Graphics g) {
        //绘制滚动的背景
        Data.background.show(g);
        //绘制界面元素
        g.drawImage(buttonBegin[buttonBeginStatus],120,275,null);
        g.drawImage(buttonAbout[buttonAboutStatus],120,351,null);
        g.drawImage(buttonSite[buttonSetStatus],120,429,null);
        g.drawImage(buttonRecord[buttonRecordStatus],120,506,null);
        g.drawImage(buttonExit[buttonExitStatus],120,583,null);
        //绘制LOGO
        g.drawImage(LOGO[logoIndex/30>2?2:logoIndex/30],20,65,null);
        //让播放logo时在第三帧停留一段时间
        logoIndex=logoIndex>=150?0:logoIndex+1;
    }
}



















