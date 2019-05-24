package pobj.tme6;

import javafx.scene.paint.Color;

public class ColorTurtleAdapter implements IColorTurtle{
	ITurtle iturtle;
	
	public ColorTurtleAdapter(ITurtle iturtle){
		this.iturtle= iturtle;
	}

	@Override
	public void move(int length) {
		// TODO Auto-generated method stub
		iturtle.move(length);
		
	}

	@Override
	public void turn(int angle) {
		// TODO Auto-generated method stub
		iturtle.turn(angle);
	}

	@Override
	public void up() {
		// TODO Auto-generated method stub
		iturtle.up();
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		iturtle.down();
	}

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
	
	}
	
	
	
}
