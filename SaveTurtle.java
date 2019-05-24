package pobj.tme6;

import javafx.scene.paint.Color;

public class SaveTurtle implements IColorTurtle {
	
	private CommandList l=new CommandList();
	
	public CommandList getCommand(){
		return l;
	}

	@Override
	public void move(int length) {
		// TODO Auto-generated method stub
		l.addCommand(new CommandMove(length));
	}

	@Override
	public void turn(int angle) {
		// TODO Auto-generated method stub
		l.addCommand(new CommandTurn(angle));
	}

	@Override
	public void up() {
		// TODO Auto-generated method stub
		l.addCommand(new CommandUp());
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		l.addCommand(new CommandDown());
	}

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		l.addCommand(new CommandSetColor(color));
	}
	
	

}
