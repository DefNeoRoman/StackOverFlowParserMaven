package model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {

    private String account_id;
    private String user_id;
    private String link;
    private String display_name;

    @Override
    public String toString() {
        return "UserDTO{" +
                "account_id='" + account_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", link='" + link + '\'' +
                ", display_name='" + display_name + '\'' +
                '}';
    }
}
