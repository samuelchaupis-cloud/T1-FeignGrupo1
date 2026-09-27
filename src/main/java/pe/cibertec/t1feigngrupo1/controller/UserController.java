package pe.cibertec.t1feigngrupo1.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.t1feigngrupo1.restclient.placeholder.model.UserPlaceHolder;
import pe.cibertec.t1feigngrupo1.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping
    public List<UserPlaceHolder> getUsers() {
        return userService.getUsers();
    }
}