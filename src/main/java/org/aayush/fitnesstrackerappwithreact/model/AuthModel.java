package org.aayush.fitnesstrackerappwithreact.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document("user-cred")
public class AuthModel {
    @Id
    private String username;
    private String password;
}
