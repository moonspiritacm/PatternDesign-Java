package com.moonspirit.design.pattern.creational.simplefactory.v2;

public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python视频课程");
    }
}