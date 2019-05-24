package pobj.tme6;

public class Turtle implements ITurtle{

	protected int x;
	protected int y;
	protected int angle;
	protected boolean etatCrayon;

	public Turtle() {
		x = 0;
		y = 0;
		angle = 0;
		etatCrayon = true;
	}

	@Override
	public void move(int length) {
		int oldx=x;
		int oldy=y;
		int newx;
		int newy;
		newx = oldx + (int)(length * Math.sin(angle * Math.PI / 180.));
		newy = oldy + (int)(length * Math.cos(angle * Math.PI / 180.));
		
		x = newx;
		y = newy;
		
		if (etatCrayon){
			draw(oldx,oldy,x,y);
		}
	}

	@Override
	public void turn(int angle) {
		
		this.angle += angle%360;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void up() {
		etatCrayon = false;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void down() {
		etatCrayon = true;
		// TODO Auto-generated method stub
		
	}
	public void draw(int x1, int y1, int x2, int y2){
		System.out.println(""+x1+" "+y1+" "+x2+" "+y2);
	}

}
