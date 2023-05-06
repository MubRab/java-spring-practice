package main;

import config.SpringConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var springContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        Comment commentTest = new Comment();
        commentTest.setAuthor("Me");
        commentTest.setText("Hello Spring");

        CommentService commentService = springContext.getBean(CommentService.class);
        commentService.publishComment(commentTest);

    }

}
