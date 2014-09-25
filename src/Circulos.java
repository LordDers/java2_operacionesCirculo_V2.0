/*
	Radio
*/
public class Circulos 
{
	private float area;
	private float circunferencia = 0;
	private float radio;

	//Metodo para calcular el radio
	public void setRadio (float rad) 
	{
		this.radio = rad;
		//this.area = 3.1416f * (radio * radio);
		//this.circunferencia = 2 * 3.1416f * radio;
	}

	public void setArea (float rad) 
	{
		this.area = 3.1416f * (rad * rad);
	}

	public void setCircunferencia (float rad) 
	{
		this.circunferencia = 2 * 3.1416f * rad;
	}

	public float getArea()
	{
		return area;
	}

	public float getCircunferencia()
	{
		return circunferencia;
	}

}
