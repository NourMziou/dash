package tech.getarrays.dashboardmanager.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.getarrays.dashboardmanager.model.Dashboard;


public interface DashboardRepo extends JpaRepository<Dashboard, Long> {

    Optional<Dashboard> findDashboardById(Long id);

}
