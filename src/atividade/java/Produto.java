package atividade.java;

public class Produto {
		private int codigo;
	    private String nome;
	    private float valor;
	    private Fornecedor fornecedor;

	    public Produto(int codigo, String nome, float valor, Fornecedor fornecedor) {
	        this.codigo = codigo;
	        this.nome = nome;
	        this.valor = valor;
	        this.fornecedor = fornecedor;
	    }

	    public void atualizarPreco(float percentual) {
	        float aumento = (percentual / 100) * valor;
	        valor += aumento;
	    }

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public float getValor() {
			return valor;
		}

		public void setValor(float valor) {
			this.valor = valor;
		}

		public Fornecedor getFornecedor() {
			return fornecedor;
		}

		public void setFornecedor(Fornecedor fornecedor) {
			this.fornecedor = fornecedor;
		}
		public void mostrarproduto() {
			System.out.println("Código:"+ codigo);
			System.out.println("Nome: "+ nome);
			System.out.println("Valor: "+ valor);
			System.out.println("Fornecedor: "+ fornecedor.getNome());
			System.out.println("CNPJ do Fornecedor: "+ fornecedor.getCnpj());
			System.out.println("Telefone do Fornecedor: "+ fornecedor.getTelefone());
		}
		
}
