package com.geekater.UserManagementSystem.Model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotEmpty
    private String userId;
    @NotNull
    private String name;
    @Email
    private String userName;
    private String address;
    @Size(min = 10, max = 13)
    private String phoneNumber;

}
