package com.nemo;

/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 *
 * 怎么保证线程安全呢，这个是由JVM帮我们保证是线程安全的，因为在JVM中一个类只会被加载一个
 *      因此Mgr07 只会被加载一次，Mgr07.Mgr07Holder 也只会被加载一次,Mgr07.Mgr07Holder.INSTANCE也只会被加载一次
 */
public class Mgr07 {

    private Mgr07(){}

    private static class Mgr07Holder{
        private final static Mgr07 INSTANCE = new Mgr07();
    }

    public static Mgr07 getInstance(){
        return Mgr07Holder.INSTANCE;
    }

    public void m () {
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100 ; i++) {
            new Thread( () -> {
                System.out.println(Mgr07.getInstance().hashCode());
            }).start();
        }
    }
}
