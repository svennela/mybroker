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
@RequestMapping("/v2/service_instances/{instanceId}/service_bindings/{bindingId}")
public class ServiceInstanceBindingController {
    private static final Logger log = LoggerFactory.getLogger(ServiceInstanceBindingController.class);


    @PutMapping
    public ResponseEntity<Map<String, Object>> bind(@PathVariable("instanceId") String instanceId,
                                                    @PathVariable("bindingId") String bindingId) {
        log.info("bind instanceId={}, bindingId={}", instanceId, bindingId);

        Map<String, Object> body = new HashMap<>();



        String username = UUID.randomUUID().toString().replace("-", "");
        String password = UUID.randomUUID().toString().replace("-", "");


        body.put("credentials", "credentials");
        return ResponseEntity.status(HttpStatus.CREATED).body(body);
    }

    @DeleteMapping
    public ResponseEntity<Map<String, Object>> unbind(@PathVariable("instanceId") String instanceId,
                                                      @PathVariable("bindingId") String bindingId) {
        log.info("unbind instanceId={}, bindingId={}", instanceId, bindingId);
        Map<String, Object> body = new HashMap<>();

        return ResponseEntity.ok(body);
    }
}