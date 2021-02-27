public class Rect {
    //判断点(x,y)是否在矩形(rx,ry,,rx+width,ry+height)内部  rx,ry矩形的x,y   矩形宽高
    public static boolean isInterRect(int x,int y,int rx,int ry,int width,int height){
        return x>rx&&y>ry &&x<width+rx&&y<height+ry ;
    }

    //求点(x,y)在deg角度的方向延伸distance像素,到达的点的位置




    //判断两矩形是否相交,参数是两矩形的左上角顶点和高宽(这里的矩形不会旋转),Math.abs返回绝对值
    public static boolean isInterRect(int x,int y,int w,int h,int cx,int cy,int cw,int ch){
        return(Math.abs(x-cx)<(w+cw)/2)||(Math.abs(y-cy)<(h+ch)/2);
    }

}


