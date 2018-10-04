package ${package}.${artifactId}.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ${package}.${artifactId}.domain.ApplicationItem;
import java.util.List;

@Repository
public interface ApplicationRepository extends JpaRepository<ApplicationItem, Long> {

    List<ApplicationItem> findApplicationEntriesByApplicationCode(String applicationCode);

}
