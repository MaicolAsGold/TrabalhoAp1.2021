package br.com.poo.modelo;

public class ShowC {
	private Ingresso ingresso;
	private String nome;
	private Data data;

	public ShowC(Ingresso ingresso, String nome, Data data) {
		this.ingresso = ingresso;
		this.nome = nome;
		this.data = data;
	}

	public String impressao() {
		StringBuilder dados = new StringBuilder();
		dados.append(nome);
		dados.append("\n");
		dados.append("Ingressos dispon�veis: ");
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
		dados.append("\nHor�rio: 19:00");
		dados.append("\nLocal: Opera Salvador.");
        dados.append("\nEndere�o: Minas Gerais, 382 � Pituba.");
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
		dados.append("\nHor�rio: 19:00");
		dados.append("\n");
		dados.append("\nLocal: Opera Salvador.");	
		dados.append("\n");
        dados.append("\nEndere�o: Minas Gerais, 382 � Pituba.");
		dados.append("\n");
        dados.append("______________________________________________________\n");
		dados.append("                              Valor total da compra: R$ ");
        dados.append(ingresso.preco());

		return dados.toString();

	}

}
