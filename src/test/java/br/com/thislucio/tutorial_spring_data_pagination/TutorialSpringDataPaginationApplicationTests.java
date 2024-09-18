package br.com.thislucio.tutorial_spring_data_pagination;

import br.com.thislucio.tutorial_spring_data_pagination.Model.Tweet;
import br.com.thislucio.tutorial_spring_data_pagination.Services.PostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class TutorialSpringDataPaginationApplicationTests {
	static final Tweet TWEET_0 =
			new Tweet(1L, "Se inscreve no canal", "@giulianabezerra");

	static final Tweet TWEET_1 =
			new Tweet(2L, "Ativa as notificações", "@giulianabezerra");

	@Autowired
	PostService postService;

	@Test
	void testListPostPaginated() {
		Pageable pageable = PageRequest.of(0, 2);
		Page<Tweet> pagePost = postService.listPosts(pageable);

		assertEquals(2, pagePost.getContent().size());
		assertEquals(TWEET_0, pagePost.getContent().get(0));
		assertEquals(TWEET_1, pagePost.getContent().get(1));

	}

}
