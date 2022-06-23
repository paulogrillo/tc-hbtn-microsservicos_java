package com.song.demo;

public class Song {
	/*
	 * - id: Integer 
	 * - nome: String 
	 * - artista: String 
	 * - album: String 
	 * - anoLancamento: String
	 */	
	
	private Integer id;
	private String nome;
	private String artista;
	private String anoLancamento;
	
	public Song(){}
	
	public Song(Integer id, String nome, String artista, String anoLancamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.artista = artista;
		this.anoLancamento = anoLancamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (id != null ? !id.equals(song.id) : song.id != null) return false;
        if (nome != null ? !nome.equals(song.nome) : song.nome != null) return false;
        if (artista != null ? !artista.equals(song.artista) : song.artista != null) return false;
        return anoLancamento != null ? anoLancamento.equals(song.anoLancamento) : song.anoLancamento == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        result = 31 * result + (artista != null ? artista.hashCode() : 0);
        result = 31 * result + (anoLancamento != null ? anoLancamento.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", artista='" + artista + '\'' +
                ", anoLancamento='" + anoLancamento + '\'' +
                '}';
    }

	
}
