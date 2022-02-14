/**
 * 
 */
package cetvrti;

import java.util.Comparator;

import drugi.DistanceFromOrigin;
import drugi.Point;

/**
 * @author Dominik
 *
 */
public class PointComparator implements Comparator<Point>{
	public int compare(Point p1, Point p2) {
		DistanceFromOrigin distance = new DistanceFromOrigin();
		Double r1 = distance.apply(p1);
		Double r2 = distance.apply(p2);
		
		if(Math.abs(r1-r2) < Math.pow(10, -8)) {
			return 0;
		}
		
		return r1<r2 ? -1 : 1;
 	}

}
