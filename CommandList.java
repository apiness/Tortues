package pobj.tme6;

import java.util.ArrayList;
import java.util.List;

public class CommandList implements ICommand {

	private List<ICommand> ve = new ArrayList<>();

	public void addCommand(ICommand command) {
		ve.add(command);

	}

	public void execute(IColorTurtle turtle) {
		for (ICommand c : ve) {
			c.execute(turtle);
		}
	}
}
