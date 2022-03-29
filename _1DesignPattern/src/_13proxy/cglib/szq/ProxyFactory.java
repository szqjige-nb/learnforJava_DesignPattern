package _13proxy.cglib.szq;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/***
 *@ClassName ProxyFactory
 *@Description Cglib--框架(动态代理)核心逻辑
 *@Author szq
 *@Date 2022/3/27 20:11
 *@Version 1.0
 **/
public class ProxyFactory implements MethodInterceptor {


    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }
    public Object getProxyInstance(){
        // 使用cglib 框架中的 Enhancer
        Enhancer enhancer = new Enhancer();
        // 设置父类
        enhancer.setSuperclass(target.getClass());
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建子类对象，即代理对象
        return enhancer.create();
    }
    /***
     * @Author szq
     * @Description 重新方法
     *@Date 2022/3/27 20:12
     * @Param
     * @return
     **/
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式 ~~ 开始");
        Object returnVal = method.invoke(target, args);
        System.out.println("Cglib代理模式 ~~ 提交");
        return returnVal;
    }
}
