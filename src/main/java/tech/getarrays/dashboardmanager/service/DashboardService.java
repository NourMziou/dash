package tech.getarrays.dashboardmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.getarrays.dashboardmanager.exception.DashboardNotFoundException;
import tech.getarrays.dashboardmanager.model.Dashboard;
import tech.getarrays.dashboardmanager.repo.DashboardRepo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class DashboardService {
    private final DashboardRepo dashboardrepo;

    
    @Autowired
    public DashboardService(DashboardRepo dashboardrepo) {
        this.dashboardrepo = dashboardrepo;
    }

    public Dashboard addDashboard(Dashboard dashboard) {
        dashboard.setDashboardCode(UUID.randomUUID().toString());
        return dashboardrepo.save(dashboard);
    }

    public List<Dashboard> findAllDashboards() {
        return dashboardrepo.findAll();
    }

    public Dashboard updateEmployee(Dashboard dashboard) {
        return dashboardrepo.save(dashboard);
    }

    public Dashboard findDashboardById(Long id) {
        return dashboardrepo.findDashboardById(id)
                .orElseThrow(() -> new DashboardNotFoundException("User by id " + id + " was not found"));
    }}