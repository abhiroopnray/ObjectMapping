package objmodel;

import com.fasterxml.jackson.annotation.JsonFormat;

//@JsonFormat(shape=JsonFormat.Shape.ARRAY)
public class ApiFetchModel
{
    private String id;

    private String title;

    private String userId;

    private boolean completed;

    public ApiFetchModel() {
    }


    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getUserId ()
    {
        return userId;
    }

    public void setUserId (String userId)
    {
        this.userId = userId;
    }

    public boolean getCompleted ()
    {
        return completed;
    }

    public void setCompleted (boolean completed)
    {
        this.completed = completed;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", title = "+title+", userId = "+userId+", completed = "+completed+"]";
    }
}
