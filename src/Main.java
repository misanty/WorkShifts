import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
	public static List<Person> personnel  = new ArrayList<Person>();
	public static Availability availability = new PersonnelShift();

	public Main() {
	
		
	}

	public static void main(String[] args) {
		//The method below adds the personnel to the list
		fillPersonnel();
		//The method below sets the shift days by personnel name
		setShifts();
		//the method below gets the shift days and also corresponding employees 
		getShifts();

	}

	private static void fillPersonnel() {
		personnel.add(new Person("Lala", "lulu", "13131"));
		personnel.add(new Person("Mimi", "Mumi", "13323"));
		personnel.add(new Person("Leila", "Lili", "32432432"));
		personnel.add(new Person("Fifi", "Yuyu", "897987"));
		personnel.add(new Person("Zuzu", "Milo", "13323"));
	}

	private static void setShifts() {
		int avi = availability.setToValue(EnumSet.of(DayOfWeek.Monday, DayOfWeek.Friday));
		PersonnelShift.setPersonnelShiftInfo(avi,personnel.get(4) );
		
		avi = availability.setToValue(EnumSet.of(DayOfWeek.Tuesday, DayOfWeek.Saturday));
		PersonnelShift.setPersonnelShiftInfo(avi, personnel.get(0));
		
		avi = availability.setToValue(EnumSet.of(DayOfWeek.Wednesday, DayOfWeek.Thursday, DayOfWeek.Friday, DayOfWeek.Saturday));
		PersonnelShift.setPersonnelShiftInfo(avi, personnel.get(1));
		
		avi = availability.setToValue(EnumSet.of(DayOfWeek.Wednesday));
		PersonnelShift.setPersonnelShiftInfo(avi, personnel.get(2));
		
		avi = availability.setToValue(EnumSet.of(DayOfWeek.Monday, DayOfWeek.Wednesday, DayOfWeek.Thursday,DayOfWeek.Friday, DayOfWeek.Saturday));
		PersonnelShift.setPersonnelShiftInfo(avi, personnel.get(3));

	}
	
	private static void getShifts() {
	for (Map.Entry<Integer, Person> val : PersonnelShift.getPersonnelShiftInfo().entrySet()) {
		EnumSet<DayOfWeek> days = availability.valueToSet(val.getKey());
		System.out.println(val.getValue().toString()); 
		System.out.println("Working Days:"); 
		Iterator<DayOfWeek> shiftDays = days.iterator();
		while(shiftDays.hasNext()) {
			System.out.print(shiftDays.next()+" / ");
		}
		System.out.println(" ");
		System.out.println("**************************************************");
		
		
	}
		
	}
	
	
	

}
