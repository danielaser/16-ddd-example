package com.buildingblocks.industries.infra.mainservice.controllers;

import com.buildingblocks.industries.application.industry.activatemarketlink.ActivateMarketLinkRequest;
import com.buildingblocks.industries.application.industry.activatemarketlink.ActivateMarketLinkUseCase;
import com.buildingblocks.industries.application.shared.industryUtils.IndustryResponse;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/activate-market")
public class ActivateMarketLinkController {
    private final ActivateMarketLinkUseCase useCase;

    public ActivateMarketLinkController(ActivateMarketLinkUseCase useCase) {
        this.useCase = useCase;
    }

    @PutMapping
    public Mono<IndustryResponse> execute(@RequestBody ActivateMarketLinkRequest request) {
        return useCase.execute(request);
    }
}
