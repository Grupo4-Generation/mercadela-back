package com.generation.mercadela.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserLogin {

    private Long id;

    @Schema(example = "email@email.com.br")
    @NotNull
    private String email;

    @NotBlank
    @Size(min = 8, max = 255)
    private String password;

    private boolean isAdmin;

    private String cpf;

    private String name;

    private String gender;

    private String photo;

    private String token;
}
