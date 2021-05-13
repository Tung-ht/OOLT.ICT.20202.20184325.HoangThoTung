package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.Scanner;

public class CompactDisc extends Disc implements Playable, AdminAction{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
//	getter setter
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	
//	constructor
	public CompactDisc(String title, String category, String director, float cost, String artist) {
		super();
		this.director = director;
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.artist = artist;
		Media.arrDB.add(this);
		this.id = Media.arrDB.size();
	}
	
	public CompactDisc() {
		super();
	}
	
//	method
	
//	add track inputed(if not exist) by user, then inform to user
	public void addTrack(String trackName, double trackLength) {
		Track tmp = new Track(trackName, trackLength);
		boolean check = false; //track found = true
		for(int i = 0; i < tracks.size(); i++) {
			if(tracks.get(i).equals(tmp)) {
				check = true;
				break;
			}
		}
		if(check == true) {
			System.out.println("The track already exists! Can not add!");
		}
		else {
			tracks.add(tmp);
			System.out.println("Track is added successfully!");
		}
		return;
	}
	
//	remove track inputed(if exist) by user, then inform to user
	public void removeTrack(String trackName) {
		boolean check = false; //track found = true
		for(int i = 0; i < tracks.size(); i++) {
			if(tracks.get(i).getTrackName().equalsIgnoreCase(trackName)) {
				tracks.remove(i);
				System.out.println("Track is removed succesfully!");
				check = true;
			}
		}
		if(check == false) {
			System.out.println("The track does not exist! Can not remove!");
		}
		return;
	}
	
//	getLength : is sum of length of all tracks
	public double getLength() {
		double res = 0;
		for(int i = 0; i < tracks.size(); i++) {
			res += tracks.get(i).getTrackLength();
		}
		return res;
	}
	
	public void display() {
		System.out.printf("CD    - |%-20s| - |%-20s| - |%-15s| - |%-5.0f| - |%-7.2f$| - |%-10s| - |", title, category,
				director, length, cost, artist);
		for(int i = 0 ;i < tracks.size(); i++) {
			System.out.printf("%s, ", tracks.get(i).getTrackName());
		}
		System.out.println("|");
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		for(int i = 0; i < tracks.size(); i++) {
			System.out.printf("-----Track number %d-----", i);
			tracks.get(i).play();
		}
		return;
	}
//	String title, String category, String director, float cost, String artist
	public void createNewItem() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--->Import a new CD: ");
		System.out.println("-Title: "); this.title = sc.nextLine();
		System.out.println("-Category: "); this.category = sc.nextLine();
		System.out.println("-Director: "); this.director = sc.nextLine();
		System.out.println("-Cost: "); this.cost = sc.nextFloat(); sc.nextLine();
		System.out.println("-Artist: "); this.setArtist(sc.nextLine());
		System.out.println("-Add tracks: ");
		
		Track tmp = new Track();
		System.out.println("--->Track name: "); tmp.setTrackName(sc.nextLine());
		System.out.println("--->Track length: "); tmp.setTrackLength(sc.nextDouble()); sc.nextLine();
		this.addTrack(tmp.getTrackName(), tmp.getTrackLength());
		
		Media.arrDB.add(this);
		this.id = Media.arrDB.size();
		System.out.println("Item is added successfully!");
	};
}
