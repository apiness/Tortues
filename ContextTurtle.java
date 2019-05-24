package pobj.tme6;

import javafx.scene.paint.Color;

public class ContextTurtle extends ColorTurtle implements IColorTurtle {
	private IContext ic;
	
	public ContextTurtle(IContext ic) {
		this.ic=ic;
	}
	
	public void move(int length) {
		int oldx=x;
		int oldy=y;
		int newx;
		int newy;
		newx = oldx + (int)(length * Math.sin(angle * Math.PI / 180.));
		newy = oldy + (int)(length * Math.cos(angle * Math.PI / 180.));
		
		x = newx;
		y = newy;
		
		if (etatCrayon) draw(oldx,oldy,x,y,couleur);
	}
	
	
	public void draw(int x1, int y1, int x2, int y2,Color couleur){
		ic.drawLine(x1, y1, x2, y2, couleur);
	}
}
