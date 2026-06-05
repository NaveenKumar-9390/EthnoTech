class Post {
    String content;
    Post prev, next;

    Post(String content) {
        this.content = content;
        prev = null;
        next = null;
    }
}

public class SocialMediaFeed {

    Post head, tail;

    // Insert Post at End
    void insertPost(String content) {
        Post newPost = new Post(content);

        if (head == null) {
            head = tail = newPost;
        } else {
            tail.next = newPost;
            newPost.prev = tail;
            tail = newPost;
        }
    }

    // Insert Sponsored Post (Ad)
    void insertSponsoredPost(String ad) {
        insertPost("Sponsored: " + ad);
    }

    // Delete Post
    void deletePost(String content) {
        Post temp = head;

        while (temp != null) {

            if (temp.content.equals(content)) {

                if (temp == head)
                    head = temp.next;

                if (temp == tail)
                    tail = temp.prev;

                if (temp.prev != null)
                    temp.prev.next = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;

                System.out.println("Post Deleted");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Post Not Found");
    }

    // Display Feed
    void displayFeed() {
        Post temp = head;

        System.out.println("\nSocial Media Feed:");

        while (temp != null) {
            System.out.println(temp.content);
            temp = temp.next;
        }
    }

    // Next Post
    void nextPost(Post current) {
        if (current != null && current.next != null)
            System.out.println("Next Post: " + current.next.content);
        else
            System.out.println("No Next Post");
    }

    // Previous Post
    void prevPost(Post current) {
        if (current != null && current.prev != null)
            System.out.println("Previous Post: " + current.prev.content);
        else
            System.out.println("No Previous Post");
    }

    public static void main(String[] args) {

        SocialMediaFeed feed = new SocialMediaFeed();

        feed.insertPost("Post 1 - Good Morning");
        feed.insertPost("Post 2 - Java Learning");
        feed.insertSponsoredPost("Buy New Mobile");
        feed.insertPost("Post 3 - Vacation Pics");

        feed.displayFeed();

        System.out.println("\nCurrent Post: Java Learning");

        Post current = feed.head.next;

        feed.nextPost(current);
        feed.prevPost(current);

        feed.deletePost("Sponsored: Buy New Mobile");

        feed.displayFeed();
    }
}