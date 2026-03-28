package day8.case2;

import java.util.Objects;

public class Ticket {
	private int trainNo;
	private String seat;
	private int price;
	
	public Ticket(int trainNo, String seat, int price) {
		this.trainNo = trainNo;
		this.seat = seat;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return Objects.equals(seat, other.seat) && trainNo == other.trainNo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(seat, trainNo);
	}

	public int getTrainNo() {
		return trainNo;
	}
	public String getSeat() {
		return seat;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Ticket [trainNo=" + trainNo + ", seat=" + seat + ", price=" + price + "]";
	}
	
	
	
}
