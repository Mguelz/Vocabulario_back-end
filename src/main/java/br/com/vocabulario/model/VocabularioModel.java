package br.com.vocabulario.model;

public class VocabularioModel {
	private int id;
	private String portugues;
	private String ingles;

	public VocabularioModel() {
	}

	public VocabularioModel(int id, String portugues, String ingles) {
		this.id = id;
		this.ingles = ingles;
		this.portugues = portugues;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPortugues() {
		return portugues;
	}

	public void setPortugues(String portugues) {
		this.portugues = portugues;
	}

	public String getIngles() {
		return ingles;
	}

	public void setIngles(String ingles) {
		this.ingles = ingles;
	}
}
