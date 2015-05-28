package md.websoft.webapp.archetype.rest.helper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class AuthenticationHelper {

	@Value("${rsa.public.key}")
    String publicKey;
	
	@Value("${rsa.private.key}")
    String privateKey;
	
	
	public boolean validateToken(){
		return false;
	}
}
