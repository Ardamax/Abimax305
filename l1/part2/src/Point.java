public class Point {
	private final double x;
	private final double y;
	public Point (double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}
	public double getAngle() {
		return Math.atan(y/x);
	}
	public Point rotate90() {
		if (x > 0)
			return  new Point(-y, x);
		return new Point(y, -x);
	}
	
}
