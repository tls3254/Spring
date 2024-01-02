package com.sparta.springprepare;

import lombok.*;

@Getter
@Setter
//@NoArgsConstructor
//@AllArgsConstructor
@RequiredArgsConstructor //final을 달고 있는 것을 생성 해 준다.
public class Memo {
    private String username;
    private String contents;
}