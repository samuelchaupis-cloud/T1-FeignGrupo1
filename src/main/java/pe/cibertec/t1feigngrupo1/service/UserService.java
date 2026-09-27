package pe.cibertec.t1feigngrupo1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.cibertec.t1feigngrupo1.restclient.placeholder.idcliente.UserClient;
import pe.cibertec.t1feigngrupo1.restclient.placeholder.model.UserPlaceHolder;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {

    private UserClient userClient;

    public List<UserPlaceHolder> getUsers() {

        List<UserPlaceHolder> users = userClient.getUsers();

        return users.stream()
                .filter(user -> user.getUserId() == null || user.getUserId() % 2 == 0)
                .filter(user -> user.getId() % 2 != 0)
                .collect(Collectors.toList());
    }
}