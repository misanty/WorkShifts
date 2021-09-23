import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class PersonnelShift implements Availability {
	private static Map<Integer, Person> personnelShiftInfo;

	public PersonnelShift() {
		// By initializing the Map with corresponding key,value pair
		// we can prevent to accept any other Object value into our Map
		personnelShiftInfo  = new HashMap<Integer, Person>();
		
	}

	
	@Override
	public int setToValue(EnumSet<DayOfWeek> days) {
		int value = 0;
		for (DayOfWeek day : days) {
			value = value | day.value();
		}
		return value;
	}

	@Override
	public  EnumSet<DayOfWeek> valueToSet(int value) {
		// EnumSet.noneOf creates the empty DayOfWeek class
		EnumSet<DayOfWeek> days = EnumSet.noneOf(DayOfWeek.class);
		// Then we add only the days that the bit flag combination is provided i.e.
		// Monday, Wednesday, Friday

		for (DayOfWeek day : EnumSet.allOf(DayOfWeek.class)) {
			if ((value & day.value()) != 0) {
				days.add(day);
			}
		}
		return days;
	}

	public static Map<Integer, Person> getPersonnelShiftInfo() {
		return personnelShiftInfo;
	}

	public static void setPersonnelShiftInfo(int dayComb, Person person  ) {
		
		PersonnelShift.personnelShiftInfo.put(dayComb, person);
	}

}
