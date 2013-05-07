package org.rest.spring.rest;

/**
 * Created by IntelliJ IDEA.
 * User: msuchecki
 * Date: 3/25/13
 * Time: 5:52 PM
 */
public class RestPreconditions {
    public static void checkNotNullFromRequest(CallSession callSession) {
        if(callSession == null) {
            throw new BadRequestException();
        }
    }

    public static CallSession checkNotNull(CallSession callSession) {
        if (callSession == null) {
            throw new ResourceNotFoundException();
        }
        return callSession;
    }
}
