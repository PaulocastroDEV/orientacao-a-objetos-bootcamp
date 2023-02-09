package domain;

import domain.model.CursoModel;
import domain.model.MentoriaModel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CursoModel curso= new CursoModel();
		
		curso.setTitulo("Curso Java");
		curso.setCargaHoraria(8);
		curso.setDescricao("Curso de especialista em java");
		
		System.out.println(curso);
		
		MentoriaModel mentoria= new MentoriaModel();
		mentoria.setTitulo("Mentoria em java");
		curso.setCargaHoraria(10);
		curso.setDescricao("Mentoria para escialistas em java");
		
		System.out.println(mentoria);
	}

}
