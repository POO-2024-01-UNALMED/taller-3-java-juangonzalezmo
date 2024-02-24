package taller3.televisores;

public class TV {
	
	private Marca marca;
	int canal = 1;
	private int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	private static int numTV;
	
	
	public TV(Marca marca, boolean estado) {
		
		this.marca = marca;
		this.estado = estado;
		this.nuevoTV();
	}
	
	public void nuevoTV() {
		
		numTV++;
	}
	 
	public void turnOn() {
		
		this.estado = true;
	}
	
	public void turnOff() {
		
		this.estado = false;
	}
	
	public void canalUp() {
		
		if (this.canal>=1 && this.canal<120 && this.estado==true ) {
			
			this.canal++;
		}
	}
	
	public void canalDown() {
		
		if (this.canal>1 && this.canal<=120 && this.estado==true ) {
			
			this.canal--;
		}
	}
	
	public void volumenUp() {
		
		if (this.volumen>=0 && this.volumen<7 && this.estado==true ) {
			
			this.volumen++;
		}
	}
	
	public void volumenDown() {
		
		if (this.volumen>0 && this.volumen<=7 && this.estado==true ) {
			
			this.volumen--;
		}
	}

	public boolean getEstado() {
		return estado;
	}
	
	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
}
