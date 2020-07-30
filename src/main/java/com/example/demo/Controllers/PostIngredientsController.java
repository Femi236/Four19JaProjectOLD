package com.example.demo.Controllers;

import com.example.demo.Entity.PostIngredients;
import com.example.demo.Repositories.PostIngredientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)

public class PostIngredientsController {
    @Autowired // This means to get the bean called postIngredientsRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private PostIngredientsRepository postIngredientsRepository;

    @PostMapping(path="/addPostIngredient") // Map ONLY POST Requests
    public @ResponseBody String addNewPostIngredient (@RequestParam long post, @RequestParam long ingredient,
                                               @RequestParam String amount) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        PostIngredients p = new PostIngredients();
        p.setPost(post);
        p.setIngredient(ingredient);
        p.setAmount(amount);
        postIngredientsRepository.save(p);
        return "Saved";
    }

    @GetMapping(path="/allPostIngredient")
    public @ResponseBody Iterable<PostIngredients> getAllPostIngredients() {
        // This returns a JSON or XML with the post ingredients
        return postIngredientsRepository.findAll();
    }
}
