package hotel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        hotel.addRoom(new StandardRoom(101));
        hotel.addRoom(new StandardRoom(102));
        hotel.addRoom(new DeluxeRoom(201));


        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Hotel Reservation System ---");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View All Bookings");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    hotel.viewAvailableRooms();
                    break;
                case 2:
                	sc.nextLine();
                    System.out.print("Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Room Type (Standard/Deluxe): ");
                    String type = sc.nextLine();

                    System.out.print("Number of days: ");
                    int days = sc.nextInt();

                    hotel.bookRoom(name, type, days);
                    break;

                case 3:
                    System.out.print("Booking ID: ");
                    hotel.cancelBooking(sc.nextInt());
                    break;
                case 4:
                    hotel.showBookings();
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
