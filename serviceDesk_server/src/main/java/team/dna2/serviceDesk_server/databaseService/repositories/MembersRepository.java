package team.dna2.serviceDesk_server.databaseService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import team.dna2.serviceDesk_server.databaseService.entities.Member;
import team.dna2.serviceDesk_server.databaseService.entities.Organization;
import team.dna2.serviceDesk_server.databaseService.entities.User;

@Repository
public interface MembersRepository extends JpaRepository<Member, Long> {
    @Query("update Member set isOwner=false where id = :id")
    void updateMemberOwnershipById (Long id);

    @Query("update Member set isOwner=true where id=:id")
    void setMemberOwnershipById (Long id);

    Long findMemberIdByOrganization_IdAndIsOwnerTrue(Long organizationId);

    Long findMembersByOrganization_Id(Long orgId);

    Long findMemberByUserDetails_Id(Long userId);
}
