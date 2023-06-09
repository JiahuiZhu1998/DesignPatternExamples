package com.practice.DesignModeUsage.serviceDesignMode.proxy_mode;

public class ForumProxy implements Forum {
    private ForumPermissions permissions;
    private Forum forum;
    private Authorization authorization;

    // Constructor
    public ForumProxy (Forum forum, Authorization authorization, ForumPermissions permissions) {
        this.forum = forum;
        this.authorization = authorization;
        this.permissions = permissions;
    }

    public void setName(String name) throws ForumAlreadyExistsException, UnauthorizedException {
        // 只有是系统或者论坛管理者才可以修改名称
        if (permissions.isSystemOrForumAdmin()) {
            forum.setName(name);
        } else {
            throw new UnauthorizedException();
        }
    }
}
