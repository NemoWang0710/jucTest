package com.nemo;

/**
 * 不仅可以坚决线程安全,还可以防止反序列化
 *
 * 其他的方法都会通过反序列化的方式生成实体。
 *  枚举类为什么不能被反序列化，
 *  是因为枚举类么有构造方法
 */
public enum Mgr08 {
    INSTANCE;

    public void m (){}

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Mgr08.INSTANCE.hashCode());
            }).start();
        }
    }
}
