package com.practice.DesignModeUsage.serviceDesignMode.proxy_mode.proxyFactory;

import com.practice.DesignModeUsage.serviceDesignMode.proxy_mode.*;

/**
 *   ForumProxy: 使用 Forum
 *   ForumFactoryProxy: 创建 Forum
 */

public class ForumFactoryProxy extends ForumFactory{
    protected ForumFactory factory;
    protected Authorization authorization;
    protected ForumPermissions permissions;

    public ForumFactoryProxy (Authorization authorization, ForumFactory factory, ForumPermissions permissions) {
        this.factory = factory;
        this.authorization = authorization;
        this.permissions = permissions;
    }

    public Forum createForum (String name, String description) throws ForumAlreadyExistsException, UnauthorizedException {
        // 只有 SystemAdmin 才可以创建 Forum
        if (permissions.get(ForumPermissions.SYSTEM_ADMIN)) {
            Forum newForum = factory.createForum(name, description);
            return new ForumProxy(newForum, authorization, permissions);
        } else {
            throw new UnauthorizedException();
        }
    }
}
