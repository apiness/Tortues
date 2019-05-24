package pobj.tme6;

public class CommandTurn implements ICommand{
    private int angle;
	
	public CommandTurn(int a){
	 angle = a;
}
	public void execute(IColorTurtle turtle){
		turtle.turn(angle);
	}
}
