package stoylan.spring.todoapp.Domain;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;

    @Enumerated(value = EnumType.STRING)
    private Status status;

    @Column(name = "created_time")
    private LocalDateTime createdTime;

    @PrePersist
    private void onCreate() {
        createdTime = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }
}
