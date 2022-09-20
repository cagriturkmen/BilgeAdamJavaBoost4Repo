package com.bilgeadam.boost.week05.lesson002.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiSomeFeatures {

	public static void main(String[] args) {
		
		List<User> users = new ArrayList<>();
		
		users.add(new User(56,"Samet"));
		users.add(new User(2,"Ahmet"));
		users.add(new User(3,"Zehra"));
		users.add(new User(4,"Murat"));
		users.add(new User(5,"Yildiz"));
		users.add(new User(6,"Levent"));
		users.add(new User(7,"Elvan"));
		
//		for (User user : users) {
//			System.out.println(user);
//		}
		
//		users.stream().forEach(user -> System.out.println(user));
		
		//Birden fazla işlem yapmak istersem
		users.stream().forEach(user -> {
			System.out.println(user.getName());
			System.out.println(user.getId());
		});
		
		//Her bir user için tanımladığımız talk methodunu çağıralım.	
		//	users.stream().forEach(user -> user.talk());
		
		users.stream().forEach(User::talk); //method reference
		
		//User id'si 5ten büyük olan kaç kişi var?
		long count= users.stream().filter(user -> user.id>5).count();
		System.out.println(count);
		
		//Filtrelediğim elemanları listelemek istiyorum.
		
		List<User> filteredList = users.stream()
		.filter(user -> user.id>5)
		.collect(Collectors.toList());
		
		filteredList.stream().forEach(user -> user.talk());
		
		//Map user üzerinde değişiklik yapıp onları yeni birer elemana maplememizi sağlar.
		
		Set<User> mappedList =  users.stream()
		.map(user -> new User(user.getId(),user.getName()))
		.collect(Collectors.toSet());
		
		mappedList.stream().forEach(user -> user.talk());
		System.out.println(users);
		
		
		Map<Integer,String> userMap = users.stream()
		.collect(Collectors.toMap(user -> user.id, user -> user.name));
		
		userMap.forEach((key,value) -> System.out.println(key+" - "+ value));
		
	}

}
