package org.springcamp.security.facebook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestOperations;

public class FacebookServiceImpl implements FacebookService {
    protected final Logger LOGGER = LoggerFactory.getLogger(getClass());
    private String profileUri;
    private RestOperations facebookRestTemplate;

	public void setProfileUri(String profileUri) {
		this.profileUri = profileUri;
	} 
	public void setFacebookRestTemplate(RestOperations facebookRestTemplate) {
        this.facebookRestTemplate = facebookRestTemplate;
    }
    @Override
    public FacebookUser findUser() {
        FacebookUser facebookUser = 
        		facebookRestTemplate.getForObject(profileUri, FacebookUser.class);
        if(LOGGER.isInfoEnabled()) {
        	LOGGER.info(facebookUser.toString());
        }
        return facebookUser;
    }
}
