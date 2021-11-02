package taller3.televisores;

public class Control {
	private TV tv;
	
	
	public void turnOn() {
		tv.estado = true;
	}
	public void turnOff() {
		tv.estado = false;
	}
	
	
	public void canalUp() {
		if(tv.estado) {
			if(tv.getCanal()<120) {
				tv.setCanal(tv.getCanal()+1);
			}
		}
	}
	public void canalDown() {
		if(tv.estado) {
			if(tv.getCanal()>1) {
				tv.setCanal(tv.getCanal()-1);
			}
		}	
	}
	
	
	public void volumenUp() {
		if(tv.estado) {
			if(tv.getVolumen()<7) {
				tv.setVolumen(tv.getVolumen()+1);
			}
		}
	}
	public void volumenDown() {
		if(tv.estado) {
			if(tv.getVolumen()>0) {
				tv.setVolumen(tv.getVolumen()-1);
			}
		}	
	}
	
	
	public void setCanal(int can) {
		tv.setCanal(can); 
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
