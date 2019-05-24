package pobj.tme6;

public class CommandUp implements ICommand{

	public CommandUp(){}
	
	public void execute(IColorTurtle turtle){
		turtle.up();
	}
}
