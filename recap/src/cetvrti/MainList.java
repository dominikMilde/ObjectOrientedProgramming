/**
 * 
 */
package cetvrti;

import java.util.*;

import drugi.Point;
//import prvi.Ntuple;

/**
 * @author Dominik
 *
 */
public class MainList {
	public static void main(String[] args) {
		List<Point> list = new ArrayList<>();
		list.add(new Point(-5, 12));
		list.add(new Point(3, -4));
		list.add(new Point(12, 9));
		list.add(new Point(3, 4));
		list.add(new Point(4, 3));
		list.add(new Point(-9, 12));
		list.add(new Point(-5, -12));		
				
				
		System.out.println("Original list:\n" + list);
		Comparator<Point> comp = new PointComparator();
		list.sort(comp);
		System.out.println("Sorted by distance:\n" + list);
		list.sort(Comparator.naturalOrder());
		System.out.println("Sorted by natural order:\n" + list);

	}
}
