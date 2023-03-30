package com.exquisitecode.apiforms.config;

import com.exquisitecode.apiforms.domain.Post;
import com.exquisitecode.apiforms.repository.PostRepository;
import com.exquisitecode.apiforms.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.exquisitecode.apiforms.domain.User;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;
    @Override
    public void run(String... arg0) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User natan = new User(null, "natan santos", "natan@gmail.com");
        User kleber = new User(null, "kleber henrique", "kleber@gmail.com");
        User duda = new User(null, "duda marques", "duda@gmail.com");

        Post post1 = new Post(null, sdf.parse("29/03/2023"), "Partiu Londres", "Partindo me aventurar em Londres", natan);
        Post post2 = new Post(null, sdf.parse("29/03/2023"), "ComicCom aguarde", "Finalmente chegando nesse evento", natan);


        userRepository.saveAll(Arrays.asList(natan, kleber, duda));
        postRepository.saveAll(Arrays.asList(post1, post2));
    }
}
