// The method getTitleFromObject will be called and passed a String and/or a com.example.BlogPost. For this first task, return the object obj type casted as a String if it is in fact a String. I've included BlogPost.java for your reference only.
// Now make sure that if a com.example.BlogPost is passed in for obj that you then cast it to a BlogPost. Return the results of the getTitle method on the newly type-casted BlogPost instance. 

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//TYPECASTCHECKER.JAVA
import com.example.BlogPost;

public class TypeCastChecker {
  /***************
  I have provided 2 hints for this challenge.
  Change `false` to `true` in one line below, then click the "Check work" button to see the hint.
  NOTE: You must set all the hints to false to complete the exercise.
  ****************/
  public static boolean HINT_1_ENABLED = false;
  public static boolean HINT_2_ENABLED = false;
                              
  public static String getTitleFromObject(Object obj) {
    // Fix this result variable to be the correct string.
    String result = "";
    if(obj instanceof String) {
      return (String) obj;
    }

    if (obj instanceof BlogPost) {
      BlogPost blog = (BlogPost) obj;
      result = blog.getTitle();
    }
    
//Now make sure that if a com.example.BlogPost is passed in for obj that you then cast it to a BlogPost. 
  //Return the results of the getTitle method on the newly type-casted BlogPost instance. 

    
    return result;
  }
}

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// COM/EXAMPLE/BLOGPOST.JAVA
package com.example;

import java.util.Date;

public class BlogPost {
    private String mAuthor;
    private String mTitle;
    private String mBody;
    private String mCategory;
    private Date mCreationDate;

    public BlogPost(String author, String title, String body, String category, Date creationDate) {
      mAuthor = author;
      mTitle = title;
      mBody = body;
      mCategory = category;
      mCreationDate = creationDate;
    }
    
    public String getAuthor() {
      return mAuthor;
    }
    
    public String getTitle() {
      return mTitle;
    }
    
    public String getBody() {
      return mBody;
    }
    
    public String getCategory() {
      return mCategory;
    }
    
    public Date getCreationDate() {
      return mCreationDate;
    }
}