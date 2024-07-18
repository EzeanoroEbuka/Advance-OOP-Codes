package data.repositories;

import data.models.Post;

import java.util.ArrayList;
import java.util.List;


public class PostRepositoryImpl implements PostRepository {

    private static List<Post> posts = new ArrayList<Post>();
    private int size = 0;


    @Override
    public Post save(Post post) {
//        int newId = generateId();
//        post.setId(newId);
        posts.add(post);
        size++;
        return post;
    }
    private int generateId() {
        return posts.size() + 1;
    }
    @Override
    public void deleteAll() {
        posts.clear();
        size = 0;
    }
    @Override
    public void deleteById(int id) {
        for (Post post : posts) {
            if (id == post.getId()){
                posts.remove(post);
                size--;
            }
        }
    }
    @Override
    public long count() {
        return size;
    }
    @Override
    public List<Post> findAll() {
        return posts;
    }
    @Override
    public Post findById(int id) {
        for (Post post : posts) {
            if (post.getId() == id) {
                return post;
            }
        }
        return null;
    }
}