package org.example.demorest.controller;

import jakarta.servlet.http.HttpSession;
import org.example.demorest.dto.UserResponseDto;
import org.example.demorest.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/user/session")
public class UserSessionController {

    private UserService service;

    private HttpSession session;

    public UserSessionController(UserService service, HttpSession httpSession) {
        this.service = service;
        session = httpSession;
    }

    @GetMapping("/fav/{id}")
    public ResponseEntity<String> addToFav (@PathVariable long id){
        List<Long> favId = (List<Long>) session.getAttribute("fav");

        if(favId == null){
            favId = new ArrayList<>();
        }

        favId.add(service.get(id).getId());

        session.setAttribute("fav",favId);
        return ResponseEntity.ok("User add to favorite");
    }

    @GetMapping("/getfav")
    public ResponseEntity<List<UserResponseDto>> getFav (){
        List<Long> favId = (List<Long>) session.getAttribute("fav");
        List<UserResponseDto> userResponseDtos = new ArrayList<>();

        if(favId != null){
            for (long id : favId){
                userResponseDtos.add(service.get(id));
            }
        }else{
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new ArrayList<>());
        }
        return ResponseEntity.ok(userResponseDtos);
    }


}
