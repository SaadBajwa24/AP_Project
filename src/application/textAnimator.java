package application;

import java.util.Random;

public class textAnimator implements Runnable{

	private String text;
	private int animationTime;
	private TextOutput textOutput;
	private Random random=new Random();
	
	public textAnimator(String t,int time,TextOutput textO) {
		text=t;
		animationTime=time;
		textOutput=textO;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
			for(int i=0;i<=text.length();i++) {
				
				String textAtThisPoint=text.substring(0,i);
				textOutput.writeText(textAtThisPoint);
				try {
					Thread.sleep(animationTime+random.nextInt(150));
				} 
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
}
