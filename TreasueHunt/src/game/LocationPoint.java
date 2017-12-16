package game;

public class LocationPoint {
	private int xPoint;
	private int yPoint;
	
	public LocationPoint(int xPoint, int yPoint) {
		super();
		this.xPoint = xPoint;
		this.yPoint = yPoint;
	}

	public int getxPoint() {
		return xPoint;
	}



	public void setxPoint(int xPoint) {
		this.xPoint = xPoint;
	}



	public int getyPoint() {
		return yPoint;
	}



	public void setyPoint(int yPoint) {
		this.yPoint = yPoint;
	}



	public double distanceBetween(LocationPoint other)
	{
		double calculateDistance = Math.sqrt(Math.pow(this.xPoint - other.xPoint, 2) + Math.pow(this.yPoint - other.yPoint, 2));
		return calculateDistance;
	} 
	
	
}
