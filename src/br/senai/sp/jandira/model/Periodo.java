package br.senai.sp.jandira.model;

public enum Periodo {

	MANHA("Manh�"), TARDE("Tarde"), NOITE("Noite");

	private Periodo(String descricao) {

	}

	private String descricao;

	private Periodo() {

	}

	public String getDescricao() {
		return descricao;
	}

}
