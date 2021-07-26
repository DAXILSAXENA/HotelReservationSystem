package com.bridgelabz.hotelreservationsystem;

import java.util.ArrayList;

public class HotelReservation {

	// UC-1
	public void addHotelDetails() {
		ArrayList<Hotel> hotelList = new ArrayList<>();

		hotelList.add(new Hotel("Lakewood", 110));
		hotelList.add(new Hotel("Bridgewood", 150));
		hotelList.add(new Hotel("Ridgewood", 220));
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Hotel Reservation System");
		HotelReservation hotelReservation = new HotelReservation();
		hotelReservation.addHotelDetails();
	}
}
