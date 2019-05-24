package pobj.tme6;

public class CommandDown implements ICommand{
public CommandDown(){}
	
	public void execute(IColorTurtle turtle){
		turtle.down();
	}
}
