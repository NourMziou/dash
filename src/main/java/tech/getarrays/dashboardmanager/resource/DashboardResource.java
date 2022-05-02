package tech.getarrays.dashboardmanager.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getarrays.dashboardmanager.model.Dashboard;
import tech.getarrays.dashboardmanager.service.DashboardService;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
public class DashboardResource {
    private final DashboardService dashboardService;

    public DashboardResource(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Dashboard>> getAllDashboards () {
        List<Dashboard> dashboards = dashboardService.findAllDashboards();
        return new ResponseEntity<>(dashboards, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Dashboard> getDashboardById (@PathVariable("id") Long id) {
        Dashboard dashboard = dashboardService.findDashboardById(id);
        return new ResponseEntity<>(dashboard, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Dashboard> addEmployee(@RequestBody Dashboard dashboard) {
        Dashboard newDashboard = dashboardService.addDashboard(dashboard);
        return new ResponseEntity<>(newDashboard, HttpStatus.CREATED);
    }
}
