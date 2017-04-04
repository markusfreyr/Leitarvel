package vinnsla;

import java.util.ArrayList;
import java.util.Date;

public class HotelGroupMock {
	
	ArrayList<Hotel> hotels;
		
	public HotelGroupMock() {
		
		
//		Bý til nokkur tilvik af Date
		Date date1 = new Date(2018,03,2018);
		Date date2 = new Date(2018,03,2018);
		Date date3 = new Date(2018,03,2018);
		Date date4 = new Date(2018,03,2018);
		Date date5 = new Date(2018,03,2018);
		Date date6 = new Date(2018,03,2018);
		Date date7 = new Date(2018,03,2018);
		Date date8 = new Date(2018,03,2018);
		Date date9 = new Date(2018,03,2018);
		
//		set date í arrays
		Date[] dates1 = {
				date1,date2,date6,date3
		};
		Date[] dates2 = {
				date9,date3,date7,date8
		};
		Date[] dates3 = {
				date2,date6,date4,date5
		};
		Date[] dates4 = {
				date3,date5,date8,date1
		};
		Date[] dates5 = {
				date4,date5,date6,date7
		};
		Date[] dates6 = {
				date1,date2,date4,date3
		};
		
//		bý til lista með hótelum í 
		hotels = new ArrayList<Hotel>();
		Hotel hotel = new Hotel(dates1, 1000, 2, "Reykjavík", 4);
		hotels.add(hotel);
		Hotel Skeet = new Hotel(dates2, 2000, 3, "Akureyri", 2);
		hotels.add(Skeet);
		Hotel Sindri = new Hotel(dates3, 10000, 4, "Egilstaðir", 4);
		hotels.add(Sindri);
		Hotel MaggiKewl = new Hotel(dates4, 13000, 5, "Reykjavík", 5);
		hotels.add(MaggiKewl);
		Hotel Bjö = new Hotel(dates5, 5000, 4, "Keflavík", 2);
		hotels.add(Bjö);
		Hotel Kea = new Hotel(dates6, 550, 1, "Akureyri", 2);
		hotels.add(Kea);
		
		
	}
//	Finnur hótel með ákveðnum stjörnum
	public ArrayList<Hotel> getHotelsByStars(int stars) {
		ArrayList<Hotel> results = new ArrayList<Hotel>();
		
		for (int i = 0; i < hotels.size(); i++) {
			
			if(hotels.get(i).getStars() == stars) {
				
				results.add(hotels.get(i));
			}
			
		}
		return results;
	}
	
//	Finnur hótel með staðsetningu
	public ArrayList<Hotel> getHotelsByLocation(String Location){
		ArrayList<Hotel> results = new ArrayList<Hotel>();
		
		for(int i = 0; i < hotels.size(); i++){
			
			if(hotels.get(i).getLocation().toLowerCase().contains(Location.toLowerCase())){
				
				results.add(hotels.get(i));
			}
			
		}
		return results;
		
	}
//	Finnur hótel með verði
	public ArrayList<Hotel> getHotelsByPriceRange(int low, int high){
		ArrayList<Hotel> results = new ArrayList<Hotel>();
		
		for(int i = 0; i < hotels.size(); i++){
			
			if(isBetween(low,high,hotels.get(i).getPrice())){
				
				results.add(hotels.get(i));
			}
		}
		
		return results;
	}
	
//	Finnur hótel eftir stærð
	public ArrayList<Hotel> getHotelsBySize(int Size){
		ArrayList<Hotel> results = new ArrayList<Hotel>();
		
		for(int i = 0; i < hotels.size(); i++){
			
			if(hotels.get(i).getSize() == Size){
				results.add(hotels.get(i));
			}
		}
		return results;
	}
	
//	Finnur hótel eftir dagsetningu
	public ArrayList<Hotel> getHotelsByDate(Date date){
		ArrayList<Hotel> results = new ArrayList<Hotel>();
		
		for(int i = 0; i < hotels.size(); i++){
			
			if(hotels.get(i).getDate()[i].compareTo(date) == 0){
				results.add(hotels.get(i));
			}
		}
		return results;
	}
	
//	Fall til að checka hvort talan c sé á milli a og b.
	public static boolean isBetween(int a, int b, int c) {
	    return b > a ? c > a && c < b : c > b && c < a;
	}
	

}
