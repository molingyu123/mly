package com.lingyun.test;

/**
 *  系统内存jvm 测试
 */
public class MainSystemTest {

    public static void main(String[] args) {

        System.out.println("系统最大空间");
        System.out.println("xmx="+Runtime.getRuntime().maxMemory()/1024/1024+"M");

        System.out.println("系统空闲空间");
        System.out.println("free mem="+Runtime.getRuntime().freeMemory()/1024/1024+"M");

        System.out.println("当前可用的总空间");
        System.out.println("total mem=" + Runtime.getRuntime().totalMemory() / 1024 / 1024 + "M");
    }
}
