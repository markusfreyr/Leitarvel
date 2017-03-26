package vinnsla;
import java.util.Date;
public class Hotel {

	private Date Date;
	private int price;
	private int stars;
	private String location;
	private int size;
	
	public Hotel(Date Date, int price, int stars, String location, int size){
		this.Date=Date;
		this.price=price;
		this.stars=stars;
		this.location=location;
		this.size=size;
		
		
	}
	
	public Date getDate(){
		return Date;
	}
	public void setDate(){
		
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int a){
		price=a;
	}
	public int getStars(){
		return stars;
	}
	public void setStars(int b){
		stars=b;
	}
	public String getLocation(){
		return location;
	}
	public void setLocation(String a){
		location=a;
	}
	public int getSize(){
		return size;
	}
	public void setSize(int c){
		size=c;
	}
}
