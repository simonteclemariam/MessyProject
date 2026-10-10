

public class User
{
    private final int c_id;
    private String c_nam;


    public User(int i, String n){
        c_id = i;
        if (n == null || n.isEmpty() || n.length() > 100) // Testing length
        {
            return; //If string is invalid, we dont try to store it
        }
        c_nam = n;
    }

    public void setC_nam(String n)
    {
        if (n == null || n.isEmpty())
        {
            return; //If string is invalid, we dont try to store it
        }
        c_nam = n;
    }


    public int geti(){ return c_id; }

    public String getn(){ return c_nam; }


    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return u.c_nam .equals(c_nam) ;
        }
        return false;
    }
}
