package atividade.java;

public class TesteProduo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fornecedor fornecedor1= new Fornecedor("1234321", "819548715","Zé Maria");
		Fornecedor fornecedor2= new Fornecedor("543212345","8156974855","Claudio");
		
		Produto produto1=new Produto(1,"TV LCD",3500,fornecedor1);
		Produto produto2=new Produto(2,"Notebook",2000,fornecedor2);
		Produto produto3=new Produto(3,"Impressora",232,fornecedor2);
		
		produto1.mostrarproduto();
		produto2.atualizarPreco(10);
		produto2.mostrarproduto();
		produto3.atualizarPreco(5);
		produto3.mostrarproduto();
	}
	

}
