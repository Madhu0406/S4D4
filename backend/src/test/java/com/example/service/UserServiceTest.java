package com.example.service;

import com.example.email.Email;
import com.example.email.EmailSender;
import com.example.model.User;
import com.example.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock private UserRepository userRepository;
    @Mock private EmailSender emailSender;
    @InjectMocks private UserService userService;

    @Test
    void handleMissingAndThenSendEmail() {
        User user = new User("1", "Alice");

        when(userRepository.findById("1"))
                .thenReturn(Optional.empty())
                .thenReturn(Optional.of(user));

        assertThrows(UserNotFoundException.class, () -> userService.findAndEmail("1"));

        userService.findAndEmail("1");

        ArgumentCaptor<Email> captor = ArgumentCaptor.forClass(Email.class);
        verify(emailSender).send(captor.capture());

        Email email = captor.getValue();
        assert(email.getSubject().equals("Welcome"));
        assert(email.getMessage().equals("Hello Alice"));
    }
}
