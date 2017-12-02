package model;

import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Data
public class UsersList {
    private List items = new ArrayList();

    @Override
    public String toString() {
        return "UsersList{" +
                "userDTOS=" + items +
                '}';
    }
}
