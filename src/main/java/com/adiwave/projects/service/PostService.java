package com.adiwave.projects.service;

import com.adiwave.projects.dao.entity.Post;
import com.adiwave.projects.dao.repository.PostRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;

    PostService(final PostRepository postRepository){
        this.postRepository = postRepository;
    }

    @Transactional
    public Post savePost(String title, String text, String category, int authorId) {
        Post post = new Post();
        post.setTitle(title);
        post.setText(text);
        post.setCategory(category);
        post.setAuthorId(authorId);
        return this.postRepository.save(post);
    }

    @Transactional(readOnly = true)
    public List<Post> getRecentPosts(int pageOffset, int size) {
        Pageable paging = PageRequest.of(pageOffset, size);
        return this.postRepository.findAll(paging).getContent();
    }
}
