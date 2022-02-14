/**
 * 
 */
package drugi;

/**
 * @author Dominik
 *
 */
public class TypeSensorReading<T> {
	String measurementType, measurementUnit, readingType;
	T readingUnit;
	
	public TypeSensorReading(String measurementType, String measurementUnit, String readingType, T readingUnit) {
		super();
		this.measurementType = measurementType;
		this.measurementUnit = measurementUnit;
		this.readingType = readingType;
		this.readingUnit = readingUnit;
	}
	
	
}
