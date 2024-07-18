package data.comments;

import data.models.Comment;
import data.models.Post;

import java.util.List;

public interface CommentsRepo {
    void addComment(Comment comment);
    void removeComment(Comment comment);
    Comment findComment(int id);
    List<Comment> findCommentsByPost(Post post);
    void deleteById(int id);
    void deleteAll();
    long countComments();
    Comment findPostById(int id);
    List<Comment> findAllComments();
    Post saveComment(Post comment);
}
