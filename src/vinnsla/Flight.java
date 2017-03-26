package vinnsla;
import java.util.Date;
public class Flight {

	private Date Date;
	private static int price;
	private String locationTo;
	private String locationFrom;
	private int Size;
	
	public Flight(Date Date, int price, String locationTo, String locationFrom, int Size){
		this.Date=Date;
		this.price=price;
		this.locationTo=locationTo;
		this.locationFrom=locationFrom;
		this.Size=Size;
		
		
	}
	
	public Date getDate(){
		return Date;
	}
	public void setDate(){
		
	}
	public static int getPrice(){
		return price;
	}
	public static void setPrice(int a){
		price=a;
	}
	public String getLocationTo(){
		return locationTo;
	}
	public void setLocationTo(String a){
		locationTo=a;
	}
	public String getLocationFrom(){
		return locationFrom;
	}
	public void setLocationFrom(String b){
		locationFrom=b;
	}
	public int getSize(){
		return Size;
	}
	public void setSize(int b){
		Size=b;
	}
	public static void main(String[] args){
		
		setPrice(5);
		System.out.println(getPrice());
	}
}
