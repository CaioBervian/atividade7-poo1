public class Cone {
private static final float NULL = 0;
private double raio;
private double h;
private int tipo;

public double getH() {
	return h;
}
public void setH(double h) {
	this.h = h;
}

public double getRaio() {
	return raio;
}
public void setRaio(double raio) {
	this.raio = raio;
}
public int getTipo() {
	return tipo;
}
public void setTipo(int tipo) {
	this.tipo = tipo;
}


public double g() {
 double g = ((h*h)+ (raio*raio));
 g = Math.sqrt(g);
return g;
}

public double areatotal() {
	return 3.14*raio*(raio+g());
}

public double areafundo() {
	return 3.14*(raio*raio);
}

public double arealateral() {
	return 3.14*raio*g();
	
}


public double latas() {
return (double) ((litros()/18));
}

public double preco() {
	
	if(tipo == 1) {
		return (double) (238.90*Math.ceil((latas())));
	}
	if( tipo == 2) {
		return (double) (467.98*Math.ceil((latas())));
	}
	if (tipo == 3) {
		return (double) (758.34*Math.ceil((latas())));
	}
	return NULL;
}

public double litros() {
	return (double) (areatotal()*3.45);
}
}