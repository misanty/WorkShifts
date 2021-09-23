/***
 * 
 * @author misanty
 *This enum holds the day of week with corresponding bit values,
 *later on to store with multiple combination of the personnel work days in an EnumSet
 */
public enum DayOfWeek {
	Monday(1),
	Tuesday(2),
	Wednesday(4),
	Thursday(8),
	Friday(16),
	Saturday(32),
	Sunday(64);

	private final int index;

	DayOfWeek(int index) {
		this.index = index;
	}

	public int value() {
		return index;
	}
	
	

}
