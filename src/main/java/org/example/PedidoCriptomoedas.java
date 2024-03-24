package org.example;

public class PedidoCriptomoedas extends PedidoTemplate {
    public PedidoCriptomoedas(int quantidadeItens, double valorItem, String formaPagamento) {
        super(quantidadeItens, valorItem, formaPagamento);
    }

    @Override
    protected boolean decidirEntrega() {
        // Lógica para decidir se há entrega para pedidos com pagamento via criptomoedas
        boolean entrega = true;
        // ...
        return entrega;
    }

    @Override
    protected void realizarEntrega() {
        System.out.println("Realizando entrega via transportadora...");
        // Lógica específica para realizar a entrega de pedidos com pagamento via criptomoedas
    }
}
