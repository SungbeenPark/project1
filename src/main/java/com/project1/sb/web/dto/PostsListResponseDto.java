package com.project1.sb.web.dto;

import com.project1.sb.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {


    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    @Builder
    public PostsListResponseDto(Posts entity){
        this.id = entity.getId();
        this.title=entity.getTitle();
        this.author=entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }
}
