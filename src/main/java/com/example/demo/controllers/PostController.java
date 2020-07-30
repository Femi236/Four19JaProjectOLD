package com.example.demo.controllers;

import com.example.demo.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/p") // This means URL's start with /demo (after Application path)
public class PostController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private com.example.demo.Repositories.PostRepository postRepository;

    @PostMapping(path="/addPost") // Map ONLY POST Requests
    public @ResponseBody
    String addNewUser (@RequestParam Integer postID,@RequestParam Integer user,@RequestParam Integer timeTaken) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Post p = new Post();
       p.setPostID(postID);
       p.setUser(user);
       p.setTimeTaken(timeTaken);
        postRepository.save(p);
        return "Saved";
    }

    @GetMapping(path="/allPosts")
    public @ResponseBody Iterable<Post> getAllPosts() {
        // This returns a JSON or XML with the users
        return postRepository.findAll();
    }
}