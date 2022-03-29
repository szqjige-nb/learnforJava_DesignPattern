package _13proxy.staticproxy.szq;

/***
 *@ClassName Teacher
 *@Description 老师（被代理对象）
 *@Author szq
 *@Date 2022/3/28 22:06
 *@Version 1.0
 **/
public class Teacher implements ITeacher{
    @Override
    public void teach() {
        System.out.printf("我是教书匠");
    }
}
