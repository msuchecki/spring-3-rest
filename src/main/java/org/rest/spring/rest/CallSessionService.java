package org.rest.spring.rest;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: msuchecki
 * Date: 3/25/13
 * Time: 5:49 PM
 */
public interface CallSessionService {

    List<CallSession> getAll();

    CallSession getById(Long id);

    Long create(CallSession callSession);

    void deleteById(Long id);
}
