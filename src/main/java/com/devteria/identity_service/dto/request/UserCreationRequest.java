package com.devteria.identity_service.dto.request;

import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder // giup tao 1 doi tuong va gan gia tri nhanh hơn ko cần truyền hết tham số vào constructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {
    @Size(min = 3,message = "USERNAME_INVALID")
     private String username;
    @Size(min = 8,message = "INVALID_PASSWORD")
      String password;
      String firstname;
      String lastname;
      LocalDate dob;


}
