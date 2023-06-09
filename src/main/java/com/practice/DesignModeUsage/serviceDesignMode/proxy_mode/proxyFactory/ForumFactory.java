package com.practice.DesignModeUsage.serviceDesignMode.proxy_mode.proxyFactory;

import com.practice.DesignModeUsage.serviceDesignMode.proxy_mode.DbForum;
import com.practice.DesignModeUsage.serviceDesignMode.proxy_mode.Forum;
import com.practice.DesignModeUsage.serviceDesignMode.proxy_mode.ForumAlreadyExistsException;
import com.practice.DesignModeUsage.serviceDesignMode.proxy_mode.UnauthorizedException;

public class ForumFactory {
    public Forum createForum(String name, String description) throws ForumAlreadyExistsException, UnauthorizedException {
        DbForum forum = new DbForum();
        return forum;
    }
}
