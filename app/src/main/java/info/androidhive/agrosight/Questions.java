package info.androidhive.agrosight;

public class Questions {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String title;
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getUpvote() {
        return upvote;
    }

    public void setUpvote(int upvote) {
        this.upvote = upvote;
    }

    public int getDownvote() {
        return downvote;
    }

    public void setDownvote(int downvote) {
        this.downvote = downvote;
    }

    public String question;
    public String firstname;
    public String lastname;
    public int upvote;
    public int downvote;
    public Questions() {

    }
    public Questions(String title,String question,String firstname,String lastname, int upvote, int downvote) {
        this.title=title;
        this.question = question;
        this.firstname = firstname;
        this.lastname = lastname;
        this.upvote= upvote;
        this.downvote = downvote;
    }

}
