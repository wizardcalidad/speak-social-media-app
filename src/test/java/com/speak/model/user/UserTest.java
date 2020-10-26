package com.speak.model.user;

import com.speak.repository.AddressRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.Rollback;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UserTest {
    Logger logger = Logger.getLogger(UserTest.class.getName());

    User user;

    @MockBean
    AddressRepository addressRepository;




    @BeforeEach
    void setUp() {
        user = new User();
    }

    @Test
    @Rollback(value=false)
    void createUserWithAddress(){
        Address myAddress = new Address();

        myAddress.setCity("Lagos");
        myAddress.setCountry("Nigeria");
        myAddress.setHouseNumber("312");
        myAddress.setState("Lagos");
        myAddress.setStreetName("Herbert Macaulay Way Sabo Yaba");
        
    }
}