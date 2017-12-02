package model;

import lombok.Data;

import java.util.LinkedList;

@Data
public class UsersList {
    private LinkedList items = new LinkedList();

    @Override
    public String toString() {
        return "UsersList{" +
                "userDTOS=" + items +
                '}';
    }
}
