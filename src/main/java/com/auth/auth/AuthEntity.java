package com.auth.auth;

import lombok.*;

import javax.persistence.Id;



@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AuthEntity {

    @Id
    private String id;

    private String login;

    private String pwd;

}
