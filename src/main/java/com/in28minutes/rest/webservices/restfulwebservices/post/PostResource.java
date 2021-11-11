package com.in28minutes.rest.webservices.restfulwebservices.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostResource {
    private PostDaoService service;

    @Autowired
    public PostResource(final PostDaoService service) {
        this.service = service;
    }

    //GET /users/{id}/posts
//    @GetMapping(path="/users/{id}/posts")
//    public List<Post> retrieveAllPosts(@PathVariable int id) {
//        List<Post> posts = service.findAllForUser(id);
//        if (posts == null) {
//            throw new PostNotFoundException("id-"+id);
//        }
//        return posts;
//    }

//    //POST /users/{id}/posts
//    @PostMapping(path="/users/{id}/posts")
//    public ResponseEntity<Object> createPost(@PathVariable int id, @RequestBody Post post) {
//        post.setUserId(id);
//        Post savedPost = service.save(post);
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
//                .path("/{post_id}")
//                .buildAndExpand(savedPost.getId()).toUri();
//        return ResponseEntity.created(location).build();
//    }

    //GET /users/{id}/posts/{post_id}
//    @GetMapping(path="/users/{id}/posts/{post_id}")
//    public Post getSinglePost(@PathVariable int post_id, @PathVariable int id) {
//        Post post = service.findOne(id, post_id);
//        if (post == null) {
//            throw new PostNotFoundException("id-"+id+", post_id-"+post_id);
//        }
//        return post;
//    }

}
