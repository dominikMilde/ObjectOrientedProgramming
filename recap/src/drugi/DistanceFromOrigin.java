/**
 * 
 */
package drugi;

import java.util.function.Function;

import prvi.Ntuple;

public class DistanceFromOrigin implements Function<Pair<? extends Number>, Double>{
	public Double apply(Pair<? extends Number> t) {
		Double distance = Math.sqrt(Math.pow((double) t.getX(), 2) + Math.pow((double) t.getY(), 2));
		return distance;
	}
}
