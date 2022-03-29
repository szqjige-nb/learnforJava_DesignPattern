package _13proxy.staticproxy.szq;

/***
 *@ClassName Client
 *@Description 访问端
 *@Author szq
 *@Date 2022/3/28 22:09
 *@Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        // 创建被代理对象
        Teacher teacher = new Teacher();
        // 创建代理对象
        TeacherProxy teacherProxy  =  new TeacherProxy(teacher);
        // 通过代理对象 ，调用被代理对象的方法 --》执行代理对象的方法，代理对象再去调用目标对象的方法
        teacherProxy.teach();
    }
}
