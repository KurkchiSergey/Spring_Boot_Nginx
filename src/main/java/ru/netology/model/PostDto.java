package ru.netology.model;


public class PostDto {
  private long id;
  private String content;

  public PostDto() {
  }

  public PostDto(long id, String content) {
    this.id = id;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  /** Domain -> DTO: то, что отдаётся клиенту. */
  public static PostDto fromPost(Post post) {
    return new PostDto(post.getId(), post.getContent());
  }

  /** DTO -> Domain: то, что приходит от клиента и уходит в service/repository. */
  public Post toPost() {
    return new Post(id, content);
  }
}
