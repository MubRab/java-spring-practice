package main;

import config.AppConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CommentService;
import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        var appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CommentService cs = appContext.getBean(CommentService.class);

        Comment comment = new Comment("Test comment", "John");

        logger.info("Adding comment: " + cs.addComment(comment));
        logger.info("Publishing comment: " + cs.publishComment(comment));
        logger.info("Deleting comment: " + cs.deleteComment(comment));
    }
}
