package day13.ticket.lock;

public class Main {

	public static void main(String[] args) {
		
		TicketSystem ticketSystem = new TicketSystem();
		
		Thread t1 = new Thread(new Buyer(ticketSystem), "小明");
		Thread t2 = new Thread(new Buyer(ticketSystem), "小華");
		Thread t3 = new Thread(new Buyer(ticketSystem), "小白");
		
		t1.start();
//		try {
//			Thread.sleep(50);
//		} catch (InterruptedException e) {
//			
//		}
		
		t2.start();
		t3.start();
		
		
	}
	
}
