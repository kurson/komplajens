/*
 * Copyright 2019 Motorola Solutions, Inc.
 * All Rights Reserved.
 * Motorola Solutions Confidential Restricted
 */
package zaliczenie.zaliczenie.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KomplajensController {
    @GetMapping("/komplajens")
    public String komplajens() {
        return "Komplajens";
    }
}
