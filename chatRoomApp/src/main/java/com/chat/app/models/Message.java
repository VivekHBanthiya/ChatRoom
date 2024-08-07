package com.chat.app.models;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Message {
    private String name;
    private String content;
}
