package reloj;

public class Main {

	public static void main(String[] args) {
		Thread hilo=new Thread(new Reloj());
		
		
		try {
			hilo.start();
			Thread.sleep(12000);
			hilo.interrupt();
			System.out.println("El hilo secundario ya ha terminado de ejecutarse");
		} catch (InterruptedException e) {
			
		}
		
		

	}

}
