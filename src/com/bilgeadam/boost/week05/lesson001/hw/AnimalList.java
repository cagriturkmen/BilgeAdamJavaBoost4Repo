package com.bilgeadam.boost.week05.lesson001.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnimalList {

	public static void main(String[] args) {
		//initalize list
		List<String> animals = new ArrayList<>();
		
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Pig");
		animals.add("Giraffe");
		animals.add("Elephant");
		animals.add("Penguin");
		animals.add("Monkey");
		animals.add("Orca");
		animals.add("Whale");
		animals.add("Bear");
		
		System.out.println(animals);
		
		//3. hayvana ulaş. Konsola yazdır.
		String animal = animals.get(2);
		System.out.println(animal);
		
		//5. hayvanı listeden çıkar. Çıkarılan hayvanı konsola yazdır.
		String animal2 = animals.remove(4);
		System.out.println(animal2);
		System.out.println(animals);
		
		//6. Hayvanın değerini değiştir. 
		animals.set(5, "Platypus");
		System.out.println(animals);
		
		//For-each döngüsü kullanarak bütün hayvanları konsola yazdır
		for (String animal3 : animals) {
			System.out.println(animal3);
		}
		//Listenin boyutunu bulmak için gerekli methodu bul
		//Liste boyutunu konsola yazdır.​​
		System.out.println(animals.size());
		
		
		//-Listenin dolu mu boş mu olduğunu kontrol eden method.
		System.out.println(animals.isEmpty());
		
		//-Listede "Dog" var mı kontrol et.		
		System.out.println(animals.contains("Dog"));
		
		//Listede "Dog" kaçıncı indexte? Konsola yazdır.
		System.out.println(animals.indexOf("Orca"));
		
		//-Listenin 2. elemanını "Giraffe" ile değiştir.​
		animals.set(1, "Giraffe"); 
	//	System.out.println(animals);
		
		//Listeden "Dog" elemanını çıkar.
		animals.remove("Dog");
	//	System.out.println(animals);
		
		//Listenin 3.den 7.ye kadar olan elemanlarıyla yeni bir liste oluştur.
		// subList kullandığınzda ilk indexi dahil ederken son indexe kadar alıyor.(Son indexi almıyor)
		List<String> newList = animals.subList(2, 6);
	//	System.out.println(newList);
		
		// -Listenin tersini al.
		Collections.reverse(animals);
	   	
	//	System.out.println(animals);
		
		//Listeyi alfabetik diz.
		Collections.sort(animals);
		System.out.println(animals);
		
		
		//-Listeyi alfabetik tersten diz.
		Collections.sort(animals,Collections.reverseOrder());		
	//	System.out.println(animals);
		
		//Listeyi boşalt
		animals.removeAll(animals);
		System.out.println(animals);
		
	}

}
