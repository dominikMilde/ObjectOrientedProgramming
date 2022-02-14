/**
 * 
 */
package drugi;

import java.util.function.Predicate;

/**
 * @author Dominik
 *
 */
public class QuadrantPredicate implements Predicate<Pair<? extends Number>>{
	boolean[] quadrants;
	public QuadrantPredicate(boolean q1, boolean q2, boolean q3, boolean q4) {
		quadrants = new boolean[4];
		quadrants[0] = q1;
		quadrants[1] = q2;
		quadrants[2] = q3;
		quadrants[3] = q4;
	}
	public boolean test(Pair<? extends Number> t) {
		if(quadrants[0] && t.getX().doubleValue() > 0 && t.getY().doubleValue() > 0) return true;
		if(quadrants[1] && t.getX().doubleValue() < 0 && t.getY().doubleValue() > 0) return true;
		if(quadrants[2] && t.getX().doubleValue() < 0 && t.getY().doubleValue() < 0) return true;
		if(quadrants[3] && t.getX().doubleValue() > 0 && t.getY().doubleValue() < 0) return true;
		return false;
	}
}
