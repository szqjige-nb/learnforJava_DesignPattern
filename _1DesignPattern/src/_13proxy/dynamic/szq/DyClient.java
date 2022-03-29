package _13proxy.dynamic.szq;

/***
 *@ClassName DyClient
 *@Description 动态代理调用端
 *@Author szq
 *@Date 2022/3/29 22:55
 *@Version 1.0
 **/
public class DyClient {
    public static void main(String[] args) {
        ITeacher iTeacher = new Teacher();

        // 代理对象创建
        ITeacher proxyObj = (ITeacher) new ProxyFactory(iTeacher).getProxyInstance();
        proxyObj.teach();
        System.out.println(proxyObj.getClass());

    }
}
