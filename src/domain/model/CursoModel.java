package domain.model;

public class CursoModel extends ConteudoModel{
	
	private int cargaHoraria;
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "CursoModel [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
	@Override
	public double calcularXp() {
		// TODO Auto-generated method stub
		return XP_PADRAO*cargaHoraria;
	}
	
	
}
