package data.comments;

import data.models.Comment;
import data.models.Post;

import java.util.List;

public class CommentsImpl implements CommentsRepo{
    private List<Comment> comments;

    @Override
    public void addComment(Comment comment) {
        for (Comment c : comments) {
            Comment.add(comment);
        }
    }

    @Override
    public void removeComment(Comment comment) {

    }

    @Override
    public Comment findComment(int id) {
        for (Comment comment : comments) {
            if (comment.getId() == id) {
                return comment;
            }
        }
        return null;
    }

    @Override
    public List<Comment> findCommentsByPost(Post post) {
        return List.of();
    }

    @Override
    public void deleteById(int id) {
        for(Comment comment : comments) {
            if(comment.getId() == id) {
                comments.remove(comment);
            }
        }
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public long countComments() {
        return 0;
    }

    @Override
    public Comment findPostById(int id) {
        for (Comment c : comments) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    @Override
    public List<Comment> findAllComments() {
        return List.of();
    }

    @Override
    public Post saveComment(Post comment) {
        return null;
    }
}
