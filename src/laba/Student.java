package laba;

import java.util.Date;

public class Student {
    private int id;
    private String fio;
    private Date data;
    private String fak;




    public Student( int id,String fio,Date data,String fak)
    {
        this.id=id;
        this.fio=fio;
        this.data=data;
        this.fak=fak;

    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }


    public String getFak() {
        return fak;
    }

    public void setFak(String fak) {
        this.fak = fak;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
