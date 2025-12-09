package com.example.demo.controller;

import com.example.demo.entity.Basket;
import com.example.demo.repository.BasketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BasketController {

    @Autowired
    private BasketRepository basketRepository;

    @GetMapping("/basket/view")
    public String viewBasket(Model model) {
        List<Basket> basketItems = basketRepository.findAll();
        model.addAttribute("basketItems", basketItems);
        return "basket"; // loads basket.html from templates folder
    }
}
