package entidade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Usuario {
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String nome;
	private Date dataNascimneto;
	private String email;
	private String senha;
	
	public Usuario() {}
	public Usuario(String nome, String dataNascimento, String email, String senha) throws ParseException {
		this.nome = nome;
		this.dataNascimneto = sdf.parse(dataNascimento);
		this.email = email;
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public Date getDataNascimneto() {
		return dataNascimneto;
	}
	public String getEmail() {
		return email;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(email, senha);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(email, other.email) && Objects.equals(senha, other.senha);
	}
}
