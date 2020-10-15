package com.nemo.tank.frame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame {
    public static void main(String[] args) {
//        Frame f = new Frame();
//        f.setSize(800,600);
//        f.setResizable(false); // 设置是否可以拖动改变大小
//        f.setTitle("tank war");
//        f.setVisible(true); // 设置可见
//        f.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.out.println("窗口关闭的时候.....");
//                System.exit(0);
//            }
//        });
        TestFrameExtend f =new TestFrameExtend();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                f.repaint();
            }
        }).start();
    }
}
