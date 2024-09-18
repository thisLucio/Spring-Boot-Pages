package br.com.thislucio.tutorial_spring_data_pagination.Services;

import br.com.thislucio.tutorial_spring_data_pagination.Model.Tweet;
import br.com.thislucio.tutorial_spring_data_pagination.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public Page<Tweet> listPosts(Pageable pageable){
        return postRepository.findAll(pageable);
    }
}
