package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		List <String> list = new ArrayList<String>();
		
		list.add("Marcio");
		list.add("Libério");
		list.add("Lívia");
		list.add("Alessandra");
		list.add("Warlen");
		
		System.out.println(list.size());
		for (String obj:list) {
			System.out.print(obj+" ");
		}
		
		System.out.println();
		System.out.println("----------------");
		list.add(2, "Karina");
		
		for (String obj:list) {
			System.out.print(obj+" ");
		}
		
		System.out.println();
		System.out.println("---------------");
		
		list.remove("Karina");
		for (String obj:list) {
			System.out.print(obj+" ");
		}
		System.out.println();
		System.out.println("-----------------");
		
		//list.removeIf(x -> x.charAt(1) == 'a');
		
		for (String obj:list) {
			System.out.print(obj+" ");
		}
		
		System.out.println();
		System.out.println("-----------------");
		
		System.out.println("IndexOf de Alessandra: "+ list.indexOf("Alessandra"));
		System.out.println();
		System.out.println("-----------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(1) == 'a').collect(Collectors.toList());
		for (String obj:result) {
			System.out.print(obj+" ");
		}
		System.out.println();
		System.out.println("-----------------");
		for (String obj:list) {
			System.out.print(obj+" ");
		}
		
		System.out.println();
		System.out.println("-----------------");
		
		list.remove("Libério");
		String name = list.stream().filter(x -> x.charAt(0) == 'R').findFirst().orElse("Não tem");
		System.out.println(name);

	}

}
