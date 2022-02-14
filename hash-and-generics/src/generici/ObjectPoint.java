/**
 * 
 */
package generici;

/**
 * @author Dominik
 *
 */
public class ObjectPoint {
	Object x, y;

	public ObjectPoint(Object x, Object y) {
		this.x = x;
		this.y = y;
	}

	public Object getX() {
		return x;
	}

	public void setX(Object x) {
		this.x = x;
	}

	public Object getY() {
		return y;
	}

	public void setY(Object y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "ObjectPoint [x=" + x + ", y=" + y + "]";
	}

}
