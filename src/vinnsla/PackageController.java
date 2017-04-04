package vinnsla;



import java.util.ArrayList;
import java.util.Date;



public class PackageController {
	
	public ArrayList<Hotel> hotels;
	
	 HotelGroupMock hotelGroupMock;
	
	

	public PackageController(){

		hotels = new ArrayList<Hotel>();
		
		hotelGroupMock = new HotelGroupMock();
		
	}
	
	
	public  ArrayList<Hotel> searchByQuality(int i){
		
		ArrayList<Hotel> results = new ArrayList<Hotel>();
	
		results = hotelGroupMock.getHotelsByStars(i);
		hotels = hotelGroupMock.getHotelsByStars(i);
		
		
		return results;
		
	}
	
	public ArrayList<Hotel> searchByDate(Date a){
		
		ArrayList<Hotel> results = new ArrayList<Hotel>();
		
		results = hotelGroupMock.getHotelsByDate(a);
		hotels = hotelGroupMock.getHotelsByDate(a);
		
		return results;
	}
	
	public ArrayList<Hotel> searchByPriceRange(int low,int high){
		
		ArrayList<Hotel> results = new ArrayList<Hotel>();
		
		results = hotelGroupMock.getHotelsByPriceRange(low, high);
		hotels = hotelGroupMock.getHotelsByPriceRange(low, high);
		
		return results;
	}
	
	public ArrayList<Hotel> searchByLocation(String Location){
		
		ArrayList<Hotel> results = new ArrayList<Hotel>();
		
		results = hotelGroupMock.getHotelsByLocation(Location);
		hotels = hotelGroupMock.getHotelsByLocation(Location);
		
		return results;
	}
	
	public ArrayList<Hotel> searchBySize(int i){
		
		ArrayList<Hotel> results = new ArrayList<Hotel>();
		
		results = hotelGroupMock.getHotelsBySize(i);
		hotels = hotelGroupMock.getHotelsBySize(i);
		
		return results;
	}
	
	
	public static void main(String[] args){
		
	
		
	}
	
		
}
