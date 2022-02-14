/**
 * 
 */
package drugi;

/**
 * @author Dominik
 *
 */
public class RawSensorReading implements SensorReading {
	String measurementType, measurementUnit, readingType, readingUnit;
	
	
	public RawSensorReading(String measurementType, String measurementUnit, String readingType, String readingUnit) {
		super();
		this.measurementType = measurementType;
		this.measurementUnit = measurementUnit;
		this.readingType = readingType;
		this.readingUnit = readingUnit;
	}

	@Override
	public String getMeasurementType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getMeasurementUnit() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getReadingType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getReadingUnit() {
		// TODO Auto-generated method stub
		return null;
	}

}
