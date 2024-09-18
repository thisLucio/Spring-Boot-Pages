package br.com.thislucio.tutorial_spring_data_pagination.Repository;

import br.com.thislucio.tutorial_spring_data_pagination.Model.Tweet;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends PagingAndSortingRepository<Tweet, Long> {
}
