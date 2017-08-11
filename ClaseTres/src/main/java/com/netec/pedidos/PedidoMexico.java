/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.pedidos;

/**
 *
 * @author Java
 */
public class PedidoMexico extends Pedido{
    
    @Override
    protected void calcularIVA(){
        importeIVA = importeSinIVA * 0.16;
    }
    
}
