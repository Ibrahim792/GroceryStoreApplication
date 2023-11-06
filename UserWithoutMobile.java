package com.itvedant.grocerystore.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "noMob" ,types = {User.class})
public interface UserWithoutMobile {
    
    String getName();
    String getEmail();
}
