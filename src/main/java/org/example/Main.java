package org.example;

public class Main {

//    a principal diferença entre o decorator e o template é na maneira em que eles modificam os objetos.
//    Enquanto o decorator adiciona funcionalidades a objetos dinamicamente, sem modificar o código original,
//    o template defini um esqueleto de um algoritmo, com passos que podem ser customizados por subclasses.
    public static void main(String[] args) {
        PedidoTemplate pedido1 = new PedidoOnline(3, 10.0, "Cartão de Crédito");
        pedido1.processarPedido();

        System.out.println();

        PedidoTemplate pedido2 = new PedidoNaLoja(2, 15.0, "Dinheiro");
        pedido2.processarPedido();

        System.out.println();

        PedidoTemplate pedido3 = new PedidoCriptomoedas(1, 20.0, "Bitcoin");
        pedido3.processarPedido();
    }
}