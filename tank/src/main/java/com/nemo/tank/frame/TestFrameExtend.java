package com.nemo.tank.frame;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrameExtend extends Frame {

    int x =200 ,y = 200;

    public TestFrameExtend(){
        setSize(800,600);
        setResizable(false); // 设置是否可以拖动改变大小
        setTitle("tank war");
        setVisible(true); // 设置可见

        addKeyListener(new MyKeyListener());

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("窗口关闭的时候.....");
                System.exit(0);
            }
        });
    }

    // 窗口重新绘制的时候 回调用此方法
    @Override
    public void paint(Graphics g) {
        g.fillRect(x,y,50,50);
        g.setColor(new Color(212, 203, 117));
        x += 10;
        y += 10;
        System.out.println("paint");
    }

    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("key pressed");
        }

        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("key typed" + e.getKeyCode());
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("key released");
        }
    }
}

