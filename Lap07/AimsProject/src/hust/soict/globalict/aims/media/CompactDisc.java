package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.Scanner;

public class CompactDisc extends Disc implements Playable{
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
	}
	
	public CompactDisc() {
		super();
	}
	
//	method
	
//	add track inputed(if not exist) by user, then inform to user
	public void addTrack(String trackName, double trackLength) {
		boolean check = false; //track found = true
		for(int i = 0; i < tracks.size(); i++) {
			if(tracks.get(i).getTrackName().equalsIgnoreCase(trackName)) {
				check = true;
				break;
			}
		}
		if(check == true) {
			System.out.println("The track already exists! Can not add!");
		}
		else {
			Track tmp = new Track(trackName, trackLength);
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
	public static void createNewItem() {
		Scanner sc = new Scanner(System.in);
		CompactDisc cd = new CompactDisc();
		System.out.println("--->Import a new CD: ");
		System.out.println("-Title: "); cd.title = sc.nextLine();
		System.out.println("-Category: "); cd.category = sc.nextLine();
		System.out.println("-Director: "); cd.director = sc.nextLine();
		System.out.println("-Cost: "); cd.cost = sc.nextFloat();
		System.out.println("-Artist: "); cd.setArtist(sc.nextLine());
		System.out.println("-Add tracks: ");
		
		Track tmp = new Track();
		System.out.println("--->Track name: "); tmp.setTrackName(sc.nextLine());
		System.out.println("--->Track length: "); tmp.setTrackLength(sc.nextDouble());
		cd.addTrack(tmp.getTrackName(), tmp.getTrackLength());
		
		Media.arrDB.add(cd);
		System.out.println("Item is added successfully!");
	};
}
