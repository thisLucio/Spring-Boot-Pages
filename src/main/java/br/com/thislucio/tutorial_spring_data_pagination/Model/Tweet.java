package br.com.thislucio.tutorial_spring_data_pagination.Model;

import java.io.Serializable;


public record Tweet(Long id, String content, String author) implements Serializable {

}
