package md.websoft.corejava.security.tokens;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Date;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.crypto.RSASSASigner;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;

/*
 * JSON Web Token with RSA keys
 * 
 */
public class JwtWithRsa {

	public static void main(String[] args) {

		try {
			//Generate public & private RSA keys
			KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
			keyGen.initialize(1024);
			
			KeyPair kp = keyGen.generateKeyPair();
			RSAPrivateKey privateKey = (RSAPrivateKey) kp.getPrivate();
			RSAPublicKey publicKey = (RSAPublicKey) kp.getPublic();
			
			//Create RSA signer with PRIVATEKEY
			JWSSigner signer = new RSASSASigner(privateKey);
			
			//Prepare JWT with claims set
			JWTClaimsSet claimsSet = new JWTClaimsSet();
			claimsSet.setSubject("maciej");
			claimsSet.setIssueTime(new Date());
			claimsSet.setIssuer("https://websoft.pl");
			
			SignedJWT signedJWT = new SignedJWT(new JWSHeader(JWSAlgorithm.RS256), claimsSet);
			
			//Compute RSA signature
			signedJWT.sign(signer);
			
			//serialize
			String s = signedJWT.serialize();
			System.out.println(s);
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JOSEException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
