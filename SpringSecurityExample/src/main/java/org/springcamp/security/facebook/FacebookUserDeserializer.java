package org.springcamp.security.facebook;

import java.io.IOException;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.ObjectCodec;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

public class FacebookUserDeserializer extends JsonDeserializer<FacebookUser> {

    @Override
    public FacebookUser deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        FacebookUser user = new FacebookUser();
        ObjectCodec oc = jp.getCodec();
        JsonNode node = oc.readTree(jp);
        user.setId(getNodeString(node.get("id")));
        user.setName(getNodeString(node.get("username")));
        user.setBirthday(getNodeString(node.get("birthday")));
        user.setEmail(getNodeString(node.get("email")));
        user.setGender(getNodeString(node.get("gender")));
        user.setLink(getNodeString(node.get("link")));
        user.setLocale(getNodeString(node.get("locale")));
        return user;
        
    }
    private String getNodeString(JsonNode jsonNode) {
        return jsonNode == null ? "" : jsonNode.getTextValue();
    }
}
