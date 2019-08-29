package com.every.every.controller;

import com.every.every.entity.Item;
import com.every.every.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

    private final ItemService itemService;
    @Autowired
    public MainController(ItemService itemService) {
        this.itemService = itemService;
    }


    @PostMapping("/item")
    public Item save(Item item) {
        return itemService.save(item);
    }


}
