package com.devteria.identity_service.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder // giup tao 1 doi tuong va gan gia tri nhanh hơn ko cần truyền hết tham số vào constructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {
     String id;
     String username;
     String password;
     String firstname;
     String lastname;
     LocalDate dob;
}
