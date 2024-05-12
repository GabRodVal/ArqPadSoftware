
public class Clima {

	private double temperatura;
	private double umidade;
	
	private String cidade;
	
	public Clima(double celsius, double humidity, String cityName) {
		this.temperatura = celsius;
		this.umidade = humidity;
		this.cidade = cityName;
	}
	
	public void tempStatus() {
		System.out.println(this.cidade+" marcou hoje "+this.temperatura+"° e uma umidade de "+this.umidade);
	}

	public double getTemperatura() {
		return temperatura;
	}

	public double getUmidade() {
		return umidade;
	}

	public String getCidade() {
		return cidade;
	}
	
	
	
}
