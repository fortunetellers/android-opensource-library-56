package jp.mydns.sys1yagi.android.greendaosample;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table TODO.
 */
public class Todo {

    private Long id;
    private String todo;
    /** Not-null value. */
    private java.util.Date addDate;
    private java.util.Date endDate;
    private int status;

    public Todo() {
    }

    public Todo(Long id) {
        this.id = id;
    }

    public Todo(Long id, String todo, java.util.Date addDate, java.util.Date endDate, int status) {
        this.id = id;
        this.todo = todo;
        this.addDate = addDate;
        this.endDate = endDate;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    /** Not-null value. */
    public java.util.Date getAddDate() {
        return addDate;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setAddDate(java.util.Date addDate) {
        this.addDate = addDate;
    }

    public java.util.Date getEndDate() {
        return endDate;
    }

    public void setEndDate(java.util.Date endDate) {
        this.endDate = endDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
