import java.util.EnumSet;

public interface Availability {
	/***
	 * This method takes the specified work days for employees,
	 * then return the bit flag combination of the days
	 * can be used to store shift values in a Map object with corresponding personnel
	 * @param days
	 * @return int value
	 */
	public int setToValue(EnumSet<DayOfWeek> days);
	
	
	/***
	 * This method takes the bit flag value as a parameter then return the correct combination of the days of week
	 * @param int value bit flag
	 * @return EnumSet<DayOfWeek>
	 */
	public EnumSet<DayOfWeek> valueToSet(int value);

}
