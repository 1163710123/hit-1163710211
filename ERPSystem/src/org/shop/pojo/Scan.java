package org.shop.pojo;


public class Scan
{
    private int u_id;//用户id
    private int h_id;//货物id

    public Scan(int u_id, int h_id)
    {
        this.u_id = u_id;
        this.h_id = h_id;
    }

    public int getU_id()
    {
        return u_id;
    }

    public void setU_id(int u_id)
    {
        this.u_id = u_id;
    }

    public int getH_id()
    {
        return h_id;
    }

    public void setH_id(int h_id)
    {
        this.h_id = h_id;
    }


    @Override
    public String toString()
    {
        return "Scan{" +
                "u_id=" + u_id +
                ", h_id=" + h_id +
                '}';
    }
}
