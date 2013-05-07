package org.rest.spring.rest;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: msuchecki
 * Date: 3/25/13
 * Time: 5:50 PM
 */
@Service
public class CallSessionServiceImpl implements CallSessionService {

    private Cache cache;

    @Autowired
    private CacheManager cacheManager;

    @PostConstruct
    public void initializeCache() {
        cache = cacheManager.getCache("sampleCacheAsync");
    }

    @Override
    public List<CallSession> getAll() {
        List<CallSession> values = new ArrayList<>();
        Map<Object, Element> all = cache.getAll(cache.getKeys());
        for (Element element : all.values()) {
            values.add((CallSession) element.getObjectValue());
        }
        return values;
    }

    @Override
    public CallSession getById(Long id) {
        Element element = cache.get(id);
        if (element == null) {
            return null;
        }
        return (CallSession) element.getObjectValue();
    }

    @Override
    public Long create(CallSession callSession) {
        cache.put(new Element(callSession.getCallSessionId(), callSession));
        return callSession.getCallSessionId();
    }

    @Override
    public void deleteById(Long id) {
        cache.remove(id);
    }
}
