package org.rest.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: msuchecki
 * Date: 3/25/13
 * Time: 5:48 PM
 */
@Controller
@RequestMapping(value = "call-session")
final class CallSessionController {

    @Autowired
    private CallSessionService service;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public final List<CallSession> getAll() {
        return service.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public final CallSession get(@PathVariable("id") final Long id) {
        return RestPreconditions.checkNotNull(service.getById(id));
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @ResponseBody
    public final void create(@RequestBody final CallSession entity) {
        RestPreconditions.checkNotNullFromRequest(entity);
        service.create(entity);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public final void delete(@PathVariable("id") final Long id) {
        RestPreconditions.checkNotNull(service.getById(id));
        service.deleteById(id);
    }
}
