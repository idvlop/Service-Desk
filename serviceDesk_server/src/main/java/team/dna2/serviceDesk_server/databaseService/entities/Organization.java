package team.dna2.serviceDesk_server.databaseService.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "ORGANIZATIONS")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Organization implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "organization_name", unique = true, nullable = false, length = 63)
    private String organizationName;

    @OneToOne
    @JoinColumn(name = "logo_file_id", referencedColumnName = "id")
    private File logoFile;

    @Column(name = "description", length = 1024)
    private String description;

    @Column(name = "registration_date", nullable = false)
    private Timestamp registrationDate;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    @Column(name = "block_date", nullable = false)
    private Timestamp blockDate;

}