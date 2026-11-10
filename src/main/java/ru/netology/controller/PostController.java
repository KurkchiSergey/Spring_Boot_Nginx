package ru.netology.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.model.PostDto;
import ru.netology.service.PostService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/posts")
public class PostController {
  private final PostService service;

  public PostController(PostService service) {
    this.service = service;
  }

  @GetMapping
  public List<PostDto> all() {
    return service.all().stream()
        .map(PostDto::fromPost)
        .collect(Collectors.toList());
  }

  @GetMapping("/{id}")
  public PostDto getById(@PathVariable long id) {
    return PostDto.fromPost(service.getById(id));
  }

  @PostMapping
  public PostDto save(@RequestBody PostDto postDto) {
    return PostDto.fromPost(service.save(postDto.toPost()));
  }

  @DeleteMapping("/{id}")
  public void removeById(@PathVariable long id) {
    service.removeById(id);
  }
}
