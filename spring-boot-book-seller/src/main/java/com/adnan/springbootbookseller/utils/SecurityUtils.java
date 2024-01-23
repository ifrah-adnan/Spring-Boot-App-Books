package com.adnan.springbootbookseller.utils;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

/**
 * @author Dell Latitude 5420
 * IFRAH soumia
 **/
public class SecurityUtils {
    public static final  String ROLE_PREFIX = "ROLE_";
    public static SimpleGrantedAuthority convertToAuthority(String role){
        String formattedRole = role.startsWith(ROLE_PREFIX)?role:ROLE_PREFIX+role;
    }

}
