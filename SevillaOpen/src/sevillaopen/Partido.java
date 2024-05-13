package sevillaopen;

import java.sql.Time;
import java.util.Date;

public class Partido {
	private String idPartido;
	private Date fecha;
	private Time hora;
	private int resultado;
	private String parejaGanadora;
	
	public Partido() {
		
	}

	/**
	 * @return the idPartido
	 */
	public String getIdPartido() {
		return idPartido;
	}

	/**
	 * @param idPartido the idPartido to set
	 */
	public void setIdPartido(String idPartido) {
		this.idPartido = idPartido;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the hora
	 */
	public Time getHora() {
		return hora;
	}

	/**
	 * @param hora the hora to set
	 */
	public void setHora(Time hora) {
		this.hora = hora;
	}

	/**
	 * @return the resultado
	 */
	public int getResultado() {
		return resultado;
	}

	/**
	 * @param resultado the resultado to set
	 */
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	/**
	 * @return the parejaGanadora
	 */
	public String getParejaGanadora() {
		return parejaGanadora;
	}

	/**
	 * @param parejaGanadora the parejaGanadora to set
	 */
	public void setParejaGanadora(String parejaGanadora) {
		this.parejaGanadora = parejaGanadora;
	}
	
}
