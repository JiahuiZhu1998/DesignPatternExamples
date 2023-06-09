package com.practice.DesignModeUsage.serviceDesignMode.proxy_mode;

/**
 * 所有需要修改Forum的, 必须要和 ForumProxy 打交道, 由ForumProxy 进行授权
 */
public class DbForum implements Forum, Cacheable {

    private String name;

    @Override
    public void setName(String name) throws ForumAlreadyExistsException {
        this.name = name;
        // 这里真正将新名称保存到数据库中
        // saveToDb();
    }
}
