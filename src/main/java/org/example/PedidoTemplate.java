package org.example;

abstract class PedidoTemplate {
    private int quantidadeItens;
    private double valorItem;
    private String formaPagamento;

    public PedidoTemplate(int quantidadeItens, double valorItem, String formaPagamento) {
        this.quantidadeItens = quantidadeItens;
        this.valorItem = valorItem;
        this.formaPagamento = formaPagamento;
    }

    public void processarPedido() {
        processarPagamento();
        if (decidirEntrega()) {
            realizarEntrega();
        }
    }

    private void processarPagamento() {
        System.out.println("Processando pagamento...");
        // Lógica para processar o pagamento de acordo com a forma de pagamento
    }

    protected abstract boolean decidirEntrega();

    protected void realizarEntrega() {
        System.out.println("Realizando entrega...");
        // Lógica para realizar a entrega
    }
}
