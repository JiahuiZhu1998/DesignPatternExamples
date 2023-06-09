package com.practice.DesignModeUsage.serviceDesignMode.proxy_mode;

public class ForumPermissions implements Cacheable{

    private final boolean[] values = {true, false, false, true};

    /**
     *  Permission to read object
     */
    public static final int READ = 0;

    /**
     *  Permission to administer the entire system
     */
    public static final int SYSTEM_ADMIN = 1;

    /**
     *  Permission to administer a particular forum
     */
    public static final int FORUM_ADMIN = 2;

    /**
     *  Permission to administer a particular user
     */
    public static final int USER_ADMIN = 3;

    /**
     *  Permission to administer a particular group
     */
    public static final int GROUP_ADMIN = 4;

    /**
     *  Permission to moderate threads
     */
    public static final int MODERATE_THREADS = 5;

    /**
     *  Permission to create a new thread
     */
    public static final int CREATE_THREAD = 6;

    /**
     *  Permission to create a new message
     */
    public static final int CREATE_MESSAGE = 7;

    /**
     *  Permission to moderate messages
     */
    public static final int MODERATE_MESSAGES = 8;

    public boolean isSystemOrForumAdmin() {
        return (values[FORUM_ADMIN] || values[SYSTEM_ADMIN]);
    }

    public boolean get(int value) {
        return values[value];
    }
}
