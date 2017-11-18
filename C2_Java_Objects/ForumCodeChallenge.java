// Add a constructor that accepts a String named topic to Forum.java. Initialize the private field topic in the constructor to the value passed in.
// In User.java, add private fields to store firstName and lastName, and initialize them in the provided constructor. Add public getters for firstName and lastName.
// Add a constructor to ForumPost which accepts a User named author, a String named title, and another String named description. Initialize the corresponding private fields.
// After you uncomment the code in Main.java and Forum.java, fix the code as described in the comments of Main.java. The code in main is attempting to use the code you just fixed.

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//FORUM.JAVA
public class Forum {
  private String topic;

  // TODO: add a constructor that accepts a topic and sets the private field topic
  public Forum(String topic) {
    this.topic = topic;
  }
  

  public String getTopic() {
    return topic;
  }


  // Uncomment this when you are prompted to do so
  public void addPost(ForumPost post) {
    System.out.printf("A new post in %s topic from %s %s about %s is available",
            topic,
            post.getAuthor().getFirstName(),
            post.getAuthor().getLastName(),
            post.getTitle()
    );
  }
}

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// USER.JAVA
public class User {
  // TODO: add private fields for firstName and lastName
  private String firstName;
  private String lastName;

  public User(String firstName, String lastName) {
    // TODO: set and add the private fields
    this.firstName = firstName;
    this.lastName = lastName;

  }

  // TODO: add getters for firstName and lastName
  public String getFirstName() {
    return firstName;
  }
  public String getLastName() {
    return lastName;
  }

}

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// FORUMPOST.JAVA
public class ForumPost {
  private User author;
  private String title;
  private String description;

  // TODO: add a constructor that accepts the author, title and description
  public ForumPost(User author, String title, String description) {
    this.author = author;
    this.title = title;
    this.description = description;
  }

  public User getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }
}

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//MAIN.JAVA
public class Main {

  public static void main(String[] args) {
    System.out.println("Beginning forum example");
    if (args.length < 2) {
      System.out.println("Usage: java Main <first name> <last name>");
      System.err.println("<first name> and <last name> are required");
      System.exit(1);
    }
    // Uncomment this when prompted
    Forum forum = new Forum("Java");
    // TODO: pass in the first name and last name that are in the args parameter
    User author = new User(args[0], args[1]);
    // TODO: initialize the forum post with the user created above and a title and description of your choice
    ForumPost post = new ForumPost(author, "Doofenschmirtz", "Evil Genius");
    forum.addPost(post);

// 
  }

}
