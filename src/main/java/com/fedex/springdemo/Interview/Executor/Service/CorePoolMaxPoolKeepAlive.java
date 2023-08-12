package com.fedex.springdemo.Interview.Executor.Service;

public class CorePoolMaxPoolKeepAlive {
    //FixThreadPool- Core Pool-argument Max Pool - argument Keep Alive Time - 0
    //CachedThreadPool- Core Pool-0 Max Pool - Integer.MAX_VALUE Keep Alive Time - 60 seconds
    //If thread is idle for 60 seconds and no task is assigned to it,
    // then it will be removed from the pool.
    //ScheduledThreadPool- Core Pool-argument Max Pool - Integer.MAX_VALUE Keep Alive Time - 60 seconds
    //SingleThreadExecutor- Core Pool-1 Max Pool - 1 Keep Alive Time - 0
}
