package br.com.thislucio.tutorial_spring_data_pagination.Controller;

import br.com.thislucio.tutorial_spring_data_pagination.Model.Tweet;
import br.com.thislucio.tutorial_spring_data_pagination.Services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class TweetController {
    @Autowired
    PostService postService;

    @GetMapping
    public List<Tweet> listPosts(Pageable pageable){
        return postService.listPosts(pageable).getContent();
    }
}
