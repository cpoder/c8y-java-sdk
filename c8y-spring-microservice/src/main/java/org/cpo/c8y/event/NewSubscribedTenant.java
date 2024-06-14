package org.cpo.c8y.event;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class NewSubscribedTenant {
    private final String tenant;
}
