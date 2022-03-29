package _1principle._5ocp.improve;

/***
 *@ClassName MyOcp
 *@Description 开闭原则
 *@Author szq
 *@Date 2021/9/5 10:53
 *@Version 1.0
 **/
public class MyOcp {
    public static void main(String[] args) {
        //使用看看存在的问题
        MyGraphicEditor graphicEditor = new MyGraphicEditor();
        graphicEditor.drawShape(new MyRectangle());
        graphicEditor.drawShape(new MyCircle());
        graphicEditor.drawShape(new MyTriangle());
        graphicEditor.drawShape(new MyOtherGraphic());
    }


}


//这是一个用于绘图的类 [使用方]
class MyGraphicEditor {
    //接收Shape对象，调用draw方法
    public void drawShape(MyShape s) {
        s.draw();
    }

}

//Shape类，基类
abstract class MyShape {
//	int m_type;

    public abstract void draw();//抽象方法
}

class MyRectangle extends MyShape {
//	Rectangle() {
//		super.m_type = 1;
//	}

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println(" 绘制矩形 ");
    }
}

class MyCircle extends MyShape {
    //	Circle() {
//		super.m_type = 2;
//	}
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println(" 绘制圆形 ");
    }
}

//新增画三角形
class MyTriangle extends MyShape {
    //	Triangle() {
//		super.m_type = 3;
//	}
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println(" 绘制三角形 ");
    }
}

//新增一个图形
class MyOtherGraphic extends MyShape {
//	OtherGraphic() {
//		super.m_type = 4;
//	}

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println(" 绘制其它图形 ");
    }
}
