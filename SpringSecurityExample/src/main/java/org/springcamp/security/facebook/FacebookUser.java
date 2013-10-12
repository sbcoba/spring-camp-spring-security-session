package org.springcamp.security.facebook;

import java.io.Serializable;

import org.codehaus.jackson.map.annotate.JsonDeserialize;

/**
 * 페이스북 사용자 정보를 가져오는 객체
 * @author skplanet
 *
 */
@JsonDeserialize(using = FacebookUserDeserializer.class)
public class FacebookUser implements Serializable{
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String username;
    private String email;
    private String gender;
    private String birthday;
    private String link;
    private String locale;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String getLocale() {
        return locale;
    }
    public void setLocale(String locale) {
        this.locale = locale;
    }
    @Override
    public String toString() {
        return "FacebookUser [id=" + id + ", name=" + name + ", username="
                + username + ", email=" + email + ", gender=" + gender
                + ", birthday=" + birthday + ", link=" + link + ", locale="
                + locale + "]";
    }
}
