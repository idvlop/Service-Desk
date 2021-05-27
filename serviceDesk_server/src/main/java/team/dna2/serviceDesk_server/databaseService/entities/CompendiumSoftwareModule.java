package team.dna2.serviceDesk_server.databaseService.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "COMPENDIUM_SOFTWARE_MODULES")
@Data
@NoArgsConstructor
public class CompendiumSoftwareModule implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "software_id", referencedColumnName = "id", nullable = false)
    private CompendiumSoftware software;

    @Column(name = "module_name", nullable = false, length = 128)
    private String moduleName;

    @Column(name = "description", length = 1024)
    private String description;
}
