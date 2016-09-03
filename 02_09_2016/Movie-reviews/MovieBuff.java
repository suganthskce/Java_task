package hashMap;

public class MovieBuff {
	int count;
	double rating;
	
	public MovieBuff() {
		super();
		this.count = 0;
		this.rating = 0.0;
	}
	public MovieBuff(int count, double rating) {
		super();
		this.count = count;
		this.rating = rating;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "MovieBuff [count=" + count + ", rating=" + rating + "]";
	}
	
}
