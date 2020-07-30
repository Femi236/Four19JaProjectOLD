package com.example.demo.Controllers;

import com.example.demo.Entity.Steps;
import com.example.demo.Repositories.StepsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class StepsController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private StepsRepository stepsRepository;

    @PostMapping(path="/addStep") // Map ONLY POST Requests
    public @ResponseBody String addNewStep (@RequestParam Integer post
            , @RequestParam Integer stepNumber, @RequestParam String instruction) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Steps s = new Steps();
        s.setPost(post);
        s.setStepNumber(stepNumber);
        s.setInstruction(instruction);
        stepsRepository.save(s);
        return "Saved";
    }

    @GetMapping(path="/allSteps")
    public @ResponseBody Iterable<Steps> getAllSteps() {
        // This returns a JSON or XML with the users
        return stepsRepository.findAll();
    }
}