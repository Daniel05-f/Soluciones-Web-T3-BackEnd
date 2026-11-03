package com.upn.service.implementation;

import com.upn.model.User;
import com.upn.repository.IGenericRepository;
import com.upn.repository.IUserRepository;
import com.upn.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService extends GenericService<User, Integer> implements IUserService{
    private final IUserRepository repo;
    private final PasswordEncoder bcrypt;

    @Override
    protected IGenericRepository<User, Integer> getRepo() {
        return repo;
    }

    @Override
    public User findOneByUsername(String username) {
        return repo.findOneByUsername(username);
    }

    @Override
    public void changePassword(String username, String newPassword) {
        repo.changePassword(username, bcrypt.encode(newPassword));
    }
}
