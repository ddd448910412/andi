package com.cn.andi.thread.a;

public class MyThread extends Thread {
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				int time=(int)(Math.random()*1000);
				Thread.sleep(time);
				System.out.println("run="+Thread.currentThread().getName());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
