package org.example.AOP.AlteringMethods.Order;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class UserService {
    private Logger log = Logger.getLogger(UserService.class.getName());

    public void addUser(Usuario usuario) {
        log.info("Adding User: " + usuario.getNome());
    }

    public void editUser(Usuario usuario) {
        log.info("Editing User: " + usuario.getNome());
    }

    @ToOrder
    public void deleteUser(Usuario usuario) {
        log.info("Deleting User: " + usuario.getNome());
    }
}
