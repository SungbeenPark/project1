package com.project1.sb.web.dto;

import com.project1.sb.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {

    private String content;
    private String title;

    @Builder
    public PostsUpdateRequestDto(String title, String content, String author){
        this.title=title;
        this.content=content;
    }

}
