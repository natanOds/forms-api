package com.exquisitecode.apiforms.config;

import com.exquisitecode.apiforms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.exquisitecode.apiforms.domain.User;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... arg0) throws Exception {

        userRepository.deleteAll();

        User natan = new User(null, "natan santos", "natan@gmail.com");
        User kleber = new User(null, "kleber henrique", "kleber@gmail.com");
        User duda = new User(null, "duda marques", "duda@gmail.com");

        userRepository.saveAll(Arrays.asList(natan, kleber, duda));
    }
}
