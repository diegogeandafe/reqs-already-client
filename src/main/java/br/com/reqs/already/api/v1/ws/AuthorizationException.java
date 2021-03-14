
package br.com.reqs.already.api.v1.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.13
 * 2021-03-13T21:52:20.298-03:00
 * Generated source version: 2.7.13
 */

@WebFault(name = "AuthorizationFault", targetNamespace = "http://ws.v1.api.already.reqs.com.br/")
public class AuthorizationException extends Exception {
    
    private java.lang.String authorizationFault;

    public AuthorizationException() {
        super();
    }
    
    public AuthorizationException(String message) {
        super(message);
    }
    
    public AuthorizationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthorizationException(String message, java.lang.String authorizationFault) {
        super(message);
        this.authorizationFault = authorizationFault;
    }

    public AuthorizationException(String message, java.lang.String authorizationFault, Throwable cause) {
        super(message, cause);
        this.authorizationFault = authorizationFault;
    }

    public java.lang.String getFaultInfo() {
        return this.authorizationFault;
    }
}