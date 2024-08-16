package forum.api.controller;

import forum.api.entity.PostEntity;
import forum.api.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("forum/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<PostEntity> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping
    public PostEntity createPost(@RequestBody PostEntity post) {
        return postService.createPost(post);
    }

    @DeleteMapping("/{id}")
    public void deletePost(@PathVariable Long id) {
        postService.deletePost(id);
    }

}
