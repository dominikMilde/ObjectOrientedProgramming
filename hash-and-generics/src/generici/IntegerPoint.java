/**
 * 
 */
package generici;

/**
 * @author Dominik
 *
 */
public class IntegerPoint {
	private Integer x, y;

	public IntegerPoint(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "IntegerPoint [x=" + x + ", y=" + y + "]";
	}
	
}
