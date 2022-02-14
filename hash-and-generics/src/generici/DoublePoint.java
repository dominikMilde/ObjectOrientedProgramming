/**
 * 
 */
package generici;

/**
 * @author Dominik
 *
 */
public class DoublePoint {
	double x, y;

	public DoublePoint(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public Double getX() {
		return x;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "DoublePoint [x=" + x + ", y=" + y + "]";
	}

}
