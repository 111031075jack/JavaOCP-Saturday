package day4.movie;

// 定位
public class SeatOrder {

	// 物件屬性
	private Seat seat; // 預定位子
	private int qty; // 張數
	
	public SeatOrder(Seat seat, int qty) {
		this.seat = seat;
		this.qty = qty;
	}
	public Seat getSeat() {
		return seat;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public int getTotalPrice() {
		return seat.getPrice() * qty; // 座位價格 * 張數
	}
	
}
