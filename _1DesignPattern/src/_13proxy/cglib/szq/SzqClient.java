package _13proxy.cglib.szq;

/***
 *@Description Cglib代理客户端
 *@Author szq
 *@Date 2022/3/28 13:15
 *@Version 1.0
 **/
public class SzqClient {
    public static void main(String[] args) {
        // 创建目标对象
        Teacher target = new Teacher();

        // 获取代理对象，并且将目标对象传递给代理对象
        Teacher proxObj=(Teacher) new  ProxyFactory(target).getProxyInstance();

        // 执行代理对象方法，出发intercept ，实现目标对象的调用
        proxObj.teach("音乐");

    }
}
