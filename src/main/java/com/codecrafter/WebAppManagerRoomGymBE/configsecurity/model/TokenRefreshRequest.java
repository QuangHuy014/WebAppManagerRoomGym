package com.codecrafter.WebAppManagerRoomGymBE.configsecurity.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TokenRefreshRequest {
    private String refreshToken;
}
