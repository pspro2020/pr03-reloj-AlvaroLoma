package reloj;

import java.util.Date;

public class Reloj implements Runnable {

	@Override
	public void run() {
		Date hora= new Date();
		try {
			while(!Thread.currentThread().isInterrupted()) {
				hora= new Date();
				System.out.println(hora.toString().substring(11, 19));
				Thread.sleep(1000);
				
			}
		} catch (InterruptedException e) {
				return;
		}
		
	}

}
