package repositories;

import data.models.Post;
import data.repositories.PostRepositoryImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PostRepositoryImplTest {

   @Test
   public void testThatNoPostIsAvailable() {
      PostRepositoryImpl repo = new PostRepositoryImpl();
      assertEquals(0,repo.count());
   }
   @Test
    public void testThatAPostCanBeSavedInRepository() {
       PostRepositoryImpl repo = new PostRepositoryImpl();
       Post post = new Post();
       repo.save(post);
       assertEquals(1,repo.count());

   }

   @Test
   public void testThatAPostCanBeRetrievedFromRepository() {
      PostRepositoryImpl repo = new PostRepositoryImpl();
      Post post = new Post();
      post.setId(1);
      repo.save(post);
       assertEquals(1,repo.findById(1).getId());
   }

   @Test
    public void testThatAPostCanBeDeletedFromRepository() {
       PostRepositoryImpl repo = new PostRepositoryImpl();
       Post post1 = new Post();
       post1.setId(6);
       repo.save(post1);

       Post post2 = new Post();
       post2.setId(42);
       repo.save(post2);

       Post post3 = new Post();
       post3.setId(91);
       repo.save(post3);

       repo.deleteById(42);
       assertEquals(2,repo.count());
       assertNull(repo.findById(42));
   }

    @Test
    public void testThatAllPostCanBeDeletedInRepository() {
       PostRepositoryImpl repo = new PostRepositoryImpl();
       Post post1 = new Post();
       post1.setId(1);
       repo.save(post1);

       Post post2 = new Post();
       post2.setId(2);
       repo.save(post2);

       repo.deleteAll();
       assertEquals(0,repo.count());

    }

}
