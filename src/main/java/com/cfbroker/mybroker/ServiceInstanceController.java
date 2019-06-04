package com.cfbroker.mybroker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/v2/service_instances/{instanceId}")
public class ServiceInstanceController {
    private static final Logger log = LoggerFactory.getLogger(ServiceInstanceController.class);



    @PutMapping
    public ResponseEntity<Map<String, Object>> provisioning(@PathVariable("instanceId") String instanceId) {
        log.info("Provisioning instanceId={}", instanceId);
        Map<String, Object> body = new HashMap<>();

        return ResponseEntity.status(HttpStatus.CREATED).body(body);
    }

    @PatchMapping
    public ResponseEntity<Map<String, Object>> update(@PathVariable("instanceId") String instanceId) {
        Map<String, Object> body = new HashMap<>();
        return ResponseEntity.ok(body);
    }

    @DeleteMapping
    public ResponseEntity<Map<String, Object>> deprovisioning(@PathVariable("instanceId") String instanceId) {
        log.info("Deprovisioning instanceId={}", instanceId);
        Map<String, Object> body = new HashMap<>();
        return ResponseEntity.ok(body);
    }
}