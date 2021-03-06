
package br.com.reqs.already.api.v1.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de criarPedido complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="criarPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pedido" type="{http://ws.v1.api.already.reqs.com.br/}pedidoDTO"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "criarPedido", propOrder = {
    "pedido"
})
public class CriarPedido {

    @XmlElement(required = true)
    protected PedidoDTO pedido;

    /**
     * Obt�m o valor da propriedade pedido.
     * 
     * @return
     *     possible object is
     *     {@link PedidoDTO }
     *     
     */
    public PedidoDTO getPedido() {
        return pedido;
    }

    /**
     * Define o valor da propriedade pedido.
     * 
     * @param value
     *     allowed object is
     *     {@link PedidoDTO }
     *     
     */
    public void setPedido(PedidoDTO value) {
        this.pedido = value;
    }

}
