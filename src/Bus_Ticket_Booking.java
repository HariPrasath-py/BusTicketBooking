import java.util.ArrayList;
import java.util.Scanner;

public class Bus_Ticket_Booking{
    public static void main(String [] args){
        ArrayList<BusInfo> busses = new ArrayList<BusInfo>();
		ArrayList<costumerInfo> booking = new ArrayList<costumerInfo>();
		
		busses.add(new BusInfo(1,true,0));
		busses.add(new BusInfo(2,false,0));
		busses.add(new BusInfo(3,true,1));
		
		int userOption = 1;
		Scanner in = new Scanner(System.in);
		
		for(BusInfo b:busses) {
			b.displayinfo();
		}
		while(userOption ==1) {
			System.out.println("Enter 1 to booking or 2 to Exit");
			userOption = in.nextInt();
			if(userOption == 1) {
				//System.out.println("Status-> Booking...");
				costumerInfo book = new costumerInfo();
				if(book.isAvailable(booking, busses)) {
					booking.add(book);
					System.out.println("your booking is conformed");
    }
    else{
        System.out.println("Sorry.., Bus is full try another bus or date");
    }
            }}}}