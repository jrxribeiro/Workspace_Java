package Core;

public class Time {
	private int hora;
	private int minutos;
	private int segundos;

	public void setTime(int h, int m, int s) {
		this.hora = h;
		this.minutos = m;
		this.segundos = s;
	}

	public String exibirHoraUniversal() {
		String horaSTR;
		horaSTR = formata(this.hora)+":"+formata(this.minutos)+":"+formata(this.segundos);
		return horaSTR;
	}

	public String exibirHoraPadrao() {
		String horaSTR, sufixo;

		if (hora == 0) {  // meia noite
			horaSTR = "12";
			sufixo  = "AM";
		}
		else if (hora == 12) {
			horaSTR = "12";
			sufixo  = "PM";
		}
		else if (hora >= 1 && hora <= 11) {
			horaSTR = formata(hora);
			sufixo  = "AM";
		}
		else {
			horaSTR = formata(hora-12);
			sufixo  = "PM";
		}
		horaSTR = horaSTR + ":" + formata(minutos)+ ":" + formata(segundos)+ sufixo;
		return horaSTR;
	}

	private String formata(int valor) {
		if (valor < 10) {
			return "0"+valor;
		}
		else {
			return String.valueOf(valor);
		}
	}
}