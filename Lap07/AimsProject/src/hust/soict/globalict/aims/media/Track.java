package hust.soict.globalict.aims.media;

public class Track  implements Playable{
	private String trackName;
	private double trackLength;
	
//	getter setter
	public String getTrackName() {
		return trackName;
	}
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
	public double getTrackLength() {
		return trackLength;
	}
	public void setTrackLength(double trackLength) {
		this.trackLength = trackLength;
	}
	
//	constructor
	public Track(String trackName, double trackLength) {
		super();
		this.trackName = trackName;
		this.trackLength = trackLength;
	}
	public Track() {
		super();
	}
	
	@Override
	public void play() {
		System.out.println("Playing track: " + this.trackName);
		System.out.println("Track length: " + this.trackLength + " seconds");
	}
	
}
