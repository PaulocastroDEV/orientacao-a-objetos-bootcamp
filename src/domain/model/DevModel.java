package domain.model;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.DoubleStream;

public class DevModel {
	private String nome;
	private Set<ConteudoModel> conteudosIncritos =new LinkedHashSet<>();
	private Set<ConteudoModel> conteudosConcluidos =new LinkedHashSet<>();
	
	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosIncritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DevModel other = (DevModel) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosIncritos, other.conteudosIncritos) && Objects.equals(nome, other.nome);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<ConteudoModel> getConteudosIncritos() {
		return conteudosIncritos;
	}
	public void setConteudosIncritos(Set<ConteudoModel> conteudosIncritos) {
		this.conteudosIncritos = conteudosIncritos;
	}
	public Set<ConteudoModel> getConteudosConcluidos() {
		return conteudosConcluidos;
	}
	public void setConteudosConcluidos(Set<ConteudoModel> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
	public void inscreverBootcamp(BootcampModel bootcamp) {
		this.conteudosIncritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	public void progredir() {
		Optional<ConteudoModel> conteudo= this.conteudosIncritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosIncritos.remove(conteudo.get());
		}else {
			System.err.println("Você não está matriculado em nenhum conteúdo");
		}
	}
	public double calcularTotalXp() {
		return this.conteudosConcluidos
				.stream()
				.mapToDouble(conteudo-> conteudo.calcularXp()).sum();
	}
}
