package com.example.demo.controllers;

import com.example.demo.entities.Comment;
import com.example.demo.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path = "/demo") // This means URL's start with /demo (after Application path)

public class CommentController {
    @Autowired // This means to get the bean called commentRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private CommentRepository commentRepository;

    @PostMapping(path = "/addComment") // Map ONLY POST Requests
    public @ResponseBody String addNewComment(@RequestParam long commenter, @RequestParam String comment,
                                               @RequestParam long post) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Comment c = new Comment();
        c.setCommenter(commenter);
        c.setComment(comment);
        c.setPost(post);
        commentRepository.save(c);
        return "Saved";
    }

    @GetMapping(path = "/allComment")
    public @ResponseBody Iterable<Comment> getAllComment() {
        // This returns a JSON or XML with the comments
        return commentRepository.findAll();
    }
}
