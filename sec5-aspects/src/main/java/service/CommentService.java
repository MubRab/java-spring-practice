package service;

import aspects.SecurityLog;
import model.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public boolean addComment(Comment comment) {
        logger.info("Adding comment: \"" + comment.getText() + "\" by: " + comment.getAuthor());
        return true;
    }

    @SecurityLog
    public boolean deleteComment(Comment comment) {
        logger.info("Deleting comment: \"" + comment.getText() + "\" by: " + comment.getAuthor());
        return true;
    }

    public boolean publishComment(Comment comment) {
        logger.info("Publishing comment: \"" + comment.getText() + "\" by: " + comment.getAuthor());
        return true;
    }
}
