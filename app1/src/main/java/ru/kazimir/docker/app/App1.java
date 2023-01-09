package ru.kazimir.docker.app;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Date;

public class App1 {
    public static void main(String[] args) {
        System.out.println("Hello from docker demo APP1. Timestamp = " + (new Date(System.currentTimeMillis())));
        Intf inst = new Clazz();
        InvocationHandler ih = (obj, method, args1) -> {
            System.out.println("Invoked: " + method.getName());
            long timestamp = System.currentTimeMillis();
            System.out.println("Adding in proxy object");
            try {
                return method.invoke(inst, args1);
            } finally {
                System.out.println("invocation time = " + (System.currentTimeMillis() - timestamp) + " ms");
            }
        };
        Intf proxyClazz = (Intf) Proxy.newProxyInstance(
                inst.getClass().getClassLoader(),
                inst.getClass().getInterfaces(),
                ih);
        proxyClazz.doAction();
    }
}
