package com.security.criptografiaSenha.repository;

import com.security.criptografiaSenha.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel, Long> {

    public Optional<UserModel> findByLogin(String login);
}
