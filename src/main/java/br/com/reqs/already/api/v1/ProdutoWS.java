
package br.com.reqs.already.api.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProdutoWS", targetNamespace = "http://ws.v1.api.already.reqs.com.br/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProdutoWS {


    /**
     * 
     * @param parameters
     * @param token
     * @return
     *     returns br.com.reqs.already.api.v1.GetProdutoByIdResponse
     */
    @WebMethod
    @WebResult(name = "getProdutoByIdResponse", targetNamespace = "http://ws.v1.api.already.reqs.com.br/", partName = "result")
    @Action(input = "http://ws.v1.api.already.reqs.com.br/ProdutoWS/getProdutoByIdRequest", output = "http://ws.v1.api.already.reqs.com.br/ProdutoWS/getProdutoByIdResponse")
    public GetProdutoByIdResponse getProdutoById(
        @WebParam(name = "getProdutoById", targetNamespace = "http://ws.v1.api.already.reqs.com.br/", partName = "parameters")
        GetProdutoById parameters,
        @WebParam(name = "token", targetNamespace = "http://ws.v1.api.already.reqs.com.br/", header = true, partName = "token")
        Token token);

    /**
     * 
     * @param parameters
     * @param token
     * @return
     *     returns br.com.reqs.already.api.v1.TodosOsProdutosResponse
     */
    @WebMethod
    @WebResult(name = "todosOsProdutosResponse", targetNamespace = "http://ws.v1.api.already.reqs.com.br/", partName = "result")
    @Action(input = "http://ws.v1.api.already.reqs.com.br/ProdutoWS/todosOsProdutosRequest", output = "http://ws.v1.api.already.reqs.com.br/ProdutoWS/todosOsProdutosResponse")
    public TodosOsProdutosResponse todosOsProdutos(
        @WebParam(name = "todosOsProdutos", targetNamespace = "http://ws.v1.api.already.reqs.com.br/", partName = "parameters")
        TodosOsProdutos parameters,
        @WebParam(name = "token", targetNamespace = "http://ws.v1.api.already.reqs.com.br/", header = true, partName = "token")
        Token token);

}
