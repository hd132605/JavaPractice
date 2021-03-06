package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelonGenreChart {

	public static void main(String[] args) {
		List<Music> listBalad = new ArrayList<Music>();
		listBalad.add(new Music("내 첫사랑", "베리굿"));
		listBalad.add(new Music("또 다시 사랑", "임창정"));
		listBalad.add(new Music("부산에 가면", "박진영"));

		List<Music> listDance = new ArrayList<Music>();
		listDance.add(new Music("커피", "유재환, 김예림"));
		listDance.add(new Music("다 잘될거야", "쿨"));
		
		Map<String, List<Music>> map = new HashMap<String, List<Music>>();
		
		map.put("발라드", listBalad);
		map.put("댄스", listDance);
		
		printMap(map);
		
		System.out.println();
		System.out.println("----발라드 3위 곡 변경----");
		listBalad.set(2, new Music("지우고 지워도", "차수경"));
		map.replace("발라드", listBalad);
		printMap(map);
		
		System.out.println();
		System.out.println("----발라드 1위 곡 삭제----");
		listBalad.remove(0);
		map.replace("발라드", listBalad);
		printMap(map);
		
	}

	public static void printMap(Map<String, List<Music>> map) {
		for(String key : map.keySet()) {
			System.out.println("[" + key + "]");
			for(Music music : map.get(key)) {
				System.out.println(map.get(key).indexOf(music)+1 + "." + " " + music);
			}
		}
	}

}
