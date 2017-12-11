package com.auth.auth;

public class AuthAdapter {


    public static AuthEntity toAuthEntity(AuthDto authDto){
        return AuthEntity.builder()
                .id(authDto.getId())
                .login(authDto.getLogin())
                .pwd(authDto.getPwd())
                .build();
    }

   public static AuthDto toAuthDto(AuthEntity authEntity){
        return AuthDto.builder()
                .id(authEntity.getId())
                .login(authEntity.getLogin())
                .pwd(authEntity.getPwd())
                .build();
   }
}
