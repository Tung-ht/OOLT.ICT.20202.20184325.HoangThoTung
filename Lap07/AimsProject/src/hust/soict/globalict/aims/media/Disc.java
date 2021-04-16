package hust.soict.globalict.aims.media;

public class Disc extends Media {
	protected double length;
	protected String director;
	
//	getter & setter
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	public void display() {
	};
}
