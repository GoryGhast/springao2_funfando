package org.andgomes.controller;

import java.util.ArrayList;

public class mainzao {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> listao = new ArrayList<Integer>();
		
		listao.add(3);
		listao.add(5);
		listao.add(36);
		listao.add(3);
		
		for (Integer temp : listao) {
			System.out.println(temp);
		}
		
		for (int i = 0; i <= 4; i++) {
			System.out.println(listao.get(i));
		}
		
		
	}

}
