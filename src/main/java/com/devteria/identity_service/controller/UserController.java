package com.devteria.identity_service.controller;

import com.devteria.identity_service.dto.request.ApiResponse;
import com.devteria.identity_service.dto.request.UserCreationRequest;
import com.devteria.identity_service.dto.request.UserUpdateRequest;
import com.devteria.identity_service.entity.User;
import com.devteria.identity_service.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users") //khi minh khai bao o day thi o duoi khong can khai bao nua
public class UserController {
    @Autowired
    private UserService userService; //controllrt lam viec voi service ,service lam viec voi repository

    @PostMapping    //("/users") tao 1 user
    ApiResponse<User> createUser(@RequestBody @Valid UserCreationRequest request){
        //Valid lam viec voi size va gioi han ki tu
        ApiResponse<User> apiResponse = new ApiResponse<>();
        apiResponse.setResult(userService.createUser(request));
        return apiResponse;
    }
    @GetMapping     //("/users") lay danh sach tat ca user trong database
    List<User> getUsers(){
        return userService.getUsers();
    }
    @GetMapping("/{userId}") // khai bao path tren bien dung dau ngoac nhon
    User getUser(@PathVariable String userId ){
        return userService.getUser(userId);
    }
    @PutMapping("/{userId}")
    User updateUser(@PathVariable String userId,@RequestBody UserUpdateRequest request){
        return userService.updateUser(userId,request);
    }
    @DeleteMapping("/{userId}")
    String deleteUser(@PathVariable String userId){
        userService.deleteUser(userId);
        return "user has been deleted";
    }

}
