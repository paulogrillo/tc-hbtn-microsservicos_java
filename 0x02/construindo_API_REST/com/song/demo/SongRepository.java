package com.song.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SongRepository {
	
    private List<Song> list = new ArrayList<Song>();
    
    
    public String mensagemBoasVindas(){
    	return "BEM VINDO!";
    }
    
    public List<Song> getAllSongs() {
     return list;
    }

    public Song getSongById(Integer id) {
        Song songId = list.stream()
        		.filter(s -> id.equals(s.getId()))
        		.findFirst()
        		.orElse(null);
        		
            return songId;
    }

    public void addSong(Song s) {
       list.add(s);
    }

    public void updateSong(Song s) {
        for(int i = 0; i < list.size(); i++) {
        	if(list.equals(s)) {
        		list.set(i, s);
        	}
        }
    }

    public void removeSong(Song s) {
    	//list.add(s);
		/*
		 * for(Song e : list) { System.out.println(e); if(e.getId().equals(s.getId())) {
		 * System.out.println("Excluindo!!");
		 * 
		 * list.remove(s); System.out.println(e); } }
		 */
    	
    	list.removeIf(x -> x.equals(s));
    }

}
