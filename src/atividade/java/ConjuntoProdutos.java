package atividade.java;

import java.util.ArrayList;

public class ConjuntoProdutos {
    private ArrayList<Produto> produtos;

    public ConjuntoProdutos() {
        produtos = new ArrayList<>();
    }

    public void inserirProduto(Produto produto) {
        // Verifica se o produto já existe no conjunto
        for (Produto p : produtos) {
            if (p.getCodigo() == produto.getCodigo()) {
                System.out.println("Erro: Produto com o código " + produto.getCodigo() + " já existe.");
                return;
            }
        }
        produtos.add(produto);
    }

    public void removerProduto(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                produtos.remove(produto);
                return;
            }
        }
        System.out.println("Erro: Produto com o código " + codigo + " não encontrado.");
    }

    public void atualizarProduto(int codigo, Produto novoProduto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodigo() == codigo) {
                produtos.set(i, novoProduto);
                return;
            }
        }
        System.out.println("Erro: Produto com o código " + codigo + " não encontrado.");
    }

    public void mostrarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Valor: " + produto.getValor());
            System.out.println("Fornecedor: " + produto.getFornecedor().getNome());
            System.out.println("----------------------");
        }
    }

    public void atualizarPrecoPorcentagem(int codigo, float percentual) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                produto.atualizarPreco(percentual);
                return;
            }
        }
        System.out.println("Erro: Produto com o código " + codigo + " não encontrado.");
    }
}
