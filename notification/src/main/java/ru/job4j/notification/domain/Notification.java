package ru.job4j.notification.domain;

import java.util.Date;

public class Notification {
    private String to;
    private String from;
    private String subject;
    private String body;
    private Date date;

    public Notification() {
    }

    public Notification(String to, String from, String subject, String body) {
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.body = body;
    }

    public Notification(String to, String from, String subject, String body, Date date) {
        this.to = to;
        this.from = from;
        this.subject = subject;
        this.body = body;
        this.date = date;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Notification{"
                + "date=" + date
                + ", to='" + to + '\''
                + ", from='" + from + '\''
                + ", subject='" + subject + '\''
                + ", body='" + body + '\''
                + '}';
    }
}
