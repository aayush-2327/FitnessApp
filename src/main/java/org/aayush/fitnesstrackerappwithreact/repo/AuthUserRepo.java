package org.aayush.fitnesstrackerappwithreact.repo;

import org.aayush.fitnesstrackerappwithreact.model.AuthModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthUserRepo extends MongoRepository<AuthModel, String> {
    AuthModel findByUsername(String username);
}
