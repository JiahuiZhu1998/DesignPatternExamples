package com.practice.DesignModeUsage.serviceDesignMode.proxy_mode;

public interface Forum {
    void setName(String name) throws ForumAlreadyExistsException, UnauthorizedException;
}
