package com.mycompany.composite;

import java.util.ArrayList;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList<>();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

    public void add(IComponent obj){
        playlist.add(obj);
    }

    @Override
    public String getName() {
        return playlistName;
    }

    @Override
    public void play() {
        System.out.println("Playing " + playlistName);
        for (IComponent obj : playlist) {
            obj.play();
        }
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        playlist.stream().forEach((obj)->{obj.setPlaybackSpeed(speed);});
    }

}
