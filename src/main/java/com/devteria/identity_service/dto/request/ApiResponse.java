package com.devteria.identity_service.dto.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder // giup tao 1 doi tuong va gan gia tri nhanh hơn ko cần truyền hết tham số vào constructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ApiResponse <T> {
       int code = 1000;
       String message;
       T result;


}
