package forum.api.service;

import forum.api.entity.PostEntity;
import forum.api.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<PostEntity> getAllPosts() {
        return postRepository.findAll();
    }

    public PostEntity createPost(PostEntity post) {
        return postRepository.save(post);
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }
}
