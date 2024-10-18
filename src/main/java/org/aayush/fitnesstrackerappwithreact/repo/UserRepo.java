package org.aayush.fitnesstrackerappwithreact.repo;

import org.aayush.fitnesstrackerappwithreact.model.AuthModel;
import org.aayush.fitnesstrackerappwithreact.model.UserDataModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<UserDataModel, String> {

}

