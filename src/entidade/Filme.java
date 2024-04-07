package entidade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Filme {
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String titulo;
	private Date diaLancamento;
	private String descricao;
	
	private List<String> diretor = new ArrayList<String>();
	
	public Filme() {}
	public Filme(String titulo, String diaLancamento, String descricao) throws ParseException {
		this.titulo = titulo;
		this.diaLancamento = sdf.parse(diaLancamento);
		this.descricao = descricao;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public Date getDiaLancamento() {
		return diaLancamento;
	}
	public List<String> getDiretor() {
		return diretor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void adicionarDiretor(String diretor) {
		this.diretor.add(diretor);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(diaLancamento, titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filme other = (Filme) obj;
		return Objects.equals(diaLancamento, other.diaLancamento) && Objects.equals(titulo, other.titulo);
	}
}
