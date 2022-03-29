package _13proxy.dynamic.szq;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/***
 *@ClassName TeacherProxyFactory
 *@Description 代理工厂
 *@Author szq
 *@Date 2022/3/29 22:23
 *@Version 1.0
 **/
public class ProxyFactory {
    /***
     * 目标对象
     */
    private  Object target;

    /***
     * 构造函数
     */
    public ProxyFactory(Object target) {
        this.target = target;
    }

    public  Object getProxyInstance(){

        /***
         * new InvocationHandler()  事件处理，执行目标对象的方法时，会触发事件处理器方法, 会把当前执行的目标对象方法作为参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK代理开始~~");
                //反射机制调用目标对象的方法
                Object rtnObj = method.invoke(target, args);
                System.out.println("JDK代理提交");
                return rtnObj;
            }
        });
    }
}
