package vinnsla;
import java.util.Date;
public class DayTrip {

	private  Date Date;
	private String location;
	private static int price;
	private int size;
	

	public DayTrip(Date Date, String location, int price, int size) {
		this.Date = Date;
		this.location = location;
		this.price = price;
		this.size = size;
	
	}
	public Date getDate() {
		return Date;
	}
	public void setDate() {
		
	}
	public String getlocation() {
		return location;
	}
	public void setlocation(String a) {
		location = a;
	}
	public static int getprice() {
		return price;
	}
	public static void setprice(int b){
		price = b;
	}
	public int getsize() {
		return size;
	}
	public void setsize(int c){
		size = c;
	}
	public static void main(String[] args){
		int b = 3000;
		setprice(b);
		System.out.println(getprice());
		
		
	}
}
