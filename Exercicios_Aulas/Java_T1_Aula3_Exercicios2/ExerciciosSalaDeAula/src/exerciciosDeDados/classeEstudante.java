package exerciciosDeDados;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class classeEstudante {
	private String nome;
	Date DataNascimento, x;
	String cpf;

	public classeEstudante(String nome, Date dataNascimento, String cpf) {
		super();
		this.nome = nome;
		DataNascimento = dataNascimento;
		this.cpf = cpf;
	}
	
	public classeEstudante(){
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		try {
		SimpleDateFormat datenasc = new SimpleDateFormat("dd/MM/yyy");
		this.DataNascimento = datenasc.parse(dataNascimento);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

	public Date getX() {
		return x;
	}

	public void setX(Date x) {
		this.x = x;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public int calculaIdade() {
		if (DataNascimento == null) {
			return -1;
		}
		Calendar calendarAtual = Calendar.getInstance();
		int anoAtual = calendarAtual.get(Calendar.YEAR);
		
		Calendar calendarNascimento = Calendar.getInstance();
		calendarNascimento.setTime(DataNascimento);
		int anoNascimento = calendarNascimento.get(Calendar.YEAR);
		
		int idade = anoAtual - anoNascimento;
		return idade;
	}

	public static void main(String[] args) {
		classeEstudante aluno1 = new classeEstudante();
		aluno1.setDataNascimento("01/09/1994");
		System.out.println(aluno1.getDataNascimento());
		
		System.out.println(aluno1.calculaIdade());
	}
	
}
