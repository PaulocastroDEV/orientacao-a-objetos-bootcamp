package domain.model;

import java.time.LocalDate;

public class MentoriaModel extends ConteudoModel{
	
	private LocalDate data;
	
	public MentoriaModel() {
	
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "MentoriaModel [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + "]";
	}
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO+20d;
	}
	
	
}
