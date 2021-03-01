package mooc;

public class Person
{
    private String myName;
    public Person(String name)
    {
        if (null == name)
            throw new IllegalArgumentException("name is null");
        myName = name;
    }

    Person() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
       
    public String getName() { return myName;  }
    
    @Override
    public String toString() { return "Student: " + getName(); }

}
