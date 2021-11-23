
package com.albares.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.exceptions.JWTVerificationException;

public final class JWTUtils {
    private static final JWTVerifier verifier = JWT.require(Parameters.algorithm)
            .withIssuer(Parameters.PROJECT_NAME)
            .build(); 
    
    public JWTUtils() {
    }
    
    public static final Boolean checkJWTandGetUserId(String token){
        try{
            verifier.verify(token);
            return true;
        }catch (JWTVerificationException ex) {
            /*TODO: Avisar con bandera roja*/
            return false;
        }
    }
    
    
}
