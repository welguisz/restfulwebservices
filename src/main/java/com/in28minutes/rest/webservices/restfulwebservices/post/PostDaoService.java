package com.in28minutes.rest.webservices.restfulwebservices.post;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PostDaoService {
    private static List<Post> posts = new ArrayList<>();
    private static int postCount = 3;

//    static {
//        posts.add(new Post(1, "Having a good day in the Garden", UserDaoService.g));
//        posts.add(new Post(2, "What kind of fruit is that?"));
//        posts.add(new Post(3, "Where are we?"));
//    }

    public Post save(Post post) {
        if (post.getId() == null) {
            post.setId(++postCount);
        }
        posts.add(post);
        return post;
    }

//    public List<Post> findAllForUser(int userId) {
//        List<Post> findPosts = posts.stream().filter(p -> p.getUserId() == userId).collect(Collectors.toList());
//        if (findPosts.isEmpty()) {
//            return null;
//        }
//        return findPosts;
//    }

//    public Post findOne(int id, int userId) {
//        Optional<Post> post = posts.stream().filter(p -> p.getId() == id).filter(p -> p.getUserId() == userId).findFirst();
//        if (post.isPresent()) {
//            return post.get();
//        }
//        return null;
//    }
}
