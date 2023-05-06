package proxies;

import model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
/*
 * We are setting the implementation name using the @Qualifier annotation
 * This name can then be used to perform the dependency injection when more than
 * one class implements the same interface
 */
@Qualifier("EMAIL")
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending email for comment: " + comment.getText());
    }
}
