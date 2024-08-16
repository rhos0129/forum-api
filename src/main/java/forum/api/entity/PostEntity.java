package forum.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "post")
@Data
@Entity
public class PostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;

}
