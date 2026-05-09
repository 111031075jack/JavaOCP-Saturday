package day13.ticket.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TicketSystem {

	private int tickets = 1; // 只有一張票
	
	// 建立高級智慧鎖
	private ReentrantLock lock = new ReentrantLock();
	
	// 使用 try-lock
	public void buy() throws InterruptedException{
		String threadName = Thread.currentThread().getName();
		
		// 嘗試取得鎖(不等待)
		// lock.tryLock() => true => 取得鎖
		// lock.tryLock() => false => 未取得鎖
		// lock.tryLock(2, TimeUnit.SECONDS) => 若沒拿到最多等兩秒 
		if(!lock.tryLock(0, TimeUnit.SECONDS)) {
			System.out.printf("%s 發現系統繁忙中, 請稍後再試...%n", threadName);
			return;
		}
		
		try {
			if(tickets <= 0) {
				System.out.printf("%s 沒看見票, 離開...%n", threadName);
				return;
			}	
			
			System.out.printf("%s 看見有 %d 張票, 準備購買...%n", threadName, tickets);
			
			// 研擬買票程序會花費的時間延遲
			Thread.sleep(100);
			
			// 買票
			tickets--;
			
			System.out.printf("%s 成功買到 1 張票!%n", threadName);
			
		} finally { // 保證會執行
			// 手動解鎖
			lock.unlock();
		}
		
	}
	
	
	// 不須使用 synchronized 
	/*
	public synchronized void buy() throws InterruptedException{
		String threadName = Thread.currentThread().getName();
		
		// 手動上鎖(等待)
		lock.lock();
		
		try {
			if(tickets <= 0) {
				System.out.printf("%s 沒看見票, 離開...%n", threadName);
				return;
			}	
			
			System.out.printf("%s 看見有 %d 張票, 準備購買...%n", threadName, tickets);
			
			// 研擬買票程序會花費的時間延遲
			Thread.sleep(100);
			
			// 買票
			tickets--;
			
			System.out.printf("%s 成功買到 1 張票!%n", threadName);
			
		} finally { // 保證會執行
			// 手動解鎖
			lock.unlock();
		}
		
	}
	*/
}
