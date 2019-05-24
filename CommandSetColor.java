package pobj.tme6;
import javafx.scene.paint.*;

public class CommandSetColor implements ICommand{

	private Color color;
	
	public CommandSetColor(Color c){
		color =c;
		
	}
	
	public void execute(IColorTurtle turtle){
		turtle.setColor(color);
	}
}
