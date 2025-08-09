package com.user;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.user.model.User;
import com.user.repository.UserRepository;
import com.user.service.UserServivceImpl;

@SpringBootTest
class UserAssessmentApplicationTests {

    @Mock
    private UserRepository repo;

    @InjectMocks
    private UserServivceImpl userService;

    @Test
    void testGetUserByIdFound() {
        User user = new User();
        user.setUserId(1L);
        user.setName("venu");
        user.setPhone("9797979797");

        when(repo.findById(1L)).thenReturn(Optional.of(user));

        User result = userService.getuserbyid(1L);

        assertNotNull(result);
        assertEquals("venu", result.getName());
    }
    
    @Test
    void testAddUser() {
        User user = new User();
        user.setUserId(1L);
        user.setName("venu");
        user.setPhone("9797979797");

        when(repo.save(user)).thenReturn(user);
        when(repo.findById(1L)).thenReturn(Optional.of(user));

        User result = userService.addUser(user);

        assertEquals("venu", result.getName());
    }

    @Test
    void testUpdateUserSuccess() {
        User updatedUser = new User();
        updatedUser.setUserId(1L);
        updatedUser.setName("venu_updated");
        updatedUser.setPhone("8888888888");

        when(repo.existsById(1L)).thenReturn(true);
        when(repo.save(updatedUser)).thenReturn(updatedUser);
        when(repo.findById(1L)).thenReturn(Optional.of(updatedUser));

        User result = userService.updateuser(updatedUser);

        assertEquals("venu_updated", result.getName());
        assertEquals("8888888888", result.getPhone());
    }

    @Test
    void testDeleteUserSuccess() {
        when(repo.existsById(1L)).thenReturn(true);
        doNothing().when(repo).deleteById(1L);
        when(repo.findById(1L)).thenReturn(Optional.empty());  

        userService.deleteuser(1L);

        User result = userService.getuserbyid(1L);

        assertNull(result);
    }

}
