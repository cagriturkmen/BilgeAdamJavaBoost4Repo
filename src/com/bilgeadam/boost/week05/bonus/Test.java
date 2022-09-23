package com.bilgeadam.boost.week05.bonus;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		Doctor doctor = new Doctor("Doktor","Hamdi");
		Doctor doctor2 = new Doctor("Doktor2","Hamdi");
		Doctor doctor3 = new Doctor("Doktor3","Hamdi");
		doctor.setSalary(10000);

		Manager manger = new Manager("Manager", "Erşan");
		Manager manger2 = new Manager("Manager2", "Erşan");
		manger.setSalary(5000);
		
		
		Janitor janitor = new Janitor("Janitor", "Ahmet");
		Janitor janitor2 = new Janitor("Janitor2", "Ahmet");
		Janitor janitor3 = new Janitor("Janitor3", "Ahmet");

		Patient patient = new Patient("Patient","Çağrı" );
		Patient patient2 = new Patient("Patient2","Çağrı" );
		Patient patient3 = new Patient("Patient3","Çağrı" );
		Patient patient4 = new Patient("Patient4","Çağrı" );
		Patient patient5 = new Patient("Patient5","Çağrı" );

		List<Person> personList = new ArrayList<>();
		personList.add(patient5);
		personList.add(patient4);
		personList.add(patient3);
		personList.add(patient2);
		personList.add(patient);
		personList.add(manger);
		personList.add(manger2);
		personList.add(janitor3);
		personList.add(janitor2);
		personList.add(janitor);
		personList.add(doctor3);
		personList.add(doctor2);
		personList.add(doctor);
		
		
		//personList.stream().forEach(person -> System.out.println(person));
		
		//System.out.println(doctor.increaseSalary(doctor.getSalary())); ;
		
		List<Person> managerList = personList.stream()
		.filter(person -> person.getJob().equals(Occupation.MANAGER))
		.collect(Collectors.toList());
		
		
//		for (Person person2 : managerList) {
//			System.out.println(person2);
//		}
		
//		for (Person person2 : personList) {
//			if(person2.getJob().equals(Occupation.MANAGER)) {
//				personList.remove(person2);
//			}
//		}
		Iterator<Person> iterator = personList.iterator();			
		while(iterator.hasNext()) {
			if(iterator.next().getJob().equals(Occupation.MANAGER)) {
				iterator.remove();
			}
			
		}
		
		for (Person person2 : personList) {
			System.out.println(person2);
		}
	}

}
