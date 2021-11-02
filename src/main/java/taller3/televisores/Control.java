package taller3.televisores;

public class Control {
	private TV tv;
	
	
	public void turnOn() {
		this.tv.turnOn();
	}
	public void turnOff() {
		this.tv.turnOff();
	}
	
	
	public void canalUp() {
		if(tv.estado) {
			if(tv.getCanal()<120) {
				this.tv.canalUp();
			}
		}
	}
	public void canalDown() {
		if(tv.estado) {
			if(tv.getCanal()>1) {
				this.tv.canalDown();
			}
		}	
	}
	
	
	public void volumenUp() {
		if(tv.estado) {
			if(tv.getVolumen()<7) {
				this.tv.volumenUp();
			}
		}
	}
	public void volumenDown() {
		if(tv.estado) {
			if(tv.getVolumen()>0) {
				this.tv.volumenDown();
			}
		}	
	}
	
	
	public void setCanal(int can) {
		this.tv.setCanal(can);
	}
	
	
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	
	
	public TV getTv() {
		return tv;
	}
	public void setTv(TV t) {
		tv = t;
		this.enlazar(t);
	}
	
}
