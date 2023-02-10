package domain;

import domain.model.BootcampModel;
import domain.model.ConteudoModel;
import domain.model.CursoModel;
import domain.model.DevModel;
import domain.model.MentoriaModel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CursoModel curso= new CursoModel();
		
		curso.setTitulo("Curso Java");
		curso.setCargaHoraria(8);
		curso.setDescricao("Curso de especialista em java");
		
		
		MentoriaModel mentoria= new MentoriaModel();
		mentoria.setTitulo("Mentoria em java");
		curso.setCargaHoraria(10);
		curso.setDescricao("Mentoria para especialista em java");
		
		ConteudoModel conteudo = new CursoModel();
	
		BootcampModel bootcamp = new BootcampModel();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso);
		
		DevModel devPaulo = new DevModel();
		devPaulo.setNome("Paulo");
		devPaulo.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos Paulo: "+ devPaulo.getConteudosIncritos());
		System.out.println("----------------");
		devPaulo.progredir();
		System.out.println("Conteudos concluídos Paulo: "+ devPaulo.getConteudosConcluidos());
		System.out.println("XP do Paulo:" + devPaulo.calcularTotalXp());
		System.out.println("Conteudos inscritos Paulo: "+ devPaulo.getConteudosIncritos());
		
		
	}

}
