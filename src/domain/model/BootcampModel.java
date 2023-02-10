package domain.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BootcampModel {
	
	
	private String nome;
	private String descricao;
	private final LocalDate dataInicial=LocalDate.now();
	private final LocalDate dataFinal=dataInicial.plusDays(45);
	private Set<DevModel> devsInscritos = new HashSet<>();
	private Set<ConteudoModel> conteudos = new HashSet<>();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Set<DevModel> getDevsInscritos() {
		return devsInscritos;
	}
	public void setDevsInscritos(Set<DevModel> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}
	public Set<ConteudoModel> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<ConteudoModel> conteudos) {
		this.conteudos = conteudos;
	}
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	@Override
	public int hashCode() {
		return Objects.hash(conteudos, dataFinal, dataInicial, descricao, devsInscritos, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BootcampModel other = (BootcampModel) obj;
		return Objects.equals(conteudos, other.conteudos) && Objects.equals(dataFinal, other.dataFinal)
				&& Objects.equals(dataInicial, other.dataInicial) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devsInscritos, other.devsInscritos) && Objects.equals(nome, other.nome);
	}
	
	
	
}
