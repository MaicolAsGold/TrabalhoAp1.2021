package br.com.poo.modelo;

public class ShowB {
	private Ingresso ingresso;
	private String nome;
	private Data data;

	public ShowB(Ingresso ingresso, String nome, Data data) {
		this.ingresso = ingresso;
		this.nome = nome;
		this.data = data;
	}

	public String impressao() {
		StringBuilder dados = new StringBuilder();
		dados.append(nome);
		dados.append("\n");
		dados.append("Ingressos disponíveis: ");
		dados.append(ingresso.getQnt());
		dados.append("\n");
		dados.append("Valor do ingresso: R$ ");
		dados.append(ingresso.getValor());
		dados.append("\n");
		dados.append("Data: ");
		dados.append(data.getDia());
		dados.append("/");
		dados.append(data.getMes());
		dados.append("/");
		dados.append(data.getAno());
		dados.append("\nHorário: 20:00");
		dados.append("\nLocal: Wet'N Wild.");
        dados.append("\nEndereço: Av. Luís Viana Filho, 18 - Patamares.");

		return dados.toString();

	}
	public String dadosDaCompra() {
		StringBuilder dados = new StringBuilder();
		dados.append("Dados da Compra: ");
		dados.append("\n");
		dados.append("\n");
		dados.append(nome);
		dados.append("\n");
		dados.append("\n");
		dados.append("Data: ");
		dados.append(data.getDia());
		dados.append("/");
		dados.append(data.getMes());
		dados.append("/");
		dados.append(data.getAno());
		dados.append("\n");
		dados.append("\nHorário: 20:00");
		dados.append("\n");
		dados.append("\nLocal: Wet'N Wild.");
		dados.append("\n");
		dados.append("\nEndereço: Av. Luís Viana Filho, 18 - Patamares.");
	    dados.append("\n");
	    dados.append("______________________________________________________\n");
		dados.append("                              Valor total da compra: R$ ");
        dados.append(ingresso.preco());

		return dados.toString();

	}

}
