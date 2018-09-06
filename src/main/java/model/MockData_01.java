package model;

public class MockData_01
{
    private String id;

    private String b;

    private String whatever;

    private String male;

    private String a;

    public String getId ()
    {
        return id;
    }

    public void set1 (String id)
    {
        this.id = id;
    }

    public String getB ()
    {
        return b;
    }

    public void setB (String b)
    {
        this.b = b;
    }

    public String getWhatever ()
    {
        return whatever;
    }

    public void setWhatever (String whatever)
    {
        this.whatever = whatever;
    }

    public String getMale ()
    {
        return male;
    }

    public void setMale (String male)
    {
        this.male = male;
    }

    public String getA ()
    {
        return a;
    }

    public void setA (String a)
    {
        this.a = a;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [1 = "+1+", b = "+b+", whatever = "+whatever+", male = "+male+", a = "+a+"]";
    }
}
