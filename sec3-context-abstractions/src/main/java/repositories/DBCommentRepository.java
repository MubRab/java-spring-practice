package repositories;

import model.Comment;
import org.springframework.stereotype.Repository;

/*
 * This annotation explicitly tells the developer the role of this component.
 * In this case, this component performs a repository type of action.
 */
@Repository
public class DBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment in database: " + comment.getText());
    }
}
