package com.springbootmvc.springcrudwithsecuritymvcjsp.controllers;
import com.springbootmvc.springcrudwithsecuritymvcjsp.extensions.dtos.UserInfoDto;
import com.springbootmvc.springcrudwithsecuritymvcjsp.services.interfaces.IUserInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    private IUserInfoService userInfoService;

    @Autowired
    public UserController(IUserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @GetMapping("/")
    public String home(Model model){
        return "redirect:/users";
    }

    @Operation(summary = "Get greeting message", description = "Returns a greeting message to the user")
    @ApiResponse(responseCode = "200", description = "Successful response")
    @GetMapping("/users")
    public String listUsers(Model model){
        List<UserInfoDto> users = userInfoService.findAllUsers();
        model.addAttribute("users", users);
        return "user-list";
    }
    @Operation(summary = "Get greeting message", description = "Returns a greeting message to the user")
    @ApiResponse(responseCode = "200", description = "Successful response")
    @GetMapping("/user/create")
    public String createUserForm(Model model) {
        UserInfoDto userDto = new UserInfoDto();
        model.addAttribute("User", userDto);
        return "user-create";
    }
    @Operation(summary = "Post create new User", description = "Returns a greeting message to the user")
    @ApiResponse(responseCode = "200", description = "Successful response")
    @PostMapping("/user/create")
    public String saveUser(@ModelAttribute("User") UserInfoDto userDto) {
        userInfoService.saveUser(userDto);
        return "redirect:/users";
    }

    @Operation(summary = "Post create new User", description = "Returns a greeting message to the user")
    @ApiResponse(responseCode = "200", description = "Successful response")
    @GetMapping("/user/edit/{userId}")
    public String editUserForm(@PathVariable("userId") Long userId, Model model) {
        UserInfoDto userDto = userInfoService.findUserById(userId);
        model.addAttribute("User", userDto);
        return "user-edit";
    }

    @Operation(summary = "Post create new User", description = "Returns a greeting message to the user")
    @ApiResponse(responseCode = "200", description = "Successful response")
    @PostMapping("/user/edit/{userId}")
    public String updateUser(@PathVariable("userId") Long userId, @ModelAttribute("User") UserInfoDto userDto) {
        userDto.setId(userId);
        userInfoService.updateUser(userDto);
        return "redirect:/users";
    }

    @GetMapping("/user/delete/{userId}")
    public String getDeleteUser(@PathVariable("userId") Long userId, Model model){
        UserInfoDto userDto = userInfoService.findUserById(userId);
        model.addAttribute("User", userDto);
        return "user-delete";
    }

    @Operation(summary = "Post create new User", description = "Returns a greeting message to the user")
    @ApiResponse(responseCode = "200", description = "Successful response")
    @PostMapping("/user/delete/{userId}")
    public String deleteUser(@PathVariable("userId") Long userId){
        userInfoService.delete(userId);
        return "redirect:/users";
    }

}
