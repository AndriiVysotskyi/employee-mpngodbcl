package telran.persons.controller.items;

import java.time.LocalDate;

import telran.persons.controller.PersonsConsoleApp;
import telran.persons.dto.Address;
import telran.persons.dto.Child;
import telran.persons.dto.Person;
import telran.view.Item;

public class AddChildItem implements Item {

	@Override
	public String displayedName() {
		return "Add child";
	}

	@Override
	public void action() {
		Child child = getChild();
		boolean result = PersonsConsoleApp.persons.addPerson(child);
		PersonsConsoleApp.inputOutput.displayLine(result);
	}

	private Child getChild() {
		return new Child(88, new Address("88", "88"), "88", LocalDate.of(1989, 02, 02), "88");
		// int id = PersonsConsoleApp.inputOutput.getInteger("enter child id");
		// String city = PersonsConsoleApp.inputOutput.getString("enter city");
		// String street = PersonsConsoleApp.inputOutput.getString("enter street");
		// String name = PersonsConsoleApp.inputOutput.getString("Enter name");
		// LocalDate birthdate = PersonsConsoleApp.inputOutput.getDate("Enter persons
		// birthdate", "dd/MM/yyyy");
		// String kindergarten = PersonsConsoleApp.inputOutput.getString("enter
		// kindergarten");
		// return new Child(id, new Address(city, street), name, birthdate,
		// kindergarten);
	}

}
