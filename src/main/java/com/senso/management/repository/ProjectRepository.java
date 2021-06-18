package com.senso.management.repository;


import com.senso.management.dto.ProjectShowDTO;
import com.senso.management.model.Category;
import com.senso.management.model.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

    @Query( "select distinct p " +
            "from Project p join p.individuels i " +
            "where (i.id=:l or :l is null ) " +
            "AND (p.category = :c or :c is null) ")
    Page<ProjectShowDTO> productFilter(Pageable p, @Param("l") Long l, @Param("c") Category c );
}
