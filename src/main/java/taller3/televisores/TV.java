package taller3.televisores;

public class TV {
	public static int numTV = 0;
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	public boolean estado;
	private int volumen = 1;
	private Control control;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marc) {
		marca = marc;
	}
	
	public Control getControl() {
		return control;
	}
	public void setControl(Control contr) {
		control = contr;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int prec) {
		precio = prec;
	}
	
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int vol) {
		if(vol<8 && vol>=0) {
			volumen = vol;
		}
	}
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int can) {
		if(can<121 && can>0) {
			canal = can;
		}
	}
	
	public static int getNumTV() {
		return numTV;
	}
	public static void setNumTV(int num) {
		numTV = num;
	}
	
	
	public void turnOn() {
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	
	
	public boolean getEstado() {
		return estado;
	}
	
	
	public void canalUp() {
		if(estado) {
			if(getCanal()<120) {
				setCanal(getCanal()+1);
			}
		}
	}
	public void canalDown() {
		if(estado) {
			if(getCanal()>1) {
				setCanal(getCanal()-1);
			}
		}	
	}
	
	
	public void volumenUp() {
		if(estado) {
			if(getVolumen()<7) {
				setVolumen(getVolumen()+1);
			}
		}
	}
	public void volumenDown() {
		if(estado) {
			if(getVolumen()>0) {
				setVolumen(getVolumen()-1);
			}
		}	
	}
	
	

	
	
	
	

}
