package vinnsla;

import java.util.Date;

public class Package {

	private Hotel[] hotels;
	private Flight[] flights;
	private DayTrip[] dayTrip;


	public Package(Hotel[] hotels, Flight[] flights, DayTrip[] dayTrip){
		this.hotels=hotels;
		this.flights=flights;
		this.dayTrip=dayTrip;
	}
	
	public Hotel[] getHotels(){
		return hotels;
	}
	public void setHotels(Hotel[] a){
		hotels=a;
	}
	public Flight[] getflights(){
		return flights;
	}
	public void setFlights(Flight[] b){
		flights=b;
	}
	public DayTrip[] getDayTrip(){
		return dayTrip;
	}
	public void setHotels(DayTrip[] c){
		dayTrip=c;
	}
	
}
	