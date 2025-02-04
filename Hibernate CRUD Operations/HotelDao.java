package com.qsp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class HotelDao {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();

	public static void main(String[] args) {

//		insertHotelAndUser();

//		fetchHotelAndUser();

//		fetchAll();

//		updateHotelFromUser();

//		removeHotelFromUser();

	}

	public static void insertHotelAndUser() {
		User user = new User();
		user.setName("Ketan");

		Hotel hotel = new Hotel();
		hotel.setName("TAJ");

		List<User> userList = new ArrayList<User>();
		userList.add(user);

		List<Hotel> hoteList = new ArrayList<Hotel>();
		hoteList.add(hotel);

		hotel.setUsers(userList);
		user.setHotels(hoteList);

		et.begin();
		em.persist(user);
		et.commit();
	}

	public static void fetchHotelAndUser() {

		User user = em.find(User.class, 2);
		Hotel hotel = em.find(Hotel.class, 2);

		System.out.println("User: " + user.getName() + " " + "Uid: " + user.getId());
		System.out.println(".................................");
		System.out.println("Hotel: " + hotel.getName() + " " + "Hid: " + hotel.getId());

	}

	public static void fetchAll() {
		Query query = em.createQuery("select hotel from Hotel hotel");

		List<Hotel> hotels = query.getResultList();

		for (Hotel hotel : hotels) {

			System.out.println("........................");
			System.out.println(hotel.getId());
			System.out.println(hotel.getName());
			System.out.println("........................");

		}

		Query query2 = em.createQuery("select user from User user");

		List<User> users = query2.getResultList();

		for (User user : users) {

			System.out.println("........................");
			System.out.println(user.getId());
			System.out.println(user.getName());
			System.out.println("........................");
		}
	}

	public static void updateHotelFromUser() {
		User user = em.find(User.class, 2);
		Hotel hotel = em.find(Hotel.class, 2);

		hotel.setName("Nisarg");

		et.begin();
		em.merge(hotel);
		et.commit();

	}

	public static void removeHotelFromUser() {
		User user = em.find(User.class, 1);
		Hotel hotel = em.find(Hotel.class, 1);

		if (user != null && hotel != null) {

			List<Hotel> hotelList = user.getHotels();
			Iterator<Hotel> hotelIterator = hotelList.iterator();

			while (hotelIterator.hasNext()) {
				Hotel h = hotelIterator.next();
				if (h.getId() == hotel.getId()) {
					hotelIterator.remove();
					break;
				}
			}
			user.setHotels(hotelList);

			List<User> userList = hotel.getUsers();
			Iterator<User> userIterator = userList.iterator();

			while (userIterator.hasNext()) {
				User u = userIterator.next();
				if (u.getId() == user.getId()) {
					userIterator.remove();
					break;
				}
			}
			hotel.setUsers(userList);
		}

		et.begin();
		em.merge(user);
		et.commit();
	}
}
