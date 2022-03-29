package _13proxy.staticproxy.szq;

/***
 *@ClassName TeacherProxy
 *@Description 代理者
 *@Author szq
 *@Date 2022/3/28 22:07
 *@Version 1.0
 **/
public class TeacherProxy implements ITeacher{
    private  ITeacher targer;

    /***
     * @Author szq
     * @Description 构造函数 传接口
     *@Date 2022/3/28 22:09
     * @Param 
     * @return 
     **/
    public TeacherProxy(ITeacher targer) {
        this.targer = targer;
    }

    @Override
    public void teach() {
        System.out.printf("代理对象开始");
        targer.teach();
        System.out.printf("代理对象提交");

    }
}
