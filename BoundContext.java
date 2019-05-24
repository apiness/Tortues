package pobj.tme6;

import javafx.scene.paint.Color;

public class BoundContext implements IContext{
	private int x1,y1,x2,y2;

	public void drawLine(int x1, int y1, int x2, int y2, Color color) {
		/*if(x1<x2){
			this.x1=x1;
			this.x2=x2;
		}else{
			this.x1=x2;
			this.x2=x1;
		}
		
		if(y1<y2){
			this.y1=y1;
			this.y2=y2;
		}else{
			this.y1=y2;
			this.y2=y1;
		}*/
		
		this.x1=0;
		this.y1=0;
		this.x2=x2;
		this.y2=y2;
	}
	
	public int getMinX(){
		return x1;
	}
	
	public int getMinY(){
		return y1;
	}
	
	public int getMaxX(){
		return x2;
	}
	
	public int getMaxY(){
		return y2;
	}
}
