package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.Entry.User;
import net.engineeringdigest.journalApp.Repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

@SpringBootTest
public class UserDetailServiceImplTest {

//    @Autowired
//    private UserDetailServiceImpl userDetailServiceImpl;
//
//    @Injectmocks
//    private UserDetailServiceImpl userDetailServiceImpl;
//
//    @MockBean
//    private UserRepository userRepository;
//
//    @Test
//    void loadUserByUsernameTest(){
//        when(userRepository.findByUserName(ArgumentMatchers.anyString()))
//                .thenReturn(User.builder()
//                        .username("Ram").password("asgagsdadg")
//                        .roles(String.valueOf(new ArrayList<>())).build());
//        UserDetails user = userDetailServiceImpl.loadUserByUsername("Ram");
//        Assertions.assertNotNull(user);
//    }
}


